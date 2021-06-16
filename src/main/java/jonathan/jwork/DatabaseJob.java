package jonathan.jwork;
import java.util.ArrayList;

/**
 * Class database untuk menyimpan objek job secara static pada storage sementara selama program berjalan
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class DatabaseJob {

    // listjob variable

    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;

    public static ArrayList<Job> getJobDatabase() {
        return JOB_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException {
        Job temp = null;
        for (Job element : JOB_DATABASE) {
            if (element.getId() == id) {
                temp = element;
                return temp;
            }
        }
        if (temp == null){
            throw new JobNotFoundException(id);
        }

        return temp;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId) {
        ArrayList<Job> temp = null;
        for (Job element : JOB_DATABASE) {
            if (element.getRecruiter().getId() == recruiterId) {
                if (temp == null) {
                    temp = new ArrayList<Job>();
                }
                temp.add(element);
            }
        }
        return temp;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category) {
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (category == JOB_DATABASE.get(i).getCategory()) {
                temp.add(JOB_DATABASE.get(i));
            }
        }
        return temp;
    }

    /**
     * Method to add a new Job
     * 
     * @param job
     * @return boolean value whether the Job addition is successful or not
     */
    public static boolean addJob(Job job) {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }


    public static boolean removeJob(int id) throws JobNotFoundException {
        boolean temp = false;
        for (Job element : JOB_DATABASE) {
            if (element.getId() == id) {
                JOB_DATABASE.remove(element);
                temp = true;
                return temp;
            }
        }
        throw new JobNotFoundException(id);

    }

    // Access method to fetch a specific existing Job
}

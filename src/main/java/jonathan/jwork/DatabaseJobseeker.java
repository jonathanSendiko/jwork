package jonathan.jwork;
import java.util.ArrayList;


/**
 * Class database untuk menyimpan objek jobseeker secara static pada storage sementara selama program berjalan
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class DatabaseJobseeker {

    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getDatabaseJobseeker() {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id) throws JobseekerNotFoundException {
        Jobseeker temp = null;
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (id == jobseeker.getId()) {
                temp = jobseeker;
                return temp;
            }
        }
        throw new JobseekerNotFoundException(id);
    }

    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for (Jobseeker element : JOBSEEKER_DATABASE) {
            if (element.getEmail() == jobseeker.getEmail()) {
                throw new EmailAlreadyExistsException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }

    public static boolean removeJobseeker(int id) throws JobseekerNotFoundException {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == id) {
                JOBSEEKER_DATABASE.remove(jobseeker.getId());
                return true;
            }
        }
        throw new JobseekerNotFoundException(id);
    }

    public static Jobseeker getJobseekerLogin(String email, String password){
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)) {
                return jobseeker;
            }
        }
        return null;
    }


}

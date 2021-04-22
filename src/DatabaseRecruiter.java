import java.util.ArrayList;

/**
 * Write a description of class JWork here.
 *
 * @author Jonathan
 * @version March 18 2021
 */

public class DatabaseRecruiter {

    // listjob variable
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    /**
     * Method to add a new Recruiter
     * 
     * @param recruiter
     * @return boolean value whether the Recruiter addition is successful or not
     */
    public static ArrayList<Recruiter> getRecruiterDatabase() {
        return RECRUITER_DATABASE;
    }

    /**
     * Method to remove an existing Recruiter
     * 
     * @param recruiter
     * @return boolean value whether the Recruiter removal is successful or not
     */
    public static int getLastId() {
        return lastId;
    }

    // Access method to fetch a specific existing Recruiter
    public static Recruiter getRecruiterById(int id) {
        Recruiter temp = null;
        for (Recruiter recruiter : RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                temp = recruiter;
            } else {
                temp = null;
            }
        }
        return temp;
    }

    public static boolean addRecruiter(Recruiter recruiter) {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }

    public static boolean removeRecruiter(int id) {
        boolean temp = true;
        for (Recruiter recruiter : RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                RECRUITER_DATABASE.remove(id);
                temp = true;
            } else {
                temp = false;
            }
        }
        return temp;
    }
}

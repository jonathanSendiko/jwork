/**
 * Write a description of class JWork here.
 *
 * @author Jonathan
 * @version March 18 2021
 */

public class DatabaseRecruiter {

    // listjob variable
    private String[] listRecruiter;

    // Constructor
    public DatabaseRecruiter() {

    }

    public DatabaseRecruiter(String[] listRecruiter) {
        this.listRecruiter = listRecruiter;
    }

    /**
     * Method to add a new Job
     * 
     * @param job
     * @return boolean value whether the Job addition is successful or not
     */
    public boolean addJob(Recruiter recruiter) {
        return false;
    }

    /**
     * Method to remove an existing Job
     * 
     * @param job
     * @return boolean value whether the Job removal is successful or not
     */
    public boolean removeRecruiter(Recruiter recruiter) {
        return false;
    }

    // Access method to fetch a specific existing Job
    public Recruiter getRecruiter() {
        return null;
    }

    /**
     * Access method to fetch a list of existing Job
     * 
     * @return listJob
     */
    public String[] getListRecruiter() {
        return listRecruiter;
    }
}

/**
 * Write a description of class JWork here.
 *
 * @author Jonathan
 * @version March 18 2021
 */

public class DatabaseJob {

    // listjob variable
    private String[] listJob;

    // Constructor
    public DatabaseJob() {
        listJob = new String[100];
    }

    public DatabaseJob(String[] listJob) {
        this.listJob = listJob;
    }

    /**
     * Method to add a new Job
     * 
     * @param job
     * @return boolean value whether the Job addition is successful or not
     */
    public boolean addJob(Job job) {
        return false;
    }

    /**
     * Method to remove an existing Job
     * 
     * @param job
     * @return boolean value whether the Job removal is successful or not
     */
    public boolean remove(Job job) {
        return false;
    }

    // Access method to fetch a specific existing Job
    public Job getJob() {
        return null;
    }

    /**
     * Access method to fetch a list of existing Job
     * 
     * @return listJob
     */
    public String[] getListJob() {
        return listJob;
    }
}

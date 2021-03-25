
/**
 * Write a description of class Invoice here.
 *
 * @author Jonathan
 * @version March 18 2021
 */
public class Job {
    // instance variables for the class of Job
    public int id;
    private String name;
    private int fee;
    private Recruiter recruiter;
    private JobCategory category;

    /**
     * Constructor for the Job Class
     * 
     * @param id        id of the Job Class
     * @param name      name of the Job Class
     * @param recruiter recruiter of the Job Class
     * @param fee       fee of the Job Class
     * @param category  category of the Job Class
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category) {
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.category = category;
        this.recruiter = recruiter;
    }

    /**
     * Accessor Method to get Id of the Job
     * 
     * @return id of the Job
     */

    public int getId() {
        return id;

    }

    /**
     * Accessor Method to get Id of the Job
     * 
     * @return name of the Job
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor Method to get Id of the Job
     * 
     * @return fee or salary of the Job
     */
    public int getFee() {
        return fee;
    }

    /**
     * Accessor Method to get Id of the Job
     * 
     * @return Recruiter for the Job
     */
    public Recruiter getRecruiter() {
        return recruiter;
    }

    /**
     * Accessor Method to get Id of the Job
     * 
     * @return Category of the Job
     */
    public JobCategory getCategory() {
        return category;
    }

    /**
     * Mutator Method to set the Id of the Job
     * 
     * @param id Id to replace the previous Id or a new one
     */
    public void setId(int id) {
        this.id = id;

    }

    /**
     * Mutator Method to set the Name of the Job
     * 
     * @param name name to replace the previous name or a new one
     */
    public void setName(String name) {
        this.name = name;

    }

    /**
     * Mutator Method to set the Recruiter of the Job
     * 
     * @param recruiter recruiter to replace the previous recruiter or a new one
     */
    public void setRecruiter(Recruiter recruiter) {
        this.recruiter = recruiter;

    }

    /**
     * Mutator Method to set the Fee of the Job
     * 
     * @param fee fee to replace the previous fee or a new one
     */
    public void setFee(int fee) {
        this.fee = fee;

    }

    /**
     * Mutator Method to set the Category of the Job
     * 
     * @param category category to replace the previous category or a new one
     */
    public void setCategory(JobCategory category) {
        this.category = category;

    }

    public void printData() {
        System.out.println("===================== JOB =====================");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Recruiter: " + recruiter.getName());
        System.out.println("City: " + recruiter.getLocation().getCity());
        System.out.println("Fee: " + fee);
        System.out.println("Category: " + category);

    }

}

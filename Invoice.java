
/**
 * Write a description of class Invoice here.
 *
 * @author Jonathan
 * @version March 18 2021
 */
public class Invoice {
    // instance variables for the class
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;

    /**
     * Constructor for the invoce class
     * 
     * @param id
     * @param idJob
     * @param date
     * @param totalFee
     * @param jobseeker
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker) {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
    }

    /**
     * Accessor Method to get Id of the Invoice
     * 
     * @return id of the Invoice
     */
    public int getId() {
        return id;
    }

    /**
     * Accessor Method to get IdJob of the Invoice
     * 
     * @return idJob of the Invoice
     */
    public int getIdJob() {
        return idJob;
    }

    /**
     * Accessor Method to get Date of the Invoice
     * 
     * @return date of the Invoice
     */
    public String getDate() {
        return date;
    }

    /**
     * Accessor Method to get TotalFee of the Invoice
     * 
     * @return Total Fee of the Invoice
     */
    public int getTotalFee() {
        return totalFee;
    }

    /**
     * Mutator Method to set or change Id of the Invoice
     * 
     * @param id id to set or change to
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Mutator Method to set or change IdJobs of the Invoice
     * 
     * @param idJobs idJobs to set or changeto
     */
    public void setIdJobs(int idJobs) {
        this.idJob = idJobs;
    }

    /**
     * Mutator Method to set or change Date of the Invoice
     * 
     * @param date date to set or changeto
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Mutator Method to set or change Total Fee of the Invoice
     * 
     * @param totalFee totalfee to set or changeto
     */
    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * Mutator Method to set or change Id of the Invoice
     * 
     * @return the jobseeker object
     */
    public Jobseeker getJobseeker() {
        return jobseeker;
    }

    /**
     * Mutator Method to set or change Id of the Invoice
     * 
     * @param jobseeker Set the jobseeker to chosen jobseeker object
     */
    public void setJobseeker(Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }

    public void printData() {

    }
}

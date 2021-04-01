
/**
 * Write a description of class Invoice here.
 *
 * @author Jonathan
 * @version March 18 2021
 */
public abstract class Invoice {
    // instance variables for the class
    private int id;
    private Job job;
    private String date;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;
    protected int totalFee;

    /**
     * Constructor for the invoce class
     * 
     * @param id
     * @param idJob
     * @param date
     * @param totalFee
     * @param jobseeker
     */
    public Invoice(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus) {
        this.id = id;
        this.job = job;
        this.date = date;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
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
    public Job getJob() {
        return job;
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
     * Accessor Method to get Payment Type of the Invoice
     * 
     * @return Payment Type of the Invoice
     */
    public abstract PaymentType getPaymentType();

    /**
     * Accessor Method to get invoice status of the Invoice
     * 
     * @return Invoice status of the Invoice
     */
    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
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
    public void setJob(Job job) {
        this.job = job;
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
    public abstract void setTotalFee();

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

    /**
     * Mutator Method to set or change Id of the Invoice
     * 
     * @param jobseeker Set the jobseeker to chosen jobseeker object
     */
    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public abstract void printData();
}

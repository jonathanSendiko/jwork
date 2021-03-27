
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
    private PaymentType paymentType;
    private InvoiceStatus status;

    /**
     * Constructor for the invoce class
     * 
     * @param id
     * @param idJob
     * @param date
     * @param totalFee
     * @param jobseeker
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType,
            InvoiceStatus status) {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.status = status;
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
     * Accessor Method to get Payment Type of the Invoice
     * 
     * @return Payment Type of the Invoice
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Accessor Method to get invoice status of the Invoice
     * 
     * @return Invoice status of the Invoice
     */
    public InvoiceStatus getInvoiceStatus() {
        return status;
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

    /**
     * Mutator Method to set or change Id of the Invoice
     * 
     * @param jobseeker Set the jobseeker to chosen jobseeker object
     */
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Mutator Method to set or change Id of the Invoice
     * 
     * @param jobseeker Set the jobseeker to chosen jobseeker object
     */
    public void setInvoiceStatus(InvoiceStatus status) {
        this.status = status;
    }

    public void printData() {
        System.out.println("===================== INVOICE =====================");
        System.out.println("ID: " + id);
        System.out.println("ID Job: " + idJob);
        System.out.println("Date: " + date);
        System.out.println("Seeker: " + jobseeker.getName());
        System.out.println("Fee: " + totalFee);
        System.out.println("Status: " + status);
    }
}

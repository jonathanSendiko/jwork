package jonathan.jwork;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

/**
 * Class Objek Bonus
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */

public abstract class Invoice {
    // instance variables for the class
    private int id;
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor for the invoce class
     * 
     * @param id
     * @param idJob
     * @param date
     * @param totalFee
     * @param jobseeker
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        this.id = id;
        this.jobs = jobs;
        this.date = Calendar.getInstance();
        this.jobseeker = jobseeker;
        this.invoiceStatus = InvoiceStatus.Ongoing;
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
    public ArrayList<Job> getJobs() {
        return jobs;
    }

    /**
     * Accessor Method to get Date of the Invoice
     * 
     * @return date of the Invoice
     */
    public Calendar getDate() {
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
    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    /**
     * Mutator Method to set or change Date of the Invoice
     * 
     * @param date date to set or changeto
     */
    public void setDate(Calendar date) {
        this.date = date;
    }

    public void setDate(int year, int month, int dayOfMonth) {
        this.date = new GregorianCalendar(year, month, dayOfMonth);
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

    public abstract String toString();
}

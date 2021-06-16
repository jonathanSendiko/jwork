package jonathan.jwork;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Class Pembuatan Invoice menggunakkan bank
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class BankPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * Constructor pembuatan invoice dengan bank payment tanpa biaya admin
     * @param id
     * @param jobs
     * @param jobseeker
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        super(id, jobs, jobseeker);
    }

    /**
     * Constructor pembuatan invoice dengan bank payment dengan biaya admin
     * @param id
     * @param jobs
     * @param jobseeker
     * @param adminFee
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee) {
        super(id, jobs, jobseeker);
        this.adminFee = adminFee;
    }


    /**
     * Setter method untuk total Fee invoice
     */
    @Override
    public void setTotalFee() {
        for (Job job : getJobs()) {
            if (adminFee != 0) {
                totalFee = job.getFee() - getAdminFee();
            } else {
                totalFee = job.getFee();
            }
        }
    }

    @Override
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    public int getAdminFee() {
        return adminFee;
    }

    public void setAdminFee(int adminFee) {
        this.adminFee = adminFee;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        String result = "";
        for (Job job : getJobs()) {
            if (adminFee != 0) {
                result.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nAdmin Fee = " + adminFee + "\nTotal Fee = " + getTotalFee()
                        + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            } else {
                result.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nTotal Fee = " + getTotalFee() + "\nStatus = "
                        + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            }
        }
        return result;
    }
}
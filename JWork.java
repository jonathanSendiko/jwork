import java.util.GregorianCalendar;

/**
 * Write a description of class JWork here.
 *
 * @author Jonathan
 * @version April 4 2021
 */
public class JWork {
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JWork
     */
    public JWork() {

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param y a sample parameter for a method
     * @return the sum of x and y
     */
    public static void main(String[] args) {
        Jobseeker jobseeker1 = new Jobseeker(101, "Jonathan", ".jonathan.sendiko@ui.ac.id", "jonathanTekkom",
                new GregorianCalendar(2000, 8, 15));
        Jobseeker jobseeker2 = new Jobseeker(101, "Jonathan", "jonathan.sendiko@ui.ac.id", "jonathanTekkom1506", 2000,
                06, 15);
        Jobseeker jobseeker3 = new Jobseeker(101, "Jonathan", "Jonathan.sendiko@gmail.com", "jonathanTekkom1506");

        System.out.println(jobseeker1.toString() + "\n");
        System.out.println(jobseeker2.toString() + "\n");
        System.out.println(jobseeker3.toString() + "\n");

        jobseeker1.setEmail("jonathan.sendiko@hotmail.com");
        jobseeker1.setPassword("jonathan0804");
        System.out.println("Fixed Jobseeker1 : \n" + jobseeker1.toString());

        // Bonus bonus1 = new Bonus(120, "Teknik Komputer", 200000, 2000000, true);
        // Bonus bonus2 = new Bonus(120, "Teknik Komputer", 200000, 200000, true);
        // Location location1 = new Location("Banten", "Tangerang", "Tempat Lahir");
        // Recruiter recruiter = new Recruiter(20, "Jonathan",
        // "jonathan.sendiko@gmail.com", "085945644450", location1);
        // Job job = new Job(101, "Web Developer", recruiter, 100000000,
        // JobCategory.WebDeveloper);
        // EwalletPayment payment1 = new EwalletPayment(1, job, "1 April 2021",
        // jobseeker, InvoiceStatus.Finished);
        // EwalletPayment payment2 = new EwalletPayment(2, job, "5 April 2021",
        // jobseeker, InvoiceStatus.Finished, bonus1);
        // EwalletPayment payment3 = new EwalletPayment(3, job, "1 April 2021",
        // jobseeker, InvoiceStatus.Finished, bonus2);
        // BankPayment bank1 = new BankPayment(1, job, "3 April 2021", jobseeker,
        // InvoiceStatus.Finished);
        // BankPayment bank2 = new BankPayment(2, job, "4 April 2021", jobseeker,
        // InvoiceStatus.Finished, 20000);
    }
}

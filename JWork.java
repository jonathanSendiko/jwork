
/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        Location location1 = new Location("Banten", "Tangerang", "Tempat Lahir");
        Recruiter recruiter = new Recruiter(20, "Jonathan", "jonathan.sendiko@gmail.com", "085945644450", location1);
        Job job = new Job(101, "Web Developer", recruiter, 100000000, "Tech");
        Jobseeker jobseeker = new Jobseeker(1, "Jonathan", "jonathan@cornlearning", "jonathanTekkom", "18 Maret 2021");
        Invoice invoice = new Invoice(102, 2, "18 Maret 2021", 2, jobseeker);
        System.out.println(recruiter.getName());
        recruiter.setName("Ilham");
        System.out.println(recruiter.getName());
        job.printData();
    }
}

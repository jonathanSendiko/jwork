import java.util.ArrayList;

/**
 * Write a description of class JWork here.
 *
 * @author Jonathan
 * @version April 4 2021
 */
public class JWork extends Thread {

        // instance variables - replace the example below with your own

        /**
         * Constructor for objects of class JWork
         */
        public JWork() {

        }

        public static void main(String[] args) {
                JWork thread = new JWork();
                thread.start();
                Location location1 = new Location("Banten", "Tangerang", "Tempat Lahir");
                DatabaseRecruiter.addRecruiter(new Recruiter(1, "Jonathan",
                        "jonathan.sendiko@gmail.com", "085945644450", location1));
                System.out.println("=====================Errors===================");
                try {
                        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Jonathan",
                                        "jonathan@ui.ac.id", "JonaTekkom123", 2021, 04, 22));
                } catch (EmailAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                }
                try {
                        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Jonathan",
                                        "jonathan@ui.ac.id", "JonaTekkom123", 2021, 04, 23));
                } catch (EmailAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                }
                try {
                        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Ilham",
                                        "Ilham@ui.ac.id", "IMasdasda123", 2021, 03, 6));
                } catch (EmailAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                }
                try {
                        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Matthew",
                                "Matthew@ui.ac.id", "matthwE23", 2021, 03, 6));
                } catch (EmailAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                }

                try {
                        DatabaseBonus.addBonus(new Bonus(101, "BreathItIn", 200000, 500000, false));
                } catch (ReferralCodeAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                }
                try {
                        DatabaseBonus.addBonus(new Bonus(101, "BreathItIn", 200000, 500000, true));
                } catch (ReferralCodeAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                }

//                try {
//                        DatabaseJobseeker.removeJobseeker(24);
//                } catch (JobSeekerNotFoundException e) {
//                        System.out.println(e.getMessage());
//                }
//                try {
//                        DatabaseRecruiter.removeRecruiter(23);
//                } catch (RecruiterNotFoundException e) {
//                        System.out.println(e.getMessage());
//                }
//                try {
//                        DatabaseJob.getJobById(20);
//                } catch (JobNotFoundException e) {
//                        System.out.println(e.getMessage());
//                }
//                try {
//                        DatabaseBonus.getBonusById(21);
//                } catch (BonusNotFound bonusNotFound) {
//                        System.out.println(bonusNotFound.getMessage());
//                }

//                System.out.println("=========Database JobSeeker============");
//                System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
//
//                System.out.println("=========Database Bonus===============");
//                System.out.println(DatabaseBonus.getBonusDatabase());
                ArrayList<Job> jobs1 = new ArrayList<>();


                try {
                        jobs1.add(new Job(1, "Backend Engineer Traveloka", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
                } catch (RecruiterNotFoundException e) {
                        System.out.println(e.getMessage());
                }
                try {
                        jobs1.add(new Job(2, "Backend Engineer Tokopedia", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
                } catch (RecruiterNotFoundException e) {
                        System.out.println(e.getMessage());
                }

                try {
                        DatabaseInvoice.addInvoice(new BankPayment(DatabaseInvoice.getLastId() + 1,jobs1, DatabaseJobseeker.getJobseekerById(1), 10000));
                } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                }
                try {
                        DatabaseInvoice.addInvoice(new BankPayment(DatabaseInvoice.getLastId() + 1, jobs1, DatabaseJobseeker.getJobseekerById(1), 12000));
                } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                }

                System.out.println("\n===================Database Invoice=============");
                System.out.println(DatabaseInvoice.getInvoiceDatabase());

                System.out.println("\n===================Exception Trial==============");
                try {
                        DatabaseInvoice.removeInvoice(20);
                } catch (InvoiceNotFoundException e) {
                        System.out.println(e.getMessage());
                }
//                try {
//                        DatabaseInvoice.addInvoice(new EwalletPayment(3, jobs, DatabaseJobseeker.getJobseekerById(3)));
//                } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
//                        System.out.println(e.getMessage());
//                }

                for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
                        new Thread(new FeeCalculator(invoice)).start();
                }
        }
}

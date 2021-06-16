package jonathan.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class JWork {
        public static void main(String[] args) {
                Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Tanah Abang");
                DatabaseRecruiter.addRecruiter(new Recruiter(1, "Jona", "jona@example.com", "123123123", location1));
                DatabaseRecruiter.addRecruiter(new Recruiter(2, "Jonathan", "jonathan@example.com", "123123123", location1));
                try {
                        DatabaseBonus.addBonus(new Bonus(1, "Halo", 10000, 200000, true));
                } catch (ReferralCodeAlreadyExistsException e) {
                        e.printStackTrace();
                }
                try {
                        DatabaseJob.addJob(new Job(1, "Backend Engineer Tokopedia", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
                        DatabaseJob.addJob(new Job(2, "Frontend Engineer BukaLapak", DatabaseRecruiter.getRecruiterById(1), 300000, JobCategory.FrontEnd));
                        DatabaseJob.addJob(new Job(3, "Frontend Engineer", DatabaseRecruiter.getRecruiterById(2), 200000, JobCategory.FrontEnd));
                }
                catch(RecruiterNotFoundException e){
                        e.printStackTrace();
                }
                SpringApplication.run(JWork.class, args);
        }

}
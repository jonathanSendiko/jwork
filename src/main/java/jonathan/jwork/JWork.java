package jonathan.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class JWork {


        public static void main(String[] args) {
                Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Tanah Abang");
                Location location2 = new Location("Jawa Barat", "Bandung Barat", "Asia Afrika");
                Location location3 = new Location("Jawa Timur", "Surabaya Timur", "Jalan jalan");
                DatabaseRecruiter.addRecruiter(new Recruiter(1, "Jona", "jona@example.com", "123123123", location1));
                DatabaseRecruiter.addRecruiter(new Recruiter(2, "Jonathan", "jonathan@example.com", "511343235", location2));
                DatabaseRecruiter.addRecruiter(new Recruiter(3, "Jonathanss", "jonathanss@example.com", "123126163123", location3));
                try {
                        DatabaseJob.addJob(new Job(1, "Backend Engineer Tokopedia", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
                        DatabaseJob.addJob(new Job(2, "Frontend Engineer BukaLapak", DatabaseRecruiter.getRecruiterById(2), 10000, JobCategory.FrontEnd));
                        DatabaseJob.addJob(new Job(3, "UI Engineer Tokopedia", DatabaseRecruiter.getRecruiterById(2), 10000, JobCategory.UI));
                        DatabaseJob.addJob(new Job(4, "UI Engineer Gojek", DatabaseRecruiter.getRecruiterById(3), 10000, JobCategory.UI));
                }
                catch(RecruiterNotFoundException e){
                        e.printStackTrace();
                }
                SpringApplication.run(JWork.class, args);
        }

}
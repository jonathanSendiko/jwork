package jonathan.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class JWork {


        public static void main(String[] args) {
                Location location1 = new Location("Banten", "Tangerang", "Tempat Tinggal");
                Location location2 = new Location("DKI Jakarta", "Jakarta", "Kampus");
                Location location3 = new Location("Jawa Barat", "Bandung", "Kantor");
                DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Jonathan", "jonathan.sendiko@gmail.com", "085945644450",location1));
                DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Jona", "jonathan.sendiko@hotmail.com", "085945644450",location2));
                DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Jonas", "jonathan.sendiko@ymail.com", "085945644450",location3));
                try {
                        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,"Backend Engineer",DatabaseRecruiter.getRecruiterById(1),100000,JobCategory.BackEnd));
                        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,"Frontend Engineer",DatabaseRecruiter.getRecruiterById(1),100000,JobCategory.FrontEnd));
                        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,"Data Analyst Tokped",DatabaseRecruiter.getRecruiterById(2),100000,JobCategory.DataAnalyst));
                        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,"Data Analyst Shopee",DatabaseRecruiter.getRecruiterById(3),100000,JobCategory.DataAnalyst));
                } catch (RecruiterNotFoundException e) {
                        e.getMessage();
                }

                SpringApplication.run(JWork.class, args);
        }

}
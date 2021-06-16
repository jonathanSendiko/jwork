package jonathan.jwork;

import javax.xml.crypto.Data;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * Class database untuk menyimpan objek jobseeker dari database postgresql melalui query
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class DatabaseJobseekerPostgre {
    private static Connection c = null;
    private static Statement stmt = null;

    /**
     * add jobseeker
     * @param jobseeker
     * @return
     */
    public static Jobseeker addJobseeker (Jobseeker jobseeker) {
        c = DatabaseConnectionPostgre.connection();
        try {
            stmt = c.createStatement();
            int id = jobseeker.getId();
            String name = jobseeker.getName();
            String email = jobseeker.getEmail();
            String password = jobseeker.getPassword();
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, 1);

            Date date = cal.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(date);

            String query =  "INSERT INTO jobseeker (id, name, email, password, join_date)"
                    + "VALUES (" + id + ",'" + name + "','"+ email + "','"+ password + "','" + date1 + "');";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
            return null;
        }
        return jobseeker;
    }


    /**
     * getter to obtain last id
     * @return
     */
    public static int getLastJobseekerId() {
        int value = 0;
        c = DatabaseConnectionPostgre.connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX (id) FROM jobseeker;");
            while (rs.next()) {
                value = rs.getInt("max");
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }

    /**
     * Method to obtain jobseeker by id
     * @param id
     *
     */
    public static Jobseeker getJobseekerById(int id) {
        Jobseeker value = null;
        c = DatabaseConnectionPostgre.connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM jobseeker WHERE id = "+ id + ";");
            while (rs.next()) {
                id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("join_date");
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(joinDate);
                String password = rs.getString("password");
                value = new Jobseeker(id, name, email, password, calendar);
            }
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }

    /**
     * Method for deleting jobseekr data based on id
     * @param id
     *
     */
    public static boolean removeJobseeker(int id) {
        c = DatabaseConnectionPostgre.connection();
        try {
            stmt = c.createStatement();
            String query = "DELETE * FROM jobseeker WHERE id = \"+id+\";\"";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return true;
    }

    /**
     * Method to obtain  jobseeker data from login info
     * @param emailParam
     * @param passwordParam
     *
     */
    public static Jobseeker getJobseekerLogin(String emailParam, String passwordParam) {
        Connection c = DatabaseConnectionPostgre.connection();
        PreparedStatement stmt;
        Jobseeker jobseeker;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        String date;
        Calendar cal = null;
        try {
            c.setAutoCommit(false);
            String sql = "SELECT * FROM jobseeker WHERE email = '" + emailParam + "' AND password = '" + passwordParam + "';";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                password = rs.getString("password");
                date = rs.getString("join_date");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                cal = Calendar.getInstance();
                cal.setTime(sdf.parse(date));
            }
            rs.close();
            stmt.close();
            c.close();
            //Check if response is null
            if (id == 0) {
                return null;
            } else {
                jobseeker = new Jobseeker(id, name, email, password, cal);
                return jobseeker;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Method to obtain all jobseeker data on database
     *
     */
    public static ArrayList<Jobseeker> getJobseekerDatabase() {
        ArrayList<Jobseeker> jobseekers = new ArrayList<>();
        Jobseeker value = null;
        Connection c = DatabaseConnectionPostgre.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM jobseeker;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("join_date");
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(joinDate);
                String password = rs.getString("password");
                value = new Jobseeker(id, name, email, password, calendar);
                jobseekers.add(value);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return jobseekers;
    }
}

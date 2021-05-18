package jonathan.jwork;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jobseeker {
    // instance variables for the Jobseeker
    private int id;
    private String name;
    private String email;
    private String password;
    public Calendar joinDate;

    /**
     * Constructor for the Jobseeker Class
     * 
     * @param id       id of the Jobseeker who wants to register
     * @param name     name of the Jobseeker who wants to register
     * @param email    email of the Jobseeker who wants to register
     * @param password password of the Jobseeker who wants to register
     * @param joinDate date of the Jobseeker who wants to register
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }

    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);

    }

    public Jobseeker(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);

    }

    /**
     * Accessor method to get the Id of the Jobseeker
     * 
     * @return id of the Jobseeker
     */
    public int getId() {
        return id;
    }

    /**
     * Accessor method to get the Name of the Jobseeker
     * 
     * @return name of the Jobseeker
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor method to get the email of the Jobseeker
     * 
     * @return email of the Jobseeker
     */
    public String getEmail() {
        return email;
    }

    /**
     * Accessor method to get the password of the Jobseeker
     * 
     * @return password of the Jobseeker
     */
    public String getPassword() {
        return password;
    }

    /**
     * Accessor method to get the date of the Jobseeker joined
     * 
     * @return date of the Jobseeker joined
     */
    public Calendar getJoinDate() {
        return joinDate;
    }

    /**
     * Mutator Method to set or change the id of the Jobseeker
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Mutator Method to set or change the name of the Jobseeker
     * 
     * @param name new name of the Jobseeker
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mutator Method to set or change the email of the Jobseeker
     * 
     * @param email new email of the Jobseeker
     */
    public void setEmail(String email) {
        String regex = "^[a-zA-Z0-9&*_~]+([\\.{1}]?[a-z]+)+@[a-z0-9]+([\\.]{1}[a-z]+)\\S+(?!.*?\\.\\.)";
        Pattern pattern1 = Pattern.compile(regex);
        Matcher matcher1 = pattern1.matcher(email);
        if (matcher1.matches()) {
            this.email = email;
        } else {
            this.email = "Email Format is invalid";
        }
    }

    /**
     * Mutator Method to set or change the password of the Jobseeker
     * 
     * @param password new password of the Jobseeker
     */
    public void setPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern1 = Pattern.compile(regex);
        Matcher matcher1 = pattern1.matcher(password);
        if (matcher1.matches()) {
            this.password = password;
        } else {
            this.password = "Password Format is invalid";
        }
    }

    /**
     * Mutator Method to set or change the date of the Jobseeker
     * 
     * @param joinDate new date of the Jobseeker joined
     */
    public void setJoinDate(Calendar joinDate) {
        this.joinDate = joinDate;
    }

    public void setJoinDate(int year, int month, int dayOfMonth) {
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    /**
     * Method to print the Name of the Jobseeker
     * 
     * @return nothing
     */
    @Override
    public String toString() {
        if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword();
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword() + "\nJoin Date = " + date;
        }

    }
}

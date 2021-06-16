package jonathan.jwork;
/**
 * Class objek untuk recruiter
 * @author Jonathan
 * @version 1.0
 * @since 10 Juni 2021
 */
public class Recruiter {
    // instance variables of the Recruiter
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor of the Recruter Class
     * 
     * @param id
     * @param name
     * @param email
     * @param phoneNumber
     * @param location
     */

    public Recruiter(int id, String name, String email, String phoneNumber, Location location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
     * Accessor Method to get the id of the Recruiter
     * 
     * @return Id of the Recruiter object
     */
    public int getId() {
        return id;
    }

    /**
     * Accessor Method to get the name of the Recruiter
     * 
     * @return name of the Recruiter object
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor Method to get the name of the Recruiter
     * 
     * @return name of the Recruiter object
     */

    public String getEmail() {
        return email;
    }

    /**
     * Accessor Method to get the phone number of the Recruiter
     * 
     * @return phone number of the Recruiter object
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Accessor Method to get the location of the Recruiter
     * 
     * @return location of the Recruiter object
     */

    public Location getLocation() {
        return location;
    }

    /**
     * Mutator Method to set or change id of the Recruiter
     * 
     * @param id
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Mutator Method to set or change email of the Recruiter
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Mutator Method to set or change name of the Recruiter
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mutator Method to set or change phone number of the Recruiter
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Mutator Method to set or change location of the Recruiter
     * 
     * @param location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Print the name of the Recruiter
     */
    @Override
    public String toString() {
        return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPhone Number = "
                + getPhoneNumber() + "\nLocation = " + getLocation();
    }
}

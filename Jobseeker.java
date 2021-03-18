
public class Jobseeker {
    // instance variables for the Jobseeker
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /**
     * Constructor for the Jobseeker Class
     * 
     * @param id       id of the Jobseeker who wants to register
     * @param name     name of the Jobseeker who wants to register
     * @param email    email of the Jobseeker who wants to register
     * @param password password of the Jobseeker who wants to register
     * @param joinDate date of the Jobseeker who wants to register
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
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
    public String getJoinDate() {
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
        this.email = email;
    }

    /**
     * Mutator Method to set or change the password of the Jobseeker
     * 
     * @param password new password of the Jobseeker
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Mutator Method to set or change the date of the Jobseeker
     * 
     * @param joinDate new date of the Jobseeker joined
     */
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * Method to print the Name of the Jobseeker
     * 
     * @return nothing
     */
    public void printData() {
        System.out.println(getName());
    }
}

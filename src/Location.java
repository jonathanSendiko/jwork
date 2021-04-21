
/**
 * Write a description of class Location here.
 *
 * @author Jonathan
 * @version March 18 2021
 */
public class Location {
    // instance variables of the Location
    private String province;
    private String city;
    private String description;

    /**
     * Constructor for the Location Class
     * 
     * @param province    province of the new Location
     * @param city        city of the new Location
     * @param description description of the new Location
     */
    public Location(String province, String city, String description) {
        this.province = province;
        this.city = city;
        this.description = description;
    }

    /**
     * Accessor Method to get the Province
     * 
     * @return province of the Location
     */
    public String getProvince() {
        return province;
    }

    /**
     * Accessor Method to get the City
     * 
     * @return city of the Location
     */
    public String getCity() {
        return city;
    }

    /**
     * Accessor Method to get the Description
     * 
     * @return Description of the Location
     */
    public String getDescription() {
        return description;
    }

    /**
     * Mutator Method to set or change the Province of the Location
     * 
     * @param province new province of the location
     */

    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Mutator Method to set or change the City of the Location
     * 
     * @param city new city of the location
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Mutator Method to set or change the Description of the Location
     * 
     * @param description new description of the location
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * print the province of the Location
     */
    @Override
    public String toString() {
        return "Province = " + getProvince() + "\nCity = " + getCity() + "\nDescription = " + getDescription();
    }
}

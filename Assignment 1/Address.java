/**
 * Class Address contains variables like postalCode and streetName to hold an address.
 * 
 * @version 18-02-2016
 * @author IsaacL
 */
public class Address {
    private String streetNumber;
    private String streetName;
    private String city;
    private String postalCode;
    

    /**
     * Address Constructor
     *
     * @param streetNumber defaulted to ""
     * @param streetName defaulted to ""
     * @param city defaulted to ""
     * @param postalCode defaulted to ""
     */
    public Address() {
        setStreetNumber("");
        setStreetName("");
        setCity("");
        setPostalCode("");
    }
    
    /**
     * Address Constructor
     *
     * @param streetNumber street's number
     * @param streetName street's name
     * @param city name of city
     * @param postalCode postal code
     */
    public Address(String streetNumber, String streetName, String city, String postalCode) {
        setStreetNumber(streetNumber);
        setStreetName(streetName);
        setCity(city);
        setPostalCode(postalCode);
    }
    
    /**
     * returns the street number
     *
     * @return the street's number
     */
    public String getStreetNumber() {
        return streetNumber;
    }
    /**
     * returns the street name
     *
     * @return the street's name
     */
    public String getStreetName() {
        return streetName;
    }
    /**
     * returns the city
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * returns the postal code
     * 
     * @return the postal code
     */public String getPostalCode() {
        return postalCode;
    }
    
    /**
     * change the street number
     *
     * @param streetNumber the street's number
     */
    public void setStreetNumber(String streetNumber) {
        if(streetNumber != null) {
            this.streetNumber = streetNumber;
        }
    }
    /**
     * change the street name
     *
     * @param streetName the street's name
     */
    public void setStreetName(String streetName) {
        if(streetName != null) {
            this.streetName = streetName;
        }
    }
    /**
     * change the city
     *
     * @param city the city
     */
    public void setCity(String city) {
        if(city != null) {
            this.city = city;
        }
    }
    /**
     * change the postal code
     *
     * @param postalCode the postal code
     */
    public void setPostalCode(String postalCode) {
        if(postalCode != null) {
            this.postalCode = postalCode;
        }
    }
}
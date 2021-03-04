
/**
 * Address Class
 *
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-3
 */
public class Address {

    /**
     * private int attribute
     */
    private int streetNum;
    
    /**
     * private String attribute
     */
    private String streetName;
    
    /**
     * private String attribute
     */
    private String city;
    
    /**
     * private String attribute
     */
    private String zip;
    
    /**
     * private String attribute
     */
    private String state;
    
    /**
     * Default constructor for an Address 
     * 
     * @param streetNum
     * @param streetName
     * @param city
     * @param zip
     * @param state 
     */
    public Address(int streetNum, String streetName, String city, String state, String zip){
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    /**
     * 
     * @param streetNum 
     */
    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }
    
    /**
     * 
     * @param streetName 
     */
    public void setStreetName(String streetName){
        this.streetName = streetName;
    }
    
    /**
     * 
     * @param city 
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    /**
     * 
     * @param zip 
     */
    public void setZip(String zip) {
        this.zip = zip;
    }
    
    /**
     * 
     * @param state 
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * 
     * @return street number
     */
    public int getStreetNum() {
        return streetNum;
    }
    
    /**
     * 
     * @return name of the street
     */
    public String getStreetName() {
        return streetName;
    }
    
    /**
     * 
     * @return name of city
     */
    public String getCity(){
        return city;
    }
    
    /**
     * 
     * @return zip code
     */
    public String getZip() {
        return zip;
    }
    
    /**
     * 
     * @return name of state
     */
    public String getState() {
        return state;
    }
    
    @Override
    public String toString() {
        return "Street Number: " + streetNum + "\nStreet Name: " + streetName + "\nCity: " + city + "\nState " + state + "\nZip Code: " + zip;
    }
}

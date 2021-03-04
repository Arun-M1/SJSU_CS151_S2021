/**
 *  Full time employee paid hourly class
 * 
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-3
 */
public class FullTimeHourly extends FullTimeEmployee {

    /**
     * private double attribute
     */
    private double overtimePay;
    
    /**
     * Default constructor for a full time employee paid hourly
     */
    public FullTimeHourly(){  
    }
    
    /**
     * Constructor for a full time employee paid hourly taking in a first name, last name, address, an ID, their base pay, hourly overtime pay rate, and a social security number
     * 
     * @param firstName
     * @param lastName
     * @param address
     * @param id
     * @param basePay
     * @param overtime 
     * @param ssn 
     */
    public FullTimeHourly(String firstName, String lastName, Address address, int id, double basePay, double overtime, String ssn) {
        super(firstName, lastName, address, id, basePay, ssn);
        this.overtimePay = overtime;
    }
    
    /**
     * @param overtimePay the overtimePay to set
     */
    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }
    
    /**
     * @return the overtimePay
     */
    public double getOvertimePay() {
        return overtimePay;
    }
    
    /**
     * 
     * @return string form of information for a full time employee paid hourly
     */
    @Override
    public String toString() {
        return super.toString();
    }
    
    /**
     * prints information of a full time employee paid hourly
     * 
     * @param displaySSN 
     */
    @Override
    public void introduce(boolean displaySSN) {
        super.introduce(displaySSN);
    }
    
    public double computePay(int numHrs) {
        double basePay = this.getBasePay();
        if(numHrs > 40) {
            return (basePay * (double)numHrs) + (overtimePay * (double)(numHrs - 40));
        }
        return (basePay * (double)numHrs);
    }

}

/**
 *  Part time employee paid hourly class
 * 
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-3
 */
public class PartTimeHourly extends Employee {

    /**
     * private double attribute
     */
    private double baseHourlyPay;
    
    /**
     * Constructor for a part timer taking in a first name, last name, address, an ID, payment, and a social security number
     * 
     * @param firstName
     * @param lastName
     * @param address
     * @param id
     * @param pay 
     * @param ssn 
     */
    public PartTimeHourly(String firstName, String lastName, Address address, int id, double pay, String ssn) {
        super(firstName, lastName, address, id, ssn);
        this.baseHourlyPay = pay;
    }
    
    /**
     * @param baseHourlyPay 
     */
    public void setBaseHourlyPay(double baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }
    
    /**
     * @return the base hourly pay
     */
    public double getBaseHourlyPay() {
        return baseHourlyPay;
    }
    
    /**
     * 
     * @return string of part timer information
     */
    @Override
    public String toString() {
        return super.toString();
    }
    
    /**
     * prints out the executive's information
     * 
     * @param displaySSN 
     */
    @Override
    public void introduce(boolean displaySSN) {
        super.introduce(displaySSN);
    }
    
    /**
     * computes the salary of a part timer
     * 
     * @param numHrs
     * @return the computed salary of a part timer
     */
    public double computePay(int numHrs) {
        if(numHrs > 40) {
            return -1;
        }
        return baseHourlyPay * numHrs;
    }

}

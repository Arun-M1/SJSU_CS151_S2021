/**
 * Full time employee class
 *
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-3
 */
public abstract class FullTimeEmployee extends Employee {
 
    /**
     * private double attribute
     */
    private double basePay;
    
    /**
     * default constructor for a full time employee
     */
    public FullTimeEmployee() {
    }
    
    /**
     * Constructor for a full time employee that takes in a first name, last name, address, ID, and a social security number
     * 
     * @param firstName
     * @param lastName
     * @param address
     * @param id 
     * @param basePay 
     * @param ssn 
     */
    public FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay, String ssn) {
        super(firstName, lastName, address, id, ssn); 
        this.basePay = basePay;
    }
    
    /**
     * @param basePay 
     */
    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }
    
    /**
     * @return the base pay
     */
    public double getBasePay() {
        return basePay;
    }
}

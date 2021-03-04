/**
 * Full time employee with paid salary class
 * 
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-3
 */
public class FullTimeSalaried extends FullTimeEmployee {
    
    /**
     * Default constructor for a full time employee with paid salary
     */
    public FullTimeSalaried() {
    }
    
    /**
     * Constructor for a full time employee with paid salary taking in a first name, last name, address, an ID, their base pay, hourly overtime pay rate, and a social security number
     * 
     * @param firstName
     * @param lastName
     * @param add
     * @param id
     * @param salary 
     * @param ssn 
     */
    public FullTimeSalaried(String firstName, String lastName, Address add, int id, double salary, String ssn) {
        super(firstName, lastName, add, id, salary, ssn);
    }
    
    /**
     * 
     * @return string form of full time employee with paid salary information
     */
    @Override
    public String toString() {
        return super.toString();
    }
    
    /**
     * 
     * @param displaySSN 
     */
    @Override
    public void introduce(boolean displaySSN) {
        super.introduce(displaySSN);
    }
    
    /**
     * 
     * @param numWeeks
     * @return computed salary based off number of weeks worked
     */
    public double computePay(int numWeeks) {
        return this.getBasePay() * ((double)(1) / (double)(52)) * (double)numWeeks;
    }
}

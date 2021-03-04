/**
 * Executive Class
 * 
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-3
 */
public class Executive extends Employee {

    /**
     * private double attribute
     */
    private double yearlyBonus;
    
    /**
     * private double attribute
     */
    private double yearlyCompensation;
    
    /**
     * Default constructor for an executive
     */
    public Executive() {
    }
    
    /**
     * Constructor for an executive that takes a first name, last name, address, ID, pay, bonus, and a social security number
     * 
     * @param firstName
     * @param lastName
     * @param address
     * @param id 
     * @param pay 
     * @param bonus 
     * @param ssn 
     */
    public Executive(String firstName, String lastName, Address address, int id, double pay, double bonus, String ssn) {
        super(firstName, lastName, address, id, ssn);
        this.yearlyCompensation = pay;
        this.yearlyBonus = bonus;
    }
    
    /**
     * @param yearlyBonus 
     */
    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    /**
     * @param yearlyCompensation 
     */
    public void setYearlyCompensation(double yearlyCompensation) {
        this.yearlyCompensation = yearlyCompensation;
    }
    
    /**
     * @return the yearly Bonus
     */
    public double getYearlyBonus() {
        return yearlyBonus;
    }

    /**
     * @return the yearly Compensation
     */
    public double getYearlyCompensation() {
        return yearlyCompensation;
    }
    
    /**
     * 
     * @return string of its information
     */
    @Override
    public String toString() {
        return super.toString();
    }
    
    /**
     * prints information of an executive
     * 
     * @param displaySSN 
     */
    @Override
    public void introduce(boolean displaySSN){
        super.introduce(displaySSN);
        System.out.println("Yearly Bonus: " + yearlyBonus + "\nYearly Compensation " + yearlyCompensation);
    }
    
    /**
     * 
     * @return computation for pay
     */
    public double computePay() {
        return yearlyCompensation + yearlyBonus;
    }
    
}

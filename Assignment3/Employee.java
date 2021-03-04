/**
 * Employee Class
 * 
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-3
 */
public abstract class Employee extends Person {

    /**
     * private int attribute
     */
    private int id;
    
    /**
     * private String attribute
     */
    private String educationLevel;
    
    /**
     * private boolean attribute
     */
    private boolean directDeposit;
    
    /**
     * Default constructor for an employee
     */
    public Employee() {
    }
    
    /**
     * Constructor for an employee that takes a first name, last name, address, ID, and a social security number
     * 
     * @param firstName
     * @param lastName
     * @param address
     * @param id 
     * @param ssn 
     */
    public Employee(String firstName, String lastName, Address address, int id, String ssn) {
        super(firstName, lastName, address, ssn);
        this.id = id;
    }
    
    /**
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param educationLevel 
     */
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    /**
     * @param directDeposit 
     */
    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
    }
    
    /**
     * @return the employee's id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the education Level
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * @return if it is direct deposit
     */
    public boolean isDirectDeposit() {
        return directDeposit;
    }    
}


/**
 * Employee class
 *
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-15
 */
public class Employee {

    /**
     * private String attribute
     */
    private String firstName;

    /**
     * private String attribute
     */
    private String lastName;

    /**
     * private int attribute
     */
    private int id;

    /**
     * private double attribute
     */
    private double hourlyPay;

    public Employee(String firstName, String lastName, int id, double hourlyPay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param hourlyPay
     */
    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    /**
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the hourly pay
     */
    public double getHourlyPay() {
        return hourlyPay;
    }

    /**
     * Method that calculates the total pay of an employee, catches exception if user fails to type correct hour value
     * 
     * @param numHours
     * @return the pay of the employee
     */
    public double computePay(int numHours) {
        double pay = 0;
        try {
            if(numHours < 0) {
                throw new NumberFormatException();
            } else if(numHours > 40) {
                throw new TooManyHoursWorkedException("Hours needs to be 40 or less.");
            } else {
                pay = hourlyPay * numHours;
            }
        } catch(NumberFormatException e) {
            System.out.println("Hours has to be positive.");
            System.out.println("Reason: " + e);
        } catch(TooManyHoursWorkedException e) {
            System.out.println(e);
        }
        return pay;
    }
}

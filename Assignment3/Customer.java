/**
 * Customer Class
 * 
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-3
 */
public class Customer extends Person {
    
    /**
     * private int attribute
     */
     private int customerID;
     
     /**
      * private String attribute
      */
     private String payPreference;
     
     /**
      * Default constructor for a customer
      */
     public Customer() {
     }
     
     /**
      * Constructor for a customer that takes in a first name, last name, address, ID, and a social security number
      * 
      * @param firstName
      * @param lastName
      * @param address
      * @param id 
     * @param ssn 
      */
     public Customer(String firstName, String lastName, Address address, int id, String ssn) {
         super(firstName, lastName, address, ssn);
         this.customerID = id;
         this.payPreference = "Credit Card";
     }
 
     /**
     * @param customerID
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @param payPreference 
     */
    public void setPayPreference(String payPreference) {
        this.payPreference = payPreference;
    }
    
    /**
     * @return the customer ID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @return the payment preference
     */
    public String getPayPreference() {
        return payPreference;
    }
    
    /**
     * 
     * @return String of its information
     */
     @Override
    public String toString() {
        return super.toString();
    }
    
    /**
     * method that overrides toString of person and prints its own information
     * 
     * @param displaySSN 
     */
     @Override
    public void introduce(boolean displaySSN) {
        super.introduce(displaySSN);
        System.out.println("Customer ID: " + customerID + "\nPayment Preference: " + payPreference);
    }
    
    /**
     * method that prints the customer's preferred payment method
     */
    public void makePayment() {
        System.out.println("My payment method is " + payPreference);
    }
}

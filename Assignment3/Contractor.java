/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Murugan
 */
public class Contractor extends Employee {
    
    /**
     * private double attribute
     */
    private double basePay;
    
    /**
     * Default constructor for a Contractor
     */
    public Contractor() {
    }
    
    /**
     * Constructor for a Contractor that takes in a first name, last name, address, ID, base pay, and social security number
     * 
     * @param firstName
     * @param lastName
     * @param address
     * @param id
     * @param pay
     * @param ssn 
     */
    public Contractor(String firstName, String lastName, Address address, int id, double pay, String ssn) {
        super(firstName, lastName, address, id, ssn);
        this.basePay = pay;
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
    
    /**
     * 
     * @return string of its information
     */
    @Override
    public String toString() {
        return super.toString();
    }
    
    /**
     * prints information of a contractor
     * 
     * @param displaySSN 
     */
    @Override
    public void introduce(boolean displaySSN) {
        super.introduce(displaySSN);
        System.out.println("Base Pay: " + basePay);
    }
    
    public double computePay(int numHrs) {
        return basePay * (double)numHrs;
    }
}

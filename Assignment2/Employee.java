/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Murugan
 */
public class Employee extends Person {
    
    private int id;
    private String status;
    private double basePay;

    public Employee(String firstName, String lastName, int age, String ssn, String address, String gender, double weight, int id, String status, double basePay) {
        super(firstName, lastName, age, ssn, address, gender, weight);
        this.id = id;
        this.status = status;
        this.basePay = basePay;
    }
    
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @param basePay the basePay to set
     */
    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }
    
    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public double getBasePay() {
        return basePay;
    }

    public double calculatePay(double unitsWorked) {
        double payCheck = 0;
        setStatus(status.toLowerCase());
        if (status.equalsIgnoreCase("fulltime")) {
            double weeks = ((double)1/(double)52);
            payCheck = basePay * weeks * unitsWorked;
        } else {
            payCheck = basePay * unitsWorked;
        }
        return payCheck;
    }
    
    //Override Person introdue method
    @Override
   public void introduce() {
       super.introduce();
       System.out.println("Employee Id: " + id);
       System.out.println("Employee Status: " + status);
       System.out.printf("Employee Base Pay: $%.2f%n", basePay);
   }
}

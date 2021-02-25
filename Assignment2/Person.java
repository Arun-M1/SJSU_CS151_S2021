/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Murugan
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private String address;
    private String gender;
    private double weight;

    public Person(String firstName, String lastName, int age, String ssn, String address, String gender, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
    }
    
    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param ssn the ssn to set
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSSN() {
        return ssn;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        //TODO: replace this with StringBuilder
        return "Name: " + firstName + " " + lastName + "\nAge: " + age + "\nSocial Security Number: " + ssn + "\nAddress: " + address + "\nGender: " + gender + "\nWeight: " + weight + " pounds";
    }

    public void introduce() {
        System.out.println(this.toString());
        /*System.out.println("First name is " + firstName);
        System.out.println("Last name is " + lastName);
        System.out.println("Age is " + age);
        System.out.println("Social Security number is " + ssn);
        System.out.println("Address is " + address);
        System.out.println("Gender is " + gender);
        System.out.println("Weight is " + weight);*/
    }
}

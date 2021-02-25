/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Murugan
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age = 0;
    private double gpa = 0.0;
    private String major;
    private String department;

    public Student(String firstName, String lastName, int age, double gpa, String major, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
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
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
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

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "First name: " + firstName + " Last name: " + lastName + " age: " + age + " years old " + " gpa: " + gpa + " major: " + major + " department: " + department;
    }

    class Course {
        void printSchedule() {
            System.out.println("CS 146: Monday/Wednesday 9 - 10:15 a.m.");
            System.out.println("CS 100W: Monday/Wednesday 12 - 1:15 p.m.");
            System.out.println("CS 147: Monday/Wednesday 4:30 - 5:45 p.m.");
            System.out.println("CS 151: Monday/Wednesday 6 - 7:15 p.m.");
            System.out.println("Math 39: Tuesday/Thursday 1:30 - 2:45");
        }
    }
}

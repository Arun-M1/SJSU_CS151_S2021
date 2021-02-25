/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Murugan
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee1 = new Employee("Joe", "Smith", 25, "928-65-730", "123 Wall Street", "Male", 135.8, 103, "contractor", 60);
        employee1.introduce();
        System.out.print(employee1.getFirstName() + " " + employee1.getLastName() + " earns $");
        System.out.printf("%.2f%n", employee1.calculatePay(30));
        
        Employee employee2 = new Employee("Lisa", "Gray", 30, "425-25-436", "456 Back Street", "Female", 120.5, 218, "fulltime", 110000);
        System.out.println();
        employee2.introduce();
        System.out.print(employee2.getFirstName() + " " + employee2.getLastName() + " earns $");
        System.out.printf("%.2f%n", employee2.calculatePay(2));
        
        Employee employee3 = new Employee("George", "Wallace", 41, "473-10-970", "789 This Street", "Male", 160, 14, "parttime", 20);
        System.out.println();
        employee3.introduce();
        System.out.print(employee3.getFirstName() + " " + employee3.getLastName() + " earns $");
        System.out.printf("%.2f%n", employee3.calculatePay(25));
        
        Employee employee4 = new Employee("Timothy", "Briggs", 21, "246-35-123", "012 That Street", "Male", 100, 137, "fulltime", 80000);
        System.out.println();
        employee4.introduce();
        System.out.print(employee4.getFirstName() + " " + employee4.getLastName() + " earns $");
        System.out.printf("%.2f%n", employee4.calculatePay(4));
        
        Employee employee5 = new Employee("Amy", "Student", 29, "123-23-234", "234 Away Street", "Female", 110, 396, "contractor", 45);
        System.out.println();
        employee5.introduce();
        System.out.print(employee5.getFirstName() + " " + employee5.getLastName() + " earns $");
        System.out.printf("%.2f%n", employee5.calculatePay(45));  
    }
    
}

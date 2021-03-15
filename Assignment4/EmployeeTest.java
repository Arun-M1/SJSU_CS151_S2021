/**
 * Driver class for Employee
 * 
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-15
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Smith", 101, 35);
        double pay = employee1.computePay(40);
        System.out.printf("$%.2f%n", pay);
        
        double pay2 = employee1.computePay(23);
        System.out.printf("$%.2f%n", pay2);
        
        double pay3 = employee1.computePay(1);
        System.out.printf("$%.2f%n", pay3); 
        
        double pay4 = employee1.computePay(0);
        System.out.printf("$%.2f%n", pay4);
        
        double pay5 = employee1.computePay(-5);
        System.out.printf("$%.2f%n", pay5); 
        
        double pay6 = employee1.computePay(45);
        System.out.printf("$%.2f%n", pay6); 
        
    }
    
}

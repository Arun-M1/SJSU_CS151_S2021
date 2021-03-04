
/**
 * Driver class for a business
 *
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-3
 */
public class BusinessTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Address address1 = new Address(3758, "Kay Ct.", "Fremont", "California", "94538");
        Address address2 = new Address(1234, "This St.", "Fremont", "California", "12345");
        
        Customer joe = new Customer("Joe", "Smith", address1, 3456, "123-45-678");
        joe.introduce(false);
        joe.makePayment();
        System.out.println();
        
        Customer sam = new Customer("Sam", "Smith", address1, 3456, "123-45-678");
        sam.introduce(false);
        sam.makePayment();
        System.out.println();
        
        Executive lily = new Executive("Lily", "Wilson", address2, 1234, 30000, 2000, "234-56-789");
        lily.introduce(true);
        System.out.printf("Executive pay: $%.2f%n", lily.computePay());
        System.out.println();
        
        Executive yetty = new Executive("Yetty", "Wilson", address2, 1234, 30000, 2000, "234-56-789");
        yetty.introduce(true);
        System.out.printf("Executive pay: $%.2f%n", yetty.computePay());
        System.out.println();
        
        Contractor poppy = new Contractor("Poppy", "Small", address1, 2345, 45, "345-67-890");
        poppy.introduce(true);
        System.out.printf("Contractor pay: $%.2f%n", poppy.computePay(6));
        System.out.println();
        
        Contractor krabs = new Contractor("Krabs", "Small", address1, 2345, 45, "345-67-890");
        krabs.introduce(true);
        System.out.printf("Contractor pay: $%.2f%n", krabs.computePay(6));
        System.out.println();
        
        FullTimeHourly max = new FullTimeHourly("Max", "Might", address1, 3456, 14, 8, "456-67-789");
        max.introduce(true);
        System.out.printf("Full time hourly pay: $%.2f%n", max.computePay(8));
        System.out.println();
        
        FullTimeHourly mike = new FullTimeHourly("Mike", "Might", address1, 3456, 14, 8, "456-67-789");
        mike.introduce(true);
        System.out.printf("Full time hourly pay: $%.2f%n", mike.computePay(8));
        System.out.println();
        
        FullTimeSalaried george = new FullTimeSalaried("George", "Ley", address1, 4567, 80000, "012-34-567");
        george.introduce(true);
        System.out.printf("Full time salaried pay: $%.2f%n", george.computePay(17));
        System.out.println();
        
        FullTimeSalaried graves = new FullTimeSalaried("Graves", "Ley", address1, 4567, 80000, "012-34-567");
        graves.introduce(true);
        System.out.printf("Full time salaried pay: $%.2f%n", graves.computePay(17));
        System.out.println();
        
        PartTimeHourly fuuma = new PartTimeHourly("Fuuma", "Kotarou", address2, 5678, 12, "231-23-123");
        fuuma.introduce(true);
        System.out.printf("part time hourly pay: $%.2f%n", fuuma.computePay(17));
        System.out.println(); 
        
        PartTimeHourly asaka = new PartTimeHourly("Asaka", "Yagoo", address2, 5678, 12, "231-23-123");
        asaka.introduce(true);
        System.out.printf("part time hourly pay: $%.2f%n", asaka.computePay(17));
        System.out.println(); 
    }
}
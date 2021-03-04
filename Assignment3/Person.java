/**
 * Person class
 * 
 * @author Arun Murugan
 * Version 1.03-3
 */
public abstract class Person {
    
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
    private int age;
    
    /**
     * private String attribute
     */
    private String ssn;
    
    /**
     * private Address object attribute
     */
    private Address address;
    
    /**
     * Default constructor for a person
     */
    public Person() {
    }
    
    /**
     * Constructor for a person that takes a first name, last name, address, and a social security number
     * 
     * @param firstName
     * @param lastName
     * @param address 
     */
    public Person(String firstName, String lastName, Address address, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = 25;
        this.ssn = ssn;
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
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param ssn
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }
    
    /**
     * Method checks if this instance is a customer before returning information
     * 
     * @return Person's information in string form
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First name: ");
        sb.append(firstName);
        sb.append("\nLast name: ");
        sb.append(lastName);
        sb.append("\nAge: ");
        sb.append(age);
        sb.append("\nAddress: ");
        sb.append(address);
        return sb.toString();
    }
    
    /**
     * Checks if person is customer before printing information
     * 
     * @param displaySSN 
     */
    public void introduce(boolean displaySSN) {
        if(!displaySSN) {
            System.out.println(this.toString());
        } else {
             System.out.println(this.toString() + "\nSSN: " + ssn);
        }
    }
}

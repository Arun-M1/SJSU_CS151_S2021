
/**
 * Person class
 * 
 * @author Arun Murugan
 * Version 1.0
 * @since 24-3-2021
 */
public class Person {
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
     * private double attribute
     */
    
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("first name: ");
        sb.append(firstName);
        sb.append(" last name: ");
        sb.append(lastName);
        sb.append(" age: ");
        sb.append(age);
        return sb.toString();
    }
}


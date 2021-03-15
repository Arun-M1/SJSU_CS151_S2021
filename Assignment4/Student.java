/**
 * Student Class
 * 
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-15
 */
public class Student implements Cloneable {

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
    private double gpa;
    
    /**
     * private String attribute
     */
    private String major; 
    
    /**
     * private String attribute
     */
    private String department;
    
    /**
     * private Course attribute
     */
    private Course course;
    
    public Student(String firstName, String lastName, int age, double gpa, String major, String department, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.course = course;
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
     * @param gpa 
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * @param major 
     */
    public void setMajor(String major) {
        this.major = major;
    }
    
    /**
     * @param department 
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @param course 
     */
    public void setCourse(Course course) {
        this.course = course;
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

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @return the course
     */
    public Course getCourse() {
        return course;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }
    
    public void printInfo() {
        System.out.println("Name: " + firstName + " " + lastName + "\nAge: " + age + "\nGpa: " + gpa + "\nMajor: " + major + "\nDepartment: " + department + "\nCourse: " + course);
        System.out.println();
    }
   
}

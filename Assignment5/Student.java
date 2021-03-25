import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Student class
 *
 * @author Arun Murugan Version 1.0
 * @since 24-3-2021
 */
public class Student {

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
     * private LinkedList attribute
     */
    private List<Course> courses = new LinkedList<Course>();

    /**
     * Constructor for a student
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param gpa
     * @param major
     * @param department
     * @param courses
     */
    public Student(String firstName, String lastName, int age, double gpa, String major, String department, List<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.courses = courses;
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
     * @param courses
     */
    public void setCourse(List<Course> courses) {
        this.courses = courses;
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
     *
     * @return list of courses
     */
    public List<Course> getCourses() {
        return courses;
    }

    /**
     * add a course to the list
     *
     * @param course
     */
    public void addCourse(Course course) {
        this.displayCourses();
        courses.add(course);
        this.displayCourses();
    }

    /**
     * remove a course from the list
     *
     * @param course
     */
    public void removeCourse(Course course) {
        this.displayCourses();
        courses.remove((course));
        this.displayCourses();
    }

    public void sortCourses(String order, String sortBy) {
        switch (sortBy.toLowerCase()) {
            case "name":
                if (order.equalsIgnoreCase("descending")) {
                    courses.sort(Comparator.comparing(Course::getName).reversed());
                } else {
                    courses.sort(Comparator.comparing(Course::getName));
                }
                break;
            case "description":
                if (order.equalsIgnoreCase("descending")) {
                    courses.sort(Comparator.comparing(Course::getDescription).reversed());
                } else {
                    courses.sort(Comparator.comparing(Course::getDescription));
                }
                break;
            case "department":
                if (order.equalsIgnoreCase("descending")) {
                    courses.sort(Comparator.comparing(Course::getDepartment).reversed());
                } else {
                    courses.sort(Comparator.comparing(Course::getDepartment));
                }
                break;
            case "time":
                if (order.equalsIgnoreCase("descending")) {
                    courses.sort(Comparator.comparing(Course::getTime).reversed());
                } else {
                    courses.sort(Comparator.comparing(Course::getTime));
                }
                break;
            case "weekday":
                if (order.equalsIgnoreCase("descending")) {
                    courses.sort(Comparator.comparing(Course::getWeekday).reversed());
                } else {
                    courses.sort(Comparator.comparing(Course::getWeekday));
                }
                break;
        }
    }

    /**
     * prints the courses
     */
    private void displayCourses() {
        for (Course c : courses) {
            System.out.println(c);
        }
    }

}

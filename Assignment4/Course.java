/**
 * Course class
 *
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-15
 */
public class Course implements Cloneable {
    
    /**
     * private String attribute
     */
    private String courseName;

    /**
     * private String attribute
     */
    private String courseDes;

    /**
     * private String attribute
     */
    private String department;

    /**
     * private String attribute
     */
    private String time;

    /**
     * private String attribute
     */
    private String weekday;

    public Course(String courseName, String courseDes, String department, String time, String weekday) {
        this.courseName = courseName;
        this.courseDes = courseDes;
        this.department = department;
        this.time = time;
        this.weekday = weekday;
    }

    /**
     * @param courseName 
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @param courseDes 
     */
    public void setCourseDes(String courseDes) {
        this.courseDes = courseDes;
    }

    /**
     * @param department 
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @param time 
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @param weekday 
     */
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
    
    /**
     * @return the course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @return the course description
     */
    public String getCourseDes() {
        return courseDes;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @return the weekday
     */
    public String getWeekday() {
        return weekday;
    }
    
    @Override
    public String toString() {
        return courseName + "\nCourse Description: " + courseDes + "\nDepartment: " + department + "\nTime: "+ time + "\nWeekday: " + weekday;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

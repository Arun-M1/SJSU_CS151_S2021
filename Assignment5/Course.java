/**
 * Course class
 * 
 * @author Arun Murugan
 * Version 1.0
 * @since 24-3-2021
 */
public class Course {
    
    /**
     * private String attribute
     */
    private String name;
    
    /**
     * private String attribute
     */
    private String description;
    
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
    
    /**
     * Constructor for a course
     * 
     * @param name
     * @param description
     * @param department
     * @param time
     * @param weekday 
     */
    public Course(String name, String description, String department, String time, String weekday) {
        this.name = name;
        this.description = description;
        this.department = department;
        this.time = time;
        this.weekday = weekday;
    }
    
    /**
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return course name
     */
    public String getName() {
        return name;
    }

    /**
     * @return course description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return department
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
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ");
        sb.append(name);
        sb.append(" Description ");
        sb.append(description);
        sb.append(" Department: ");
        sb.append(department);
        sb.append(" Time: ");
        sb.append(time);
        sb.append(" Weekday: ");
        sb.append(weekday);
        return sb.toString();
    }

}

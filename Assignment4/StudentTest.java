/**
 * Student driver class
 * 
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-15
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course course1 = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00 p.m", "Tue.");
        //Course course2 = new Course("CS146", "Data Structures and Algorithms", "CS", "9:00 a.m", "Mon.");
        Course course2 = null;
        Student student1 = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science", course1);
        Student student2 = null;
        
        try {
            student2 = (Student) student1.clone();
            course2 = (Course) course1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Original student and course");
        student1.printInfo();
        student2.setCourse(course2);
        System.out.println("Deep Copy: Cloned student and course");
        student2.printInfo();   
    }
    
}

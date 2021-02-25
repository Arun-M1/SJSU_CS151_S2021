/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Arun Murugan
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Student johnSmith = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science");
    Student.Course courseList = johnSmith.new Course();
    courseList.printSchedule();
    }

}

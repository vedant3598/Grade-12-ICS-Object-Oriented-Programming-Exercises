package javaapplication9.grade12;

/**
 *
 * @author Vedant
 * Course Code: ICS4U Teacher: Ms. Navabi
 * Program Description: This is an assignment that I have created using the UML diagrams and Specifications my teacher has provided me with.
 */
public class MainMethod {

    public static void main(String [] args){
        //Declare and intialization of two School objects.
        //Part E
        School school1 = new School("Northview Heights Secondary School", "550 Finch Avenue West", 1500);
        School school2 = new School("Victoria Park Collegiate Institute", "15 Wallingford Road", 1400);
        
        //Declare and intialization of eight Course objects.
        Course course1 = new Course("SPH4U", "Physics", "12");
        Course course2 = new Course("SCH4U", "Chemistry", "12");
        Course course3 = new Course("ENG4U", "English", "12");
        Course course4 = new Course("ICS4U", "Introduction to Computer Science", "12");
        Course course5 = new Course("MHF4U", "Advanced Functions", "12");
        Course course6 = new Course("MCV4U", "Calculus and Vectors", "12");
        Course course7 = new Course("TER4M", "Robotics and Control Systems", "12");
        Course course8 = new Course("FSF4U", "French", "12");

        //Declare and intialization of the first Student object and adds all the courses that student is taking.
        //Part F
        Student student1 = new Student("Vedant", "Shah");
        student1.setSchool(school1);
        student1.addCourse(course1);
        student1.addCourse(course3);
        student1.addCourse(course5);
        student1.addCourse(course7);
        
        //Declare and intialization of the second Student object and adds all the courses that student is taking.
        Student student2 = new Student("John", "Doe");
        student2.setSchool(school1);
        student2.addCourse(course2);
        student2.addCourse(course4);
        student2.addCourse(course6);
        student2.addCourse(course8);
        
        //Declare and intialization of the third Student object and adds all the courses that student is taking.
        Student student3 = new Student("Alex", "Tribeck");
        student3.setSchool(school2);
        student3.addCourse(course1);
        student3.addCourse(course4);
        student3.addCourse(course7);
        student3.addCourse(course8);
        
        //Declare and intialization of the first Teacher object and adds all the courses that teacher is teaching.
        //Part G
        Teacher teacher1 = new Teacher("Ms. Navabi");
        teacher1.setSchool(school1);
        teacher1.addCourse(course1);
        teacher1.addCourse(course2);
        teacher1.addCourse(course5);

        //Declare and intialization of the second Teacher object and adds all the courses that teacher is teaching.
        Teacher teacher2 = new Teacher("Mr. Thoms");
        teacher2.setSchool(school2);
        teacher2.addCourse(course3);
        teacher2.addCourse(course4);
        teacher2.addCourse(course8);
        
        //Prints out the information of the three students.
        //Part H
        System.out.print("\n" + student1.toString());
        System.out.print("\n" + student2.toString());
        System.out.print("\n" + student3.toString());
        
        //Prints out the information of the two teachers.
        //Part I
        System.out.print("\n" + teacher1.toString());
        System.out.print("\n" + teacher2.toString());
    }
}
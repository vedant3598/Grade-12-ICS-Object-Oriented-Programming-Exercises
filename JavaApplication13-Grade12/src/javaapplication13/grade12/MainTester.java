package javaapplication13.grade12;

/**
 *
 * @author Vedant Shah
 * Course Code: ICS4U Teacher: Ms. Navabi
 * Program Description: This is an assignment that I have created using the UML diagrams and Specifications my teacher has provided me with.
 */
public class MainTester {

    public static void main(String[] args) {
        Student student1 = new Student("Chemistry", "123 Wonderlane Avenue", "Northview Heights Secondary School", "John", "Doe", "2001/07/15", 165.2, 102.5); //Creates the first Student object
        Student student2 = new Student("ICS", "11 Derry Lane Avenue", "Northview Heights Secondary School", "Victoria", "Doe", "2001/07/15", 162.2, 110.2); //Creates the second Student object
        Teacher teacher = new Teacher("Mathematics", "Victoria Park Collegiate Institute", "145 Lundy Lane Boulevard", "Al", "Thomas", "1974/06/28", 140.5, 142.1); //Creates a Teacher object
        Parent parent = new Parent("Statistics and Analyzing", "Financial Analyst", 152.6, 125000, "45 Bay Avenue", "Alxandra", "Jones", "1976/11/18", 157.2, 138.4); //Creates a Parent object

        //The following few lines adds courses to the first Student object and uses all of the methods that exist in its class and Person class.
        System.out.println("\nStudent 1: ");
        student1.addCourse("Mathematics", 96.4);
        student1.addCourse("ICS", 96.3);
        student1.addCourse("French", 90.2);
        student1.addCourse("English", 94.7);
        student1.printGrades();
        System.out.println(student1.getName() + " has the average of " + student1.studentAverage() + ".");
        System.out.println(student1.getName() + " weight set is: " + student1.setWeight(105.1) + ".");
        System.out.println(student1.getName() + " height set is: " + student1.setHeight(164.6) + ".");
        System.out.println("The day " + student1.getName() + " was born: " + student1.getDOB_day() + ".");
        System.out.println("The month " + student1.getName() + " was born: " + student1.getDOB_month() + ".");
        System.out.println("The year " + student1.getName() + " was born: " + student1.getDOB_year() + ".");
        student1.toString();
        System.out.println("");
        
        //The following few lines adds courses to the second Student object and uses all of the methods that exist in its class and Person class.
        System.out.println("\nStudent 2: ");
        student2.addCourse("Physics", 92.2);
        student2.addCourse("ICS", 94.1);
        student2.addCourse("Biology", 91.5);
        student2.addCourse("Chemistry", 93.6);
        student2.printGrades();
        System.out.println(student2.getName() + " has the average of " + student2.studentAverage() + ".");
        System.out.println(student2.getName() + " weight set is: " + student2.setWeight(111.2) + ".");
        System.out.println(student2.getName() + " height set is: " + student2.setHeight(164.3) + ".");
        System.out.println("The day " + student2.getName() + " was born: " + student1.getDOB_day() + ".");
        System.out.println("The month " + student2.getName() + " was born: " + student1.getDOB_month() + ".");
        System.out.println("The year " + student2.getName() + " was born: " + student1.getDOB_year() + ".");
        student2.toString();
        
        //The following few lines adds courses to the Teacher object and uses all of the methods that exist in its class and Person class.
        System.out.println("\nTeacher: ");
        System.out.println("The addition of the course is: " + teacher.addCourse("Advanced Functions - Grade 12") + ".");
        System.out.println("The addition of the course is: " + teacher.addCourse("Calculus and Vectors - Grade 12") + ".");
        System.out.println("The addition of the course is: " + teacher.addCourse("Academic Math - Grade 10") + ".");
        teacher.toString();
        teacher.changeCourse("Advanced Functions - Grade 12", "Academic Math - Grade 10");
        teacher.quitCourse("Accounting - Grade 11");
        System.out.println(teacher.getName() + " weight set is: " + teacher.setWeight(135.1) + ".");
        System.out.println(teacher.getName() + " height set is: " + teacher.setHeight(140.5) + ".\n\nNew Information: ");
        System.out.println("The teacher's new school set is: " + teacher.setSchool("William Lyon Mackenzie Colleigate Institute") + ".");
        System.out.println("The day " + teacher.getName() + " was born: " + teacher.getDOB_day() + ".");
        System.out.println("The month " + teacher.getName() + " was born: " + teacher.getDOB_month() + ".");
        System.out.println("The year " + teacher.getName() + " was born: " + teacher.getDOB_year() + ".");
        teacher.toString();
        
        //The following few lines adds hours, determines if the Parent object will get a raise or not, and uses all of the methods that exist in its class and Person class.
        System.out.println("\n\nParent: ");
        parent.addHours(200.5);
        parent.raise();
        System.out.println("The income tax you have to pay is $" + parent.payTax() + ".");
        System.out.println(parent.getName() + " weight set is: " + parent.setWeight(140.9) + ".");
        System.out.println(parent.getName() + " height set is: " + parent.setHeight(157.3) + ".");
        System.out.println("The day " + parent.getName() + " was born: " + parent.getDOB_day() + ".");
        System.out.println("The month " + parent.getName() + " was born: " + parent.getDOB_month() + ".");
        System.out.println("The year " + parent.getName() + " was born: " + parent.getDOB_year() + ".");
        parent.toString();
    }
    
}

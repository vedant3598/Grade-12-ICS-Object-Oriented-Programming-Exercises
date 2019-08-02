package javaapplication9.grade12;

/**
 *
 * @author Vedant Shah
 */
public class Student {
    private String fname; //Student first name
    private String lname; //Student last name
    private Course[] course = new Course[4]; //Any one student can only have at maximum four courses
    private School school; //The name of the school where the student studies at

    //Constructor that constructs a Student object.
    public Student(String first, String last){
        this.fname = first;
        this.lname = last;
    }

    //Adds a course to the course array above. If the student already has four courses, the program outputs "You have maximum capacity of courses.".
    public boolean addCourse(Course courseOther){
       int numOfCourses = 0;
       for(int counter1 = 0; counter1 < course.length; counter1++){
           if(course[counter1] == null){
               course[counter1] = courseOther;
               return true;
           }
           else{
               numOfCourses++;
           }
       }
       if(numOfCourses == 4){
           System.out.println("You have maximum capacity of courses.");
       }
       return false;
   }

    //Sets the school for the student and returns true.
    public boolean setSchool(School s){
        school = s; 
        return true;
    }
    
    //Prints all the information of the specified Student object.
    public String toString(){
        System.out.print("\n\nFirst Name: " + this.fname + " Last Name: " + this.lname + " School: " + this.school + " Courses: ");
        String courses = "";
        for(int counter1 = 0; counter1 < course.length; counter1++){
            courses += course[counter1] + " ";
        }
        return courses;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the course
     */
    public Course[] getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(Course[] course) {
        this.course = course;
    }

    /**
     * @return the school
     */
    public School getSchool() {
        return school;
    }
}

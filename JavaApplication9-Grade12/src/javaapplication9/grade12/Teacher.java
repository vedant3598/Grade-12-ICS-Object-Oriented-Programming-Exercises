package javaapplication9.grade12;

/**
 *
 * @author Vedant Shah
 */
public class Teacher {
    private String lname; //Last name of teacher
    private Course[] course = new Course[3]; //Any one teacher can teach at maximum three courses
    private School school; //The name of the school where the teacher teaches at
    
    //Constructor that constructs a Teacher object.
    public Teacher(String last){
        this.lname = last;
    }
    
    //Adds a course to the course array above. If the teacher is already teaching three courses, the program outputs "You have maximum capacity of courses.".
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
       if(numOfCourses == 3){
           System.out.println("You have maximum capacity of courses.");
       }
       return false;
   }

    //Sets the school for the teacher and returns true.
    public boolean setSchool(School s){
        school = s; 
        return true;
    }
    
    //Prints all the information of the specified Teacher object.
    public String toString(){
        System.out.print("\n\nLast Name: " + this.lname + " School: " + this.school + " Courses: ");
        String courses = "";
        for(int counter1 = 0; counter1 < course.length; counter1++){
            courses += course[counter1] + " ";
        }
        return courses;
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
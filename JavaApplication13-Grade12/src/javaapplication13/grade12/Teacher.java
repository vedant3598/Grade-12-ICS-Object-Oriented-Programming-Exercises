package javaapplication13.grade12;

/**
 *
 * @author Vedant
 */
public class Teacher extends Person{

    private String[] courses = new String[3]; //1-D array of the courses the teacher is teaching
    private int numCourses; //The number of courses the teacher is teaching
    private String address; //The address of the teacher
    private String majorCourse; //The course the teacher has majored in 
    private String school; //The school the teacher is teaching at
    private static final int MAX_COURSES = 3; //The maximum number of courses any one teacher can teach, which is three
    
    //Constructor that constructs a Teacher object according to the specified parameters.
    public Teacher(String majorCourse, String school, String address, String first, String last, String DOB, double height, double weight){
      super(first, last, DOB, height, weight);
      this.majorCourse = majorCourse;
      this.address = address;
      this.school = school;
      this.numCourses = 0;
      this.courses = new String[MAX_COURSES];
    }
    
    //This method adds a course the teacher is teaching to an array of courses and marks and returns true. However, if the teacher is already teaching the course, then the program would return false.
    public boolean addCourse(String courseOther){
       int numOfCourses = 0;
       for(int counter1 = 0; counter1 < courses.length; counter1++){
           if(courses[counter1] == null){
               courses[counter1] = courseOther;
               numCourses++;
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
    
    //This method sets the teacher’s new school and returns true.
    public boolean setSchool(String s){
        school = s; 
        return true;
    }
    
    //This method returns all the information of the Teacher object that is called.
    public String toString(){
        return ("\nName: " + super.getName() + " School: " + this.getSchool() + " Major Course: " + this.getMajorCourse());
    }
    
    //This method changes the current course the teacher is teaching to the new course they will be teaching and returns true. However, if they are the same courses, the program returns false.
    public boolean changeCourse(String originalCourse, String newCourse){
        int x = 0;
        for(int counter1 = 0; counter1 < getCourses().length; counter1++){
            if(getCourses()[counter1].equals(originalCourse)){
                getCourses()[counter1] = newCourse;
                System.out.println("\nThe course was successfully changed!");
                return true;
            }
            else
                x++;
        }
        if(x == 3)
            System.out.println("Course could not be changed as it may not exist!");
        return false;
    }
    
    //This method takes off a course from the teacher’s schedule and returns true. However, if the teacher is not teaching that course, the program returns false.
    public boolean quitCourse(String course){
        int x = 0;
        for(int counter1 = 0; counter1 < getCourses().length; counter1++){
            if(getCourses()[counter1].equals(course)){
                getCourses()[counter1] = null;
                System.out.println("The course was successfully taken off your schedule.");
                return true;
            }
            else
                x++;
        }
        if(x == 3)
            System.out.println("Course could not be taken off your schedule as it may not exist!");
        return false;
    }
    
    /**
     * @return the courses
     */
    public String[] getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    /**
     * @return the numCourses
     */
    public int getNumCourses() {
        return numCourses;
    }

    /**
     * @param numCourses the numCourses to set
     */
    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the majorCourse
     */
    public String getMajorCourse() {
        return majorCourse;
    }

    /**
     * @param majorCourse the majorCourse to set
     */
    public void setMajorCourse(String majorCourse) {
        this.majorCourse = majorCourse;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }
}

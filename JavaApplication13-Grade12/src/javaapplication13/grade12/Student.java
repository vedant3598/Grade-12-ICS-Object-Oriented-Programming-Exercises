package javaapplication13.grade12;
/**
 *
 * @author Vedant Shah
 */
public class Student extends Person{

    private String majorCourse; //The course the student is majoring in 
    private String address; //The address of the student 
    private String[] courses; //1-D array of the courses the student is taking
    private int numCourses; //The number of courses the student is taking
    private double[] grades; //1-D array of the student’s grades
    private String school; //The school the student is attending
    private static final int MAX_COURSES = 4; //The maximum number of courses any one student can take, which is four
    
    //Constructor that constructs a Student object according to the specified parameters.
    public Student(String majorCourse, String address, String school, String first, String last, String DOB, double height, double weight){
      super(first, last, DOB, height, weight);
      this.majorCourse = majorCourse;
      this.school = school;
      this.numCourses = 0;
      this.address = address;
      this.courses = new String[MAX_COURSES];
      this.grades = new double[MAX_COURSES];
   }
    
    //This method adds a course and the average the student had in this course to an array of courses and marks and returns true. However, if the student has already taken the course, then the program would return false.
    public boolean addCourse(String course, double average){
        boolean successful = true;
        if(getNumCourses() <= 4){
            getCourses()[getNumCourses()] = course;
            getGrades()[getNumCourses()] = average;
            setNumCourses(getNumCourses() + 1);
           successful = true;
        }
        else 
            successful = false;
        return successful;
    }
    
    //This method prints out the student’s marks that they earned for each course.
    public void printGrades(){
      System.out.print(this);
      for(int counter1 = 0; counter1 < getNumCourses(); counter1++) {
         System.out.print(" " + getCourses()[counter1] + ": " + getGrades()[counter1]);
      }
      System.out.println();
    }
    
    //This method calculates and returns the student’s average.
    public double studentAverage(){
        int gradesSum = 0;
        for(int counter1 = 0; counter1 < getNumCourses(); counter1++){
            gradesSum += getGrades()[counter1];
        }
        return gradesSum / getNumCourses();
    }
    
    //This method returns all the information of the Student object that is called.
    public String toString(){
        return "Student: " + super.getName() + " Address: " + this.getAddress() + " Date of Birth: " + super.getDOB() + " Height: " + super.getHeight() + " Weight: " + super.getWeight();
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
     * @return the grades
     */
    public double[] getGrades() {
        return grades;
    }

    /**
     * @param grades the grades to set
     */
    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }
}
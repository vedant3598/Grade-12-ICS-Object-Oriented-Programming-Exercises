package javaapplication13.grade12;

/**
 *
 * @author Vedant Shah
 */
public class Parent extends Person{
    
    private String address; //The address of the parent 
    private String majorCourse; //The course the parent has majored in 
    private String work; //The parent’s work/job 
    private double numHoursWorked; //The number of hours the parent has worked at their job
    private double income; //The parent’s annual income
    private final double PROVCINCIAL_TAX1 = 0.55; //Depending on their income, the parent pays this percentage of their income to provincial tax
    private final double PROVCINCIAL_TAX2 = 0.45; //Depending on their income, the parent pays this percentage of their income to provincial tax
    private final double PROVCINCIAL_TAX3 = 0.35; //Depending on their income, the parent pays this percentage of their income to provincial tax
    private final double PROVCINCIAL_TAX4 = 0.25; //Depending on their income, the parent pays this percentage of their income to provincial tax
    
    //Constructor that constructs a Parent object according to the specified parameters.
    public Parent(String majorCourse, String work, double numHoursWorked, double income, String address, String first, String last, String DOB, double height, double weight){
      super(first, last, DOB, height, weight);
      this.majorCourse = majorCourse;
      this.income = income;
      this.numHoursWorked = numHoursWorked;
      this.address = address;
      this.work = work;
    }
    
    //This method adds the number of hours the parent has worked to the "numHoursWorked" variable.
    public void addHours(double hoursWorked){
        this.setNumHoursWorked(this.getNumHoursWorked() + hoursWorked);
    }
    
    //This method gives the Parent object a raise only if they have worked more than 350 hours and returns true. However, if they have worked less than or equal to 350 hours, the program returns false.
    public boolean raise(){
        if(this.getNumHoursWorked() > 350){
            System.out.println("You will get a raise. Woohoo!");
            return true;
        }
        else
            System.out.println("Sorry. You will not be getting a raise. Work harder!");
        return false;
    }
    
    //This method returns the amount of tax the user has to pay based on their income.
    public double payTax(){
        double incomeTax = 0;
        if(this.income <= 30000 && this.income > 0){
            incomeTax = this.income * PROVCINCIAL_TAX4;
        }
        else if(this.income > 30000 && this.income <= 100000){
            incomeTax = this.income * PROVCINCIAL_TAX3;
        }
        else if(this.income > 100000 && this.income <= 500000){
            incomeTax = this.income * PROVCINCIAL_TAX2;
        }
        else if(this.income > 500000){
            incomeTax = this.income * PROVCINCIAL_TAX1;
        }
        return incomeTax;        
    }
    
    //This method returns all the information of the Parent object that is called.
    public String toString(){
        return "Name: " + this.getName() + " Address: " + this.address + " Major (in university): " + this.majorCourse + " Work: " + this.work + " Number of Hours Worked: " + this.numHoursWorked + " Date of Birth: " + this.getDOB();
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
     * @return the work
     */
    public String getWork() {
        return work;
    }

    /**
     * @param work the work to set
     */
    public void setWork(String work) {
        this.work = work;
    }

    /**
     * @return the numHoursWorked
     */
    public double getNumHoursWorked() {
        return numHoursWorked;
    }

    /**
     * @param numHoursWorked the numHoursWorked to set
     */
    public void setNumHoursWorked(double numHoursWorked) {
        this.numHoursWorked = numHoursWorked;
    }
    
    /**
     * @return the income
     */
    public double getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(double income) {
        this.income = income;
    }
}

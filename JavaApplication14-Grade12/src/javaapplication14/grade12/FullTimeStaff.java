package javaapplication14.grade12;

/**
 *
 * @author Vedant
 */
public class FullTimeStaff extends Employee{

    private final int yearlySickDay = 20; //Number of sick days a full-time employee has
    private double yearlySalary; //The full-time employee's yearly salary
    private double sickDaysLeft; //The number of sick days the full-time employee has left
    
    //Constructor that constructs a FullTimeStaff object according to the specified parameters.
    public FullTimeStaff(double yearSal, int daysLeft, String fName, String lName, int eID, String eType){
        super(eID, fName, lName, eType);
        this.yearlySalary = yearSal;
        this.sickDaysLeft = daysLeft;
    }
    
    //A method that returns the amount earned monthly based on the yearly salary of the full-time employee.
    @Override
    public double pay(){
        return this.yearlySalary/12;
    }
    
    //A method that updates the number of sick day left for the full-time employee.
    @Override
    public double deductSickDay(double sickDays){
        if(sickDays == 0.5 || sickDays >= 1){
            this.sickDaysLeft -= sickDays;
            if(this.sickDaysLeft <= 0){
                this.sickDaysLeft = 0;
                System.out.println("You have no sick days left!");
            }
            System.out.println("Your sick days have been updated.");
        }
        else
            System.out.println("You have no sick days left!");
        
        return this.sickDaysLeft--;
    }
    
    //A method that resets the number of sick days for a full-time employee to his/her yearly allowance.
    @Override
    public void resetSickDay(){
        this.sickDaysLeft = yearlySickDay;
    }
    
    //A method that prints (on screen) the pay stub for the full-time employee called.
    @Override
    public String printPayStub(){
        return "Monthly Pay: " + Math.round(this.pay()) + " Number of Sick Days Left: " + this.sickDaysLeft;
    }
    
    //A method that compares the number sick days left between two full-time employees.
    public String compareToSickDay(FullTimeStaff other){
        if((this.sickDaysLeft - other.sickDaysLeft) < 0){
            return other.getFirstName() + " " + other.getLastName() + " has " + Math.abs(this.sickDaysLeft - other.sickDaysLeft)+ " more sick day(s).";
        }
        else
            return this.getFirstName() + " " + this.getLastName() + " has " + Math.abs(this.sickDaysLeft - other.sickDaysLeft)+ " more sick day(s).";
    } 
    
    //A method that returns a String with employee number, name, and title.
    public String toString(){
        return "Name: " + this.getFirstName() + " " + this.getLastName() + " Employee Number: " + this.getEmployeeNumber() + " Title: Full Time Staff";
    }
    
    /**
     * @return the yearlySickDay
     */
    public int getYearlySickDay() {
        return yearlySickDay;
    }

    /**
     * @return the yearlySalary
     */
    public double getYearlySalary() {
        return yearlySalary;
    }

    /**
     * @param yearlySalary the yearlySalary to set
     */
    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    /**
     * @return the sickDaysLeft
     */
    public double getSickDaysLeft() {
        return sickDaysLeft;
    }

    /**
     * @param sickDaysLeft the sickDaysLeft to set
     */
    public void setSickDaysLeft(double sickDaysLeft) {
        this.sickDaysLeft = sickDaysLeft;
    }  
}
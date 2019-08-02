package javaapplication14.grade12;

/**
 *
 * @author Vedant
 */
public class PartTimeStaff extends Employee{
    private double hourlyRate; //The hourly rate at which the part-time employee earns money
    private double numHoursAssigned; //The number of hours the part-time employee is assigned
    private double sickDaysTaken; //The number of sick days the part-time employee has taken
    
    //Constructor that constructs a PartTimeStaff object according to the specified parameters.
    public PartTimeStaff(double hourlyRate, double hoursAssigned, double sickDays, String fName, String lName, int eID, String eType){
        super(eID, fName, lName, eType);
        this.hourlyRate = hourlyRate;
        this.numHoursAssigned = hoursAssigned;
        this.sickDaysTaken = sickDays;
    }
    
    //A method that returns the amount earned based on the hourly rate and the number of hours the part-time employee has worked (assigned hours – sick days taken).
    @Override
    public double pay(){
        return ((this.numHoursAssigned) - (this.sickDaysTaken * 8)) * this.hourlyRate;
    }
        
    //A method that updates the number of sick days taken by the part-time employee.
    @Override
    public double deductSickDay(double sickDays){
        if(sickDays == 0.5 || sickDays >= 1)
            this.sickDaysTaken += sickDays;
        System.out.println("Your sick days have been updated.");
        return this.sickDaysTaken;
    }
    
    //A method that resets the number of sick days taken by a part-time employee to 0.
    @Override
    public void resetSickDay(){
         this.sickDaysTaken = 0;
    }
    
    //A method that prints (on screen) the pay stub for the part-time employee called.
    @Override
    public String printPayStub(){
        if(((this.numHoursAssigned) - (this.sickDaysTaken * 8)) <= 0){
            return "Amount Earned: " + Math.round(this.pay()) + " Number of Hours Worked: " + "0";
        }
        return "Amount Earned: " + this.pay() + " Number of Hours Worked: " + ((this.numHoursAssigned) - (this.sickDaysTaken * 8));
    }
    
    //A method that compares the number sick days used between two part-time employees.
    public String compareToSickDay(PartTimeStaff other){
        if((this.sickDaysTaken - other.sickDaysTaken) < 0){
            return other.getFirstName() + " " + other.getLastName() + " has used " + Math.abs(this.sickDaysTaken - other.sickDaysTaken)+ " more sick day(s).";
        }
        else
            return this.getFirstName() + " " + this.getLastName() + " has used " + Math.abs(this.sickDaysTaken - other.sickDaysTaken)+ " more sick day(s).";
    } 
    
    //A method that returns a String with employee number, name, and title.
    public String toString(){
        return "Name: " + this.getFirstName() + " " + this.getLastName() + " Employee Number: " + this.getEmployeeNumber() + " Title: Part Time Staff";
    }

    /**
     * @return the hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return the numHoursAssigned
     */
    public double getNumHoursAssigned() {
        return numHoursAssigned;
    }

    /**
     * @param numHoursAssigned the numHoursAssigned to set
     */
    public void setNumHoursAssigned(double numHoursAssigned) {
        this.numHoursAssigned = numHoursAssigned;
    }

    /**
     * @return the sickDaysTaken
     */
    public double getSickDaysTaken() {
        return sickDaysTaken;
    }

    /**
     * @param sickDaysTaken the sickDaysTaken to set
     */
    public void setSickDaysTaken(double sickDaysTaken) {
        this.sickDaysTaken = sickDaysTaken;
    }
}

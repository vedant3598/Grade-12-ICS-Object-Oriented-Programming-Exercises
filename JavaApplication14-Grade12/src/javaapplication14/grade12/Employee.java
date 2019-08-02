package javaapplication14.grade12;

/**
 * 
 * @author Vedant Shah  
 */
abstract class Employee {

    private int employeeNumber; //Employee's employee number
    private String firstName; //Employee's first name
    private String lastName; //Employee's last name
    private String employeeType; //The type of employee (part time or full time)
    
    //Constuctor that constructs a Employee object.
    public Employee(){
        
    }
    
    //Constructor that constructs an Employee object according to the specified parameters.
    public Employee(int employeeNum, String fName, String lName, String eType){
        this.employeeNumber = employeeNum;
        this.firstName = fName;
        this.lastName = lName;
        this.employeeType = eType;
    }
    
    //An abstract method that returns an employee’s pay.
    public abstract double pay();
    //An abstract method that updates the sick day information for an employee .
    public abstract double deductSickDay(double sickDays);
    //An abstract method that resets the sick day information for an employee.
    public abstract void resetSickDay();
    //An abstract method that prints (display on screen) the monthly pay stub of an employee.
    public abstract String printPayStub();
    
    
    //A method that returns a String with employee number, first name, and last name.
    public String toString(){
        return "Employee Number: " + this.employeeNumber + " First Name: " + this.firstName + " Last Name: " + this.lastName;
    }

    /**
     * @return the employeeNumber
     */
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * @param employeeNumber the employeeNumber to set
     */
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * @return the employeeType
     */
    public String getEmployeeType() {
        return employeeType;
    }

    /**
     * @param employeeType the employeeType to set
     */
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
    
    
}

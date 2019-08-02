package javaapplication14.grade12;
import java.io.*;
import java.util.*;

/**
 *
 * @author Vedant Shah
 */
public class Payroll{
    
    //Declaration and initialization of an arraylist which will contain information on all the employees.
    private ArrayList<Employee> staffList = new ArrayList<Employee>();

    //A method that lists all employees (employee number, name).
    public void listAllEmployee(){
        for(int counter1 = 0; counter1 < getStaffList().size(); counter1++){
            System.out.println("Employee Number: " + getStaffList().get(counter1).getEmployeeNumber() + " Name: " + getStaffList().get(counter1).getFirstName() + " " + getStaffList().get(counter1).getLastName());
        }
    }
    
    //A method that updates sick day information for the employee specified by the employee number.
    public void enterSickDay(int eID, String employeeType, double sickDays){
        for(int counter1 = 0; counter1 < getStaffList().size(); counter1++){
            if(eID == getStaffList().get(counter1).getEmployeeNumber()){
                if(employeeType == "Full Time Staff")
                    getStaffList().get(counter1).deductSickDay(sickDays);
                else if(employeeType == "Part Time Staff")
                    getStaffList().get(counter1).deductSickDay(sickDays);
                System.out.println("Your sick days have been updated.");
                break;
            }
        }
        System.out.println("Sorry! Sick days not reset as employee ID or employee type may be invalid.");
    }
    
    //A method that prints on screen the pay stub (for the currently month) for all employees.
    public void printAllPayStubs(){
        for(int counter1 = 0; counter1 < getStaffList().size(); counter1++){
            if(getStaffList().get(counter1).getEmployeeType().equals("Full Time Staff"))
                getStaffList().get(counter1).printPayStub();
            else if(getStaffList().get(counter1).getEmployeeType().equals("Part Time Staff"))
                getStaffList().get(counter1).printPayStub();
        }
    }
    
    //A method that saves employee information to the specified file.
    public void saveStaffList(){
        try{
        PrintWriter pw = new PrintWriter(new FileWriter("src//PartTimeFullTimeStaff.txt"));
        for(int counter1 = 0; counter1 < staffList.size(); counter1++){
            pw.write(staffList.get(counter1).toString());
            pw.println();   
        }
        pw.close();
        System.out.println("File was successfully saved!");
            
        }catch(IOException e){
            System.out.println("File was not successfully saved!");
        }
    }
    
    //A method that loads employee information from the specified file.
    public void loadStaffList(){
        FullTimeStaff[] fullTimeStaff = new FullTimeStaff[3];
        PartTimeStaff[] partTimeStaff = new PartTimeStaff[3];
        int numOfPartTimeStaff = 0;
        int numOfFullTimeStaff = 0;
        //This try and catch reads each line, splits the line into an array, and adds the object to the "staffList" ArrayList. If it is not able to, it catches the IOException error that is thrown and outputs: "File was not successfully loaded.".
        try{
            BufferedReader br = new BufferedReader(new FileReader("src//PartTimeFullTimeStaff.txt"));
            String textFile;
            textFile = br.readLine();
            while(textFile != null){
                for(int counter1 = 0; counter1 < 6; counter1++){
                    System.out.println(textFile);
                    textFile = br.readLine();
                    String delimiter = " ";
                    String[] tempArray;
                        if(textFile == null){
                            br.close();
                            System.out.println("File was successfully loaded!");
                            break;
                        }   
                    tempArray = textFile.split(delimiter);
                    String fName = tempArray[1];
                    String lName = tempArray[2];
                    int eID = Integer.parseInt(tempArray[5]);
                    String jobType = tempArray[7] + " " + tempArray[8] + " " + tempArray[9];
                    if(jobType.equals("Part Time Staff")){
                        partTimeStaff[numOfPartTimeStaff] = new PartTimeStaff(22.50, 40, 0, fName, lName, eID, jobType);
                        staffList.add(partTimeStaff[numOfPartTimeStaff]);
                        numOfPartTimeStaff++;
                    }
                    else if(jobType.equals("Full Time Staff")){
                        fullTimeStaff[numOfFullTimeStaff] = new FullTimeStaff(65000, 0, fName, lName, eID, jobType);
                        staffList.add(fullTimeStaff[numOfFullTimeStaff]);
                        numOfFullTimeStaff++;
                    }
                }
            }
        }catch(IOException e){
            System.out.println("File was not successfully loaded!");
        }
    }
    
    //A method that calculates (and returns) the average salary of all the full-time employees.
    public double averageSalary(){
        double salary = 0;
        int numOfStaff = 0;
        for(int counter1 = 0; counter1 < getStaffList().size(); counter1++){
            if(getStaffList().get(counter1).getEmployeeType().equals("Full Time Staff")){
                salary += getStaffList().get(counter1).pay();
                numOfStaff++;
            }
        }
        return salary/numOfStaff;
    }
    
    //A method that calculates (and returns) the average hourly rate of all part-time employees.
    public double averageHourlyRate(){
        double salary = 0;
        int numOfStaff = 0;
        for(int counter1 = 0; counter1 < getStaffList().size(); counter1++){
            if(getStaffList().get(counter1).getEmployeeType().equals("Part Time Staff")){
                salary += getStaffList().get(counter1).pay();
                numOfStaff++;
            }
        }
        return salary/numOfStaff;
    }
    
    //A method that determines (and returns) the full-time staff with the most absence in the current year.
    public FullTimeStaff mostAbsentFullTime(FullTimeStaff staff1, FullTimeStaff staff2){
        String s = staff1.compareToSickDay(staff2);
        System.out.println(s);   
        if(staff1.getSickDaysLeft() > staff2.getSickDaysLeft())
            return staff1;
        else
            return staff2;
    }
    
    //A method that determines (and returns) the part-time staff with the most absence in the current month.
    public PartTimeStaff mostAbsentPartTime(PartTimeStaff staff1, PartTimeStaff staff2){
        String s = staff1.compareToSickDay(staff2);
        System.out.println(s);   
        if(staff1.getSickDaysTaken() > staff2.getSickDaysTaken())
            return staff1;
        else
            return staff2;
    }
    
    //A method that resets the yearly sick day information for all full-time employees.
    public void yearlySickDayReset(){
        for(int counter1 = 0; counter1 < getStaffList().size(); counter1++){
            if(getStaffList().get(counter1).getEmployeeNumber() == getStaffList().get(counter1).getEmployeeNumber())
                getStaffList().get(counter1).resetSickDay();
        }
    }
    
    //A method that resets the monthly sick day information for all part-time employees.
    public void monthylySickDayReset(){
        for(int counter1 = 0; counter1 < getStaffList().size(); counter1++){
            if(getStaffList().get(counter1).getEmployeeNumber() == getStaffList().get(counter1).getEmployeeNumber())
                getStaffList().get(counter1).resetSickDay();
        }
    }
    
    /**
     * @return the staffList
     */
    public ArrayList<Employee> getStaffList() {
        return staffList;
    }

    /**
     * @param staffList the staffList to set
     */
    public void setStaffList(ArrayList<Employee> staffList) {
        this.staffList = staffList;
    }
}
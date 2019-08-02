package javaapplication14.grade12;
import java.util.*;
import java.io.*;

/**
 *
 * @author Vedant Shah
 * Course Code: ICS4U Teacher: Ms. Navabi
 * Program Description: This is an assignment that I have created using the specifications my teacher has provided me with.
 */
public class PayrollRunner {

    public static void main(String[] args) {
        
        //Declaration and initialization of an arraylist which will contain information on all the employees.
        ArrayList<Employee> staffList = new ArrayList<Employee>();
        
        //Adding three part time employees to the "staffList" arraylist.
        PartTimeStaff[] partTimeStaff = new PartTimeStaff[3];
        partTimeStaff[0] = new PartTimeStaff(22.50, 40, 0, "John", "Doe", 123, "Part Time Staff");
        partTimeStaff[1] = new PartTimeStaff(22.50, 40, 0, "Alex", "Doe", 124, "Part Time Staff");
        partTimeStaff[2] = new PartTimeStaff(22.50, 40, 0, "Vincent", "Doe", 125, "Part Time Staff");
        staffList.add(partTimeStaff[0]);
        staffList.add(partTimeStaff[1]);
        staffList.add(partTimeStaff[2]);
        
        //Adding three full time employees to the "staffList" arraylist.
        FullTimeStaff[] fullTimeStaff = new FullTimeStaff[3];
        fullTimeStaff[0] = new FullTimeStaff(65000, 0, "Dolly", "Doe", 126, "Full Time Staff");
        fullTimeStaff[1] = new FullTimeStaff(65000, 0, "Kingsley", "Doe", 127, "Full Time Staff");
        fullTimeStaff[2] = new FullTimeStaff(65000, 0, "Happy", "Doe", 128, "Full Time Staff");
        staffList.add(fullTimeStaff[0]);
        staffList.add(fullTimeStaff[1]);
        staffList.add(fullTimeStaff[2]);
        
        //The following few lines gives the user options on what they can do with each part-time and full-time employee.
        System.out.println("Welcome to Payroll!\n");        
        System.out.println("List All Employees -> 1");
        System.out.println("Enter Sick Day -> 2");
        System.out.println("Print All Paystubs -> 3");
        System.out.println("Save Staff List -> 4");
        System.out.println("Load Staff List -> 5");
        System.out.println("Average Salary -> 6");
        System.out.println("Average Hourly Rate -> 7");
        System.out.println("Most Absent Full Time Employee -> 8");
        System.out.println("Most Absent Part Time Employee -> 9");
        System.out.println("Yearly Sick Day Reset -> 10");
        System.out.println("Monthly Sick Day Reset -> 11");
        
        //The following line asks the user what they want to do, where the user would have to input one of the numbers above.
        System.out.print("What would you like to do? ");
        Scanner sc1 = new Scanner(System.in);
        int choose = sc1.nextInt();
        
        //Thie while-loop will run until the user enters -1.
        while(choose != -1){
            //This if statement will run if the user wants the list of all the employees in the company.
            if(choose == 1){
                for(int counter1 = 0; counter1 < partTimeStaff.length; counter1++){
                    System.out.println(partTimeStaff[counter1].toString());
                }
                for(int counter1 = 0; counter1 < fullTimeStaff.length; counter1++){
                    System.out.println(fullTimeStaff[counter1].toString());
                }
            }
            
            //This else-if statement will run if the user wants to enter a sick day for a specific employee.
            else if(choose == 2){
                System.out.print("Please enter the sick days: ");
                double sickDays = sc1.nextDouble();
                System.out.print("\nPlease enter the employee ID: ");
                int id = sc1.nextInt();
                
                for(int counter1 = 0; counter1 < partTimeStaff.length; counter1++){
                    if(partTimeStaff[counter1].getEmployeeNumber() == id)
                        partTimeStaff[counter1].deductSickDay(sickDays);
                }  
                for(int counter1 = 0; counter1 < fullTimeStaff.length; counter1++){
                    if(fullTimeStaff[counter1].getEmployeeNumber() == id)
                        fullTimeStaff[counter1].deductSickDay(sickDays);
                }
            }
            
            //This else-if statement will run if the user wants the paystub of all the employees in the company.
            else if(choose == 3){
                for(int counter1 = 0; counter1 < partTimeStaff.length; counter1++){
                    System.out.println(partTimeStaff[counter1].printPayStub());
                }
                for(int counter1 = 0; counter1 < fullTimeStaff.length; counter1++){
                    System.out.println(fullTimeStaff[counter1].printPayStub());
                }
            }
            
            //This else-if statement will run if the user wants to save the staff list into a ".txt" file.
            else if(choose == 4){
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
            
            //This else-if statement will run if the user wants to load the staff list from a ".txt" file.
            else if(choose == 5){
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
                                staffList.add(partTimeStaff[numOfFullTimeStaff]);
                                numOfFullTimeStaff++;
                            }
                        }
                    }
                }catch(IOException e){
                    System.out.println("File was not successfully loaded!");
                }
            }
            
            //This else-if statement will run if the user wants the to know the average salary of all the full-time employees in the company.
            else if(choose == 6){
                double salary = 0;
                for(int counter1 = 0; counter1 < fullTimeStaff.length; counter1++){
                        salary += fullTimeStaff[counter1].pay();
                }
                System.out.println("The average pay of all full time staff members (per month) is: $" + Math.ceil(salary / fullTimeStaff.length) + ".");
            }
            
            //This else-if statement will run if the user wants the to know the average hourly salary of all the part-time employees in the company.
            else if(choose == 7){
                double salary = 0;
                for(int counter1 = 0; counter1 < partTimeStaff.length; counter1++){
                        salary += partTimeStaff[counter1].pay();
                }
                System.out.println("The average pay of all full-time staff members (per month) is: $" + Math.ceil(salary / partTimeStaff.length) + ".");
            }
            
            //This else-if statement will run if the user wants the to know the employee which has used the least amount sick days between two full-time employees.
            else if(choose == 8){
                System.out.println(fullTimeStaff[0].compareToSickDay(fullTimeStaff[1]));
                System.out.println(fullTimeStaff[1].compareToSickDay(fullTimeStaff[2]));
                System.out.println(fullTimeStaff[0].compareToSickDay(fullTimeStaff[2]));
            }
            
            //This else-if statement will run if the user wants the to know the employee which has used the most amount sick days between two part-time employees.
            else if(choose == 9){
                System.out.println(partTimeStaff[0].compareToSickDay(partTimeStaff[1]));
                System.out.println(partTimeStaff[1].compareToSickDay(partTimeStaff[2]));
                System.out.println(partTimeStaff[0].compareToSickDay(partTimeStaff[2]));
            }
            
            //This else-if statement will run if the user wants to reset all the full-time employees sick days to their yearly allowance, which is 20.
            else if(choose == 10){
                for(int counter1 = 0; counter1 < fullTimeStaff.length; counter1++){
                    fullTimeStaff[counter1].resetSickDay();
                }
                System.out.println("The sick days for all the full time staff members have been reset! Happy New Year!");
            }
            
            //This else-if statement will run if the user wants to reset all the part-time employees sick days to t0.
            else if(choose == 11){
                for(int counter1 = 0; counter1 < partTimeStaff.length; counter1++){
                    partTimeStaff[counter1].resetSickDay();
                }
                System.out.println("The sick days for all the part time staff members have been reset! Happy New Year!");
            }
            
            //THis else statement will run if the user does not enter a number between 1-9.
            else{
                System.out.println("Sorry. Invalid choice. Please choose again!");
                System.out.print("What would you like to do? ");
                choose = sc1.nextInt();
                if(choose == -1)
                    break;
            }
            System.out.print("What would you like to do? ");
            choose = sc1.nextInt();
        }
        System.out.println("Goodbye!");
    }
}
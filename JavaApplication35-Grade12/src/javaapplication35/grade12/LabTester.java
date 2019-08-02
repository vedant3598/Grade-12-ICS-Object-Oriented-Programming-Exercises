//A Java package organizes Java classes into namespaces, giving a different namespace for every type it has. The name of this package is javaapplication35.grade12.
package javaapplication35.grade12;
//The following line of code imports Scanner and IO, allowing me to utilize it in my program. Without it, I cannot use Scanner and IO, allowing me to not obtain the user's input as well as read or write to files, respectively.
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Vedant
 * Date: Friday, October 12, 2018
 * Course Info: ICS3U-14 Teacher: Ms. Navabi
 * Project Information: This is a Java program that manages a set of computers in a lab. The program should contain three classes: Computer, Lab, and LabTester (which consists of the main method). It performs the questions I
 * was asked in the assignment.
 */
public class LabTester {
    /**
     * Public allows the main method to be accessible anywhere. Static assists the main method to get loaded and void clarifies that the main method will not output any value. ain is the name of the method.
     * This is required as you can only code after this has been written.
     */
    public static void main(String[] args) {
        //The line below declares an array of object computers.
        Computer[] computers;
        //The two lines below welcomes the user to the program.
        System.out.println("Welcome to Vedant's LabTester!\n");
        System.out.println("My name is Vedant Shah and I am the creator of this program. Have fun!");        

        //This creates a new scanner, whose name is sc1.
        Scanner sc1 = new Scanner(System.in);
        //The line below asks the user what the maximum capacity of the lab they would like.
        System.out.print("What is maximum capacity of the lab would you like?   ");
        //The line below sets the user's input into the integer variable maximumCap. 
        int maximumCap = sc1.nextInt();
        //The line below creates an array of object computers.
        computers = new Computer[maximumCap];
        //The line below creates an array of object labs.
        Lab computerLab = new Lab(maximumCap);
           
        /**The try and catch below gets all the values from the text file, "computer.txt", and sets the values of the variables below.
        *  It then creates a new computer with all the specifications and it also gets the values for the Lab class so it can use it for the methods there.
        *  This all occurs in the try. In the catch, it catches an IOException if one is thrown. If it is thrown, the program will output, "File not found!". 
        */
        try{
            //The line below creates a new Scanner with the new file, whose name is "computer.txt".
            Scanner scnr = new Scanner(new File("computer.txt"));
            int st = scnr.nextInt();
            int installingComp = (st);
            if(installingComp > maximumCap)
                installingComp = maximumCap;
            
            /**The for-loop obtains the values from the text file and stores each value according to its correct variable. It then creates a new computer object within the computers array by passing the specifications of the computer as parameters.
            *  It also calls the installComputer method from the Lab class so methods in that class can utilize specifications for certain calculations.
            */
            for(int counter1 = 0; counter1 < computers.length; counter1++){
               String serialNumber = scnr.next(); 
               String manufacturer = scnr.next();
                int compYearMade = Integer.parseInt(scnr.next());
               int compYearPurchase = Integer.parseInt(scnr.next());
               double processSpeed = Double.parseDouble(scnr.next());
               int ramSize = Integer.parseInt(scnr.next());
               int expiryYear = Integer.parseInt(scnr.next()); 
               computers[counter1] = new Computer(serialNumber, manufacturer, compYearMade, compYearPurchase, processSpeed, ramSize, expiryYear);
               computerLab.installComputer(serialNumber, manufacturer, compYearMade, compYearPurchase, processSpeed, ramSize, expiryYear, counter1);
            }
        //The program will catch an IOException if the try throws an IOException. It will then output "File not found!".
        }catch(IOException e){
            System.out.println("File not found!");
        }
        //The line below prints out the average age of the computers in the lab.
        System.out.println("The average age of the computers in the lab is " + computerLab.computerAverage(computers) + ".\n");
        
        //The line below creates a new computer object, whose name is comp1, which obtains the specifications of the newest computer in the lab. It then prints the specifications of the newest computer in the lab.
        Computer comp1 = computerLab.newComp(computers);
        System.out.println("The specifications of the newest computer in the lab is: " + comp1.toString() + ".\n");
        
        //The two lines below creates two new computer objects, whose names are comp2 and comp3, which obtains the specifications of the fastest computer, in GHz, and the computer that has the highest RAM, in GB. It then prints out the specifications of the computer that has the highest speed. It also indicates whether or not the fastest computer has the largest size of RAM.
        Computer comp2 = computerLab.fastestComp(computers);
        Computer comp3 = computerLab.highestRamComp(computers);
        System.out.println("The specifications of the fastest computer in the lab is: " + comp2.toString() + ".");
        if(comp2.getSizeRAM() > comp3.getSizeRAM())
            System.out.println("This computer has the largest size of RAM.\n");
        else if(comp2.getSizeRAM() < comp3.getSizeRAM())
            System.out.println("This computer does not have the largest size of RAM.\n");
        else
            System.out.println("This computer is tied for having the largest size of RAM.\n");
        
        //The line below creates a new Lab object, whose name is computerManufacturer. After that, the program asks the user for a particular manufacturer, and outputs the number of computers with the manufacturer the user entered.
        Lab computerManufacturer = new Lab(maximumCap);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Which particular manufacturer are you looking for (Dell, Compaq, HP)?   ");
        String compManufacturer = sc2.nextLine();
        System.out.println("The number of computers with the manufacturer you entered, " + compManufacturer + ", is " + computerManufacturer.numOfManufacturer(compManufacturer, computers) + ".\n");
        
        //The line below creates a new Lab object, whose name is compExpiring. After that, the program asks the user for a expiry date, and outputs the number of computers expiring in the year the user entered.
        Lab compExpiring = new Lab(maximumCap);
        System.out.print("Enter an expiry date:   ");
        int expDate = sc2.nextInt();
        String[] computersExpiring = compExpiring.expiringComp(expDate, maximumCap, computers);
        System.out.println("The serial numbers of the computers expiring the year you entered are as follows: ");
        for(int counter1 = 0; counter1 < computersExpiring.length; counter1++){
            if(computersExpiring[counter1] == null){
                 
            }
            else{
                System.out.println(computersExpiring[counter1]);
            }
        }
        System.out.println("Goodbye!");                    
    }
}
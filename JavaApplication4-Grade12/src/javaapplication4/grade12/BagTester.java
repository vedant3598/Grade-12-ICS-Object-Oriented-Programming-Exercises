//A Java package organizes Java classes into namespaces, giving a different namespace for every type it has. The name of this package is javaapplication4.grade12.
package javaapplication4.grade12;
//The following line of code imports and Scanner, allowing me to utilize it in my program. Without it, I cannot use scanner, allowing me to not obtain the user's input.
import java.util.Scanner;

/**
 *
 * @author Vedant
 * Date: Thursday, October 4, 2018
 * Course Info: ICS3U-14 Teacher: Ms. Navabi
 * Project Information: This is a Java program that imitates a schoolbag containing two binders. The program contains three classes: Binder, SchoolBag and BagTester (which consists of the main method).
 * Two schoolbag objects will be instantiated and the end of the program, the contents in each binder and each schoolbag will be outputted
 */
public class BagTester {
    /**
     * Public allows the main method to be accessible anywhere. Static assists the main method to get loaded and void clarifies that the main method will not output any value. ain is the name of the method.
     * This is required as you can only code after this has been written.
     */
    public static void main(String[] args) {
        //The four lines below creates four binders, two for each schoolbag.
        Binder schoolBagBinder1;
        Binder schoolBagBinder2;
        Binder schoolBagBinder3;
        Binder schoolBagBinder4;
        
        //The following five values are all variables
        int schoolBagID;
        int schoolBagBinderID;
        int removeSheet;
        int addSheet;
        String addOrRemove;
        
        //The two lines below creates two schoolbags.
        SchoolBag schoolBag1;
        SchoolBag schoolBag2;
        
        //Welcomes the user to the program.
        System.out.println("Welcome to School Bag Tester! My name is Vedant and I am the creator of this program! Today, you will be creating two schoolbags each with 2 binders! Good luck!\n\n");
        
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        
        //This gets the style of schoolbag 1.
        System.out.println("Please choose a style you would like to have for school bag 1: ");
        String schoolBagStyle1 = sc1.nextLine();
        System.out.println("");
        
        //This gets the style of schoolbag2.
        System.out.println("Please choose a style you would like to have for school bag 2: ");
        String schoolBagStyle2 = sc1.nextLine();
        System.out.println("");
        
        //This gets all the values from the user to instantiate binder 1.
        System.out.println("Please choose a colour you would like to have on school bag 1, binder 1: ");
        String schoolBagColour1 = sc2.nextLine();
        System.out.println("Please choose a label you would like to have on school bag 1, binder 1: ");
        String schoolBagLabel1 = sc3.nextLine();
        System.out.println("Please choose the amount of paper you would like to have in school bag 1, binder 1: ");
        int schoolBagPaper1 = sc4.nextInt();
        //The line below instantiates binder 1.
        schoolBagBinder1 = new Binder(schoolBagLabel1, schoolBagColour1, schoolBagPaper1);
        System.out.println("");
        
        //This gets all the values from the user to instantiate binder 2.
        System.out.println("Please choose a colour you would like to have on school bag 1, binder 2: ");
        String schoolBagColour2 = sc2.nextLine();
        System.out.println("Please choose a label you would like to have on school bag 1, binder 2: ");
        String schoolBagLabel2 = sc3.nextLine();
        System.out.println("Please choose the amount of paper you would like to have in school bag 1, binder 2: ");
        int schoolBagPaper2 = sc4.nextInt();
        //The line below instantiates binder 2.
        schoolBagBinder2 = new Binder(schoolBagLabel2, schoolBagColour2, schoolBagPaper2);
        System.out.println("");
        
        //The line below instantiates the values of schoolbag 1.
        schoolBag1 = new SchoolBag(schoolBagStyle1, schoolBagLabel1, schoolBagLabel2, schoolBagColour1, schoolBagColour2, schoolBagPaper1, schoolBagPaper2);

        //This gets all the values from the user to instantiate binder 3.
        System.out.println("Please choose a colour you would like to have on school bag 2, binder 1: ");
        String schoolBagColour3 = sc2.nextLine();
        System.out.println("Please choose a label you would like to have on school bag 2, binder 1: ");
        String schoolBagLabel3 = sc3.nextLine();
        System.out.println("Please choose the amount of paper you would like to have in school bag 2, binder 1: ");
        int schoolBagPaper3 = sc4.nextInt();
        //The line below instantiates binder 3.
        schoolBagBinder3 = new Binder(schoolBagLabel3, schoolBagColour3, schoolBagPaper3);
        System.out.println("");
        
        //This gets all the values from the user to instantiate binder 4.
        System.out.println("Please choose a colour you would like to have on school bag 2, binder 2: ");
        String schoolBagColour4 = sc2.nextLine();
        System.out.println("Please choose a label you would like to have on school bag 2, binder 2: ");
        String schoolBagLabel4 = sc3.nextLine();
        System.out.println("Please choose the amount of paper you would like to have in school bag 2, binder 2: ");
        int schoolBagPaper4 = sc4.nextInt();
        //The line below instantiates binder 4.
        schoolBagBinder4 = new Binder(schoolBagLabel4, schoolBagColour4, schoolBagPaper4);
        System.out.println("");
        
        //The line below instantiates schoolbag 2.
        schoolBag2 = new SchoolBag(schoolBagStyle2, schoolBagLabel3, schoolBagLabel4, schoolBagColour3, schoolBagColour4, schoolBagPaper3, schoolBagPaper4);
        
        /*The code in the do-while loop runs until schoolBagID or schoolBagBinderID is -1. What this loop does is that it takes the schoolbag ID and binder ID from the user and asks them if they want to add or remove sheets. 
        * Depending on their answer, the program asks how many sheets the user wants to add or remove from the selected schoolbag and binder. The program then calls the SchoolBag class and Binder class to add or remove the 
        * amount of sheets the wants. It does this until the user wants to quit, and he/she does this so by entering -1.
        */
        do{
            Scanner sc5 = new Scanner(System.in);
            System.out.println("\nTo which school bag would you like to add or remove sheets from (1 or 2): ");
            schoolBagID = sc5.nextInt();
            if(schoolBagID == -1)
                break;
            
            System.out.println("\nTo which binder would you like to add or remove sheets from (1 or 2): ");
            schoolBagBinderID = sc5.nextInt();
            if(schoolBagBinderID == -1)
                break;
            
            System.out.println("\nWould you like add sheets or remove sheets: ");
            addOrRemove = sc3.nextLine();
            if(addOrRemove.equals("Remove") || addOrRemove.equals("remove") || addOrRemove.equals("REMOVE")){
                Scanner sc6 = new Scanner(System.in);
                System.out.println("\nHow many sheets would you like to remove: ");
                removeSheet = sc6.nextInt();
                if(schoolBagID == 1 && schoolBagBinderID == 1){
                    schoolBag1.removeSheets(schoolBagPaper1, removeSheet, schoolBagBinderID, schoolBagID);
                }
                
                else if(schoolBagID == 1 && schoolBagBinderID == 2){
                    schoolBag1.removeSheets(schoolBagPaper2, removeSheet, schoolBagBinderID, schoolBagID);
                }
                
                else if(schoolBagID == 2 && schoolBagBinderID == 1){
                    schoolBag2.removeSheets(schoolBagPaper3, removeSheet, schoolBagBinderID, schoolBagID);
                }
                
                else if(schoolBagID == 2 && schoolBagBinderID == 2){
                    schoolBag2.removeSheets(schoolBagPaper2, removeSheet, schoolBagBinderID, schoolBagID);
                }
            }
            else if(addOrRemove.equals("Add") || addOrRemove.equals("add") || addOrRemove.equals("ADD")){
                System.out.println("\nHow many sheets would you like to add: ");
                addSheet = sc1.nextInt();
                
                if(schoolBagID == 1 && schoolBagBinderID == 1){
                    schoolBag1.addSheets(schoolBagPaper1, addSheet, schoolBagBinderID, schoolBagID);
                }
                
                else if(schoolBagID == 1 && schoolBagBinderID == 2){
                    schoolBag1.addSheets(schoolBagPaper2, addSheet, schoolBagBinderID, schoolBagID);
                }
                
                else if(schoolBagID == 2 && schoolBagBinderID == 1){
                    schoolBag2.addSheets(schoolBagPaper3, addSheet, schoolBagBinderID, schoolBagID);
                }
                
                else if(schoolBagID == 2 && schoolBagBinderID == 2){
                    schoolBag2.addSheets(schoolBagPaper4, addSheet, schoolBagBinderID, schoolBagID);
                }
                
            }
            
        }while(schoolBagBinderID != -1 || schoolBagID != -1);
        
        //The four lines below prints out all the information of the four binders.
        System.out.println("\n\n" + schoolBagBinder1.toString());
        System.out.println(schoolBagBinder2.toString());
        System.out.println(schoolBagBinder3.toString());
        System.out.println(schoolBagBinder4.toString());
        
        //The two lines below print out all the information of the two schoolbags.
        System.out.println("\nThe style and weight of schoolbag 1 is: " + schoolBagStyle1 + ", " + schoolBag1.toString() + " grams.");
        System.out.println("The style and weight of schoolbag 2 is: " + schoolBagStyle2 + ", " + schoolBag2.toString() + " grams.");
    }
    
}

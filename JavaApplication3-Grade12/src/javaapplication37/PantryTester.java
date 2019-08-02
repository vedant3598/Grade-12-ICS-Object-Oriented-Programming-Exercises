package javaapplication37;

import java.util.Scanner;

/**
 *
 * @author Vedant & Eduard
 */
public class PantryTester {
    public static void main(String[] args){
        Jam jam1 = new Jam("Strawberry", "5/10/19", 12);
        Jam jam2 = new Jam("Blueberry ", "8/12/19", 8);
        Jam jam3 = new Jam("Apple     ", "12/1/19", 10);
       
        Pantry pantry = new Pantry(jam1, jam2, jam3);
        Scanner sc1 = new Scanner(System.in);
        
        int number = 0;
        int selectionNum = 0;
        double spreadNum = 0;
        System.out.println("Welcome to Mother Hubbard's Pantry!\n");
        
        while(selectionNum != -1){
            System.out.println("The jams are: ");
            System.out.println("1: " + pantry.getJ1().toString());
            System.out.println("2: " + pantry.getJ2().toString());
            System.out.println("3: " + pantry.getJ3().toString());
            
            System.out.println("Enter your selection (1, 2, or 3): ");
            selectionNum = sc1.nextInt();
            if(selectionNum > 3 || selectionNum < -2){
                System.out.println("Value out of bounds! Try again!");
                continue;
            }
            
            if(selectionNum == -1){
                break;
            }
            
            System.out.println("Enter amount to spread: ");
            spreadNum = sc1.nextDouble();
            
            if(spreadNum < 0){
                System.out.println("Value out of bounds! Try again!");
                continue;
            }

            if (selectionNum == 1){
                System.out.println(pantry.spreadJam(spreadNum, jam1));
            }
            else if (selectionNum == 2){
                System.out.println(pantry.spreadJam(spreadNum, jam2));
            }
            else if (selectionNum == 3){
                System.out.println(pantry.spreadJam(spreadNum, jam3));
            }
        }
        System.out.println("Goodbye!");
    }
}

package javaapplication10.grade12;

/**
 *
 * @author Vedant Shah
 * Course Code: ICS4U Teacher: Ms. Navabi
 * Program Description: This is an assignment that I have created using the UML diagrams and Specifications my teacher has provided me with.
 */
public class Main {

    public static void main(String[] args) {
        //Declare and intialization of two Zoo objects
        Zoo zoo1 = new Zoo("Metro Toronto Zoo", "361A Old Finch Avenue, Toronto, ON, Canada");
        Zoo zoo2 = new Zoo("New York Zoo", "13th Avenue, New York, New York, USA");
        
        //Adding the animals and insects in zoo 1.
        zoo1.addAnimal("Kermit", "Frog", 1, "Reeebit");
        zoo1.addAnimal("King Kong", "Ape", 10, "Rooar!");
        zoo1.addAnimal("Wally", "Walrus", 2, "Woof!");
        zoo1.addInsect("Crawly", 6, 0.2, false, "psssss");
        zoo1.addInsect("Pester", 6, 0.4, true, "Bzzzz bzzzz");
        
        //Adding the animals and insects in zoo 2.
        zoo2.addAnimal("Willy", "Whale", 40, "bahhh!");
        zoo2.addAnimal("Jimbo", "Dolphin", 21, "mmmmm!");
        zoo2.addInsect("Slimy", 8, 1, false, "Zzzzip");
        zoo2.addInsect("Gabby", 12, 3.4, true, "Bzzzz bzzzz");
        
        //Prints out the information of zoo 1.
        zoo1.printInfo();
        System.out.println("\n");
        //Prints out the information of zoo 2.
        zoo2.printInfo();
    }
}
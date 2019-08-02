package javaapplication12.grade12;

/**
 * @author Vedant Shah
 * Course Code: ICS4U Teacher: Ms. Navabi
 * Program Description: This is an assignment that I have created using the UML diagrams and Specifications my teacher has provided me with.
 */
public class MainTester {
    public static void main(String[] args){
        
        Motorcycle motorcycle = new Motorcycle(85, "SFX", "Changer 3", (short)2016, "Orange", (byte)2, 85); //Creates a Motorcycle object
        CubeVan cubeVan = new CubeVan(8.5, "Tesla", "Model x", (short)2018, "Red", (byte)4, 70); //Creates a CubeVan object
        Car car = new Car(5, "Toyota", "Corolla", (short)2015, "Blue", (byte)4, 50); //Creates a Car object
        
        //The following few lines uses all of the methods that exist in the Motorcycle class and Vehicle class.
        System.out.println("The motorcycle's engine is " + motorcycle.getEngineSize() + " cubic inches.");
        motorcycle.paint("Blue");
        motorcycle.gasUp(25);
        System.out.println("The kilometres added to the motorcycle is: " + motorcycle.drive(15) + ".");
        motorcycle.gasUp(15);
        motorcycle.paint("Green");
        
        //The following few lines uses all of the methods that exist in the CubeVan class and Vehicle class.
        System.out.println("The cube van filled is: " + cubeVan.fillCubeVan(8.5) + ".");
        System.out.println("The cube van emptied is: " + cubeVan.currentCapacity() + ".");
        cubeVan.emptyCubeVan();
        cubeVan.paint("Black");
        cubeVan.gasUp(50);
        System.out.println("The kilometres added to the cube van is: " + cubeVan.drive(8) + ".");
        System.out.println("The cube van filled is: " + cubeVan.fillCubeVan(5.5) + ".");
        
        //The following few lines uses all of the methods that exist in the Car class and Vehicle class.
        System.out.println("The addition of 5 passengers is: " + car.addNumPassenger(5) + ".");
        System.out.println("There are " + car.getNumPassengers() + " passengers in the car.");
        car.removePassenger(3);
        System.out.println("The kilometres added to the car is: " + car.drive(100) + ".");
        car.gasUp(35);
        car.paint("White");
        System.out.println("The addition of 6 passengers is: " + car.addNumPassenger(6) + ".");
        
    }
}

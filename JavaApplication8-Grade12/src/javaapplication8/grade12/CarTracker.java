package javaapplication8.grade12;
import java.util.Scanner;

/**
 *
 * @author Vedant
 */
public class CarTracker {
    public static void main(String[] args){
        //Creates an array of cars
        Car[] cars;
        System.out.println("Welcome to Car Tracker!");
        
        //Price of gas
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the price of gas: ");
        double gasPrice = sc1.nextDouble();
        
        //Number of cars owner has
        System.out.print("\nEnter the number of cars you own: ");
        int carsOwned = sc1.nextInt();
        cars = new Car[carsOwned];
        
        //Obtains information on the car
        int i = 1;
        for(int counter1 = 0; counter1 < cars.length; counter1++){
            System.out.print("\nEnter information for car #" + i + ":");
            System.out.print("\nPrevious odometer reading: ");
            double previousOdometer = sc1.nextDouble();
            System.out.print("\nMost recent odometer reading: ");
            double currentOdometer = sc1.nextDouble();
            System.out.print("\nLitres of gas used between the readings: ");
            double litresUsed = sc1.nextDouble();
            cars[counter1] = new Car(previousOdometer, currentOdometer, litresUsed);
            i++;
        }
        
        //Determines if car is fuel-efficient
        String car = "Car #";
        i = 1;
        for(int counter1 = 0; counter1 < cars.length; counter1++){
            System.out.print("\n" + car + i + ":");
            double kilometres = cars[counter1].calculateKPL();
            System.out.print("\nFuel efficiency: " + cars[counter1].calculateKPL() + " km / litre");
            if(cars[counter1].gasHog(kilometres) == true)
                System.out.println("\nIt is a Gas Hog.");
            if(cars[counter1].economyCar(kilometres) == true)
                System.out.println("It is an Economy Car.");
        }
        
        //Determines which car is fuel efficient
        Car moreEfficient = cars[0];
        for(int counter1 = 0; counter1 < cars.length; counter1++){
            moreEfficient = moreEfficient.compareTo(cars[counter1]);
            i = counter1 + 1;
        }
        System.out.println("\nCar #" + i + " is more fuel-efficient with " + moreEfficient.calculateKPL() + " km / litre");
    
        //Allows user to "fill-up" car and outputs cose of gas and latest fuel-efficiency
        int num = 0;
        while(num >= 0 && num < cars.length - 1){
            System.out.print("\nFill up for car #: ");
            num = sc1.nextInt();
            System.out.print("\nCurrent odometer reading: ");
            double currentOdometer = sc1.nextDouble();
            System.out.print("\nNumber of litres to fill the tank: ");
            double litresToFill = sc1.nextDouble();
            double gasCost = cars[num - 1].fillUp(currentOdometer, litresToFill);
            System.out.print("\nCost of gas: $" + gasCost + "\n" + cars[num - 1].toString());
        }
    }     
}

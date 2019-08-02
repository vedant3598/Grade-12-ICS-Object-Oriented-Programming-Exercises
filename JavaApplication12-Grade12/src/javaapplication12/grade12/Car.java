package javaapplication12.grade12;

public class Car extends Vehicle{
    
    private int maxPassengers; //Maximum number of passengers that can be in the car
    private int numPassengers; //The current number of passengers that are in the car
    
    //Constuctor that constructs a Car object according to the specified parameters.
    public Car(int maxPass, String manu, String model, short year, String colour, byte nDoors, float tankS){
        super(manu, model, year, colour, nDoors, tankS);
        this.maxPassengers = maxPass;
    }
    
    //This method below eturns the current number of passengers that are in the car.
    public int getNumPassengers() {
        return numPassengers;
    }  
    
    //This method adds passengers in the car and returns true. However, if the car has reached its maximum number of passengers, it returns false.
    public boolean addNumPassenger(int num){
        boolean successful = false;
        if(this.numPassengers + num <= this.maxPassengers){
            this.numPassengers += num;
            successful = true;
        }
        else
            successful = false;
        return successful;
    }
    
    //This method removes passengers from the car.
    public void removePassenger(int num){
        if(this.numPassengers - num > 0)
            this.numPassengers -= num;
    }
}

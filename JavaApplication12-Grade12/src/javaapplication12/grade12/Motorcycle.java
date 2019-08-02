package javaapplication12.grade12;

/**
 *
 * @author Vedant
 */
public class Motorcycle extends Vehicle{
    private double engineSize; //The motorcycle's engine size 
     
    //Constuctor that constructs a Motorcycle object according to the specified parameters.
    public Motorcycle(double sizeEngine, String manu, String model, short year, String colour, byte nDoors, float tankS){
        super(manu, model, year, colour, nDoors, tankS);
        this.engineSize = sizeEngine;
    }
    
    /**
     * @return the engineSize
     */
    public double getEngineSize() {
        return engineSize;
    }
}

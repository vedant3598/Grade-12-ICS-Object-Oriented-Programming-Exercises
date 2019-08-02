package javaapplication12.grade12;

/**
 *
 * @author Vedant
 */
public class CubeVan extends Vehicle{
    private double capacity; //Current capacity of the cube van
    private double maxCapacity; //Maximum capacity the cube van can hold
    
    //Constuctor that constructs a CubeVan object according to the specified parameters.
    public CubeVan(double maxCapacity, String manu, String model, short year, String colour, byte nDoors, float tankS){
        super(manu, model, year, colour, nDoors, tankS);
        this.maxCapacity = maxCapacity;
        this.capacity = 0;
    }
    
    //This method fills the cube van and returns true. However, if the cube van has reached its maximum capacity, the program returns false.
    public boolean fillCubeVan(double fill){
        boolean cubeVanFilled = true;
        if(fill + this.capacity <= this.maxCapacity){
            this.capacity = fill;
            cubeVanFilled = true;
        }
        else{
            System.out.println("Cube van cannot be filled!");
            cubeVanFilled = false;
        }
        return cubeVanFilled;
    }
    
    //This method empties the cube van to zero.
    public void emptyCubeVan(){
        if(this.capacity - this.capacity == 0)
            this.capacity -= this.capacity;
        else
            System.out.println("Cube van cannot be emptied!");
    }
    
    //This method returns the current capacity of the CubeVan object that is called.
    public double currentCapacity(){
        return this.capacity;
    }
}

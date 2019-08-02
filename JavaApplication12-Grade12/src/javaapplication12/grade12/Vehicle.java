package javaapplication12.grade12;

/**
 *
 * @author Vedant
 */
class Vehicle {

    private String manufacturer; //Manufacturer of the vehicle
    private String model; //Model of the vehicle
    private short year; //Year the vehicle was made
    private String colour; //Colour of the vehicle
    private byte numOfDoors; //Number of doors the vehicle has
    private float gasTankSize; //Vehicle's gas tank size
    private float gas; //Amount of gas the vehicle has
    private int km; //Kilometres the vehicle has been driven
    
    //Constuctor that constructs a Vehicle object.
    public Vehicle(){
        
    }
    
    //Constuctor that constructs a Vehicle object according to the specified parameters.
    public Vehicle(String manu, String model, short year, String colour, byte nDoors, float tankS){
        this.manufacturer = manu;
        this.model = model;
        this.year = year;
        this.colour = colour; 
        this.numOfDoors = nDoors;
        this.gasTankSize = tankS;
        gas = 0;
        km = 0; 
    }
    
    //This method paints the vehicle a new colour.
    public void paint(String colour){
        this.colour = colour;
    }
    
    //This method adds gas to the vehicle.
    public void gasUp(int litres){
        this.gas += litres;
    }
    
    //This method increase the number of kilometres the vehicle has been driven.
    public boolean drive(int distance){
        this.km += distance;
        return true;
    }
    
    /**
     * @return the manufacturer
     */
    public String getManufact() {
        return manufacturer;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @return the year
     */
    public short getYear() {
        return year;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @return the numOfDoors
     */
    public byte getDoors() {
        return numOfDoors;
    }

    /**
     * @return the gasTankSize
     */
    public float getTankSize() {
        return gasTankSize;
    }

    /**
     * @return the gas
     */
    public float getGasLeft() {
        return gas;
    }

    /**
     * @return the km
     */
    public int getKM() {
        return km;
    }   
}

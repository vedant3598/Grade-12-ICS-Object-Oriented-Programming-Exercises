//A Java package organizes Java classes into namespaces, giving a different namespace for every type it has. The name of this package is javaapplication35.grade12.
package javaapplication35.grade12;

/**
 *
 * @author Vedant
 */
public class Computer {

    //The following seven lines are all private variables which stores the information for each computer object.
    private String serialNumber;
    private String manufacturer;
    private int yearMade;
    private int yearBought;
    private double processorSpeed;
    private int sizeRAM;
    private int yearExpiry;

    //A constructor that initializes the instance variables of the computer object being constructed.
    public Computer(String s, String m, int y, int z, double sp, int r, int e){
        serialNumber = s;
        manufacturer = m;
        yearMade = y;
        yearBought = z;
        processorSpeed = sp;
        sizeRAM = r;
        yearExpiry = e;
    }
    
    //This method compares the speed, in GHz, of two computer objects.
    public String compareSpeed(Computer c1){
        String output = "";
        if(this.getProcessorSpeed() > c1.getProcessorSpeed())
            output = this.getSerialNumber();
        
        else if(this.getProcessorSpeed() < c1.getProcessorSpeed())
            output = c1.getSerialNumber();
        
        else
            output = this.getSerialNumber();
        return output;
    } 
    
    //This method compares the RAM size, in GB, of two computer objects.
    public String compareRamSize(Computer c1){
        String output = "";
        if(this.getSizeRAM() > c1.getSizeRAM())
            output = Integer.toString(this.getSizeRAM());
        
        else if(this.getSizeRAM() < c1.getSizeRAM())
            output = Integer.toString(c1.getSizeRAM());
        
        else
            output = Integer.toString(this.getSizeRAM());
        return output;
    }
    
    //This method compares the age of two computer objects.
    public String compareComputerAge(Computer c1){
        String output = "";
        if(this.getYearMade()> c1.getYearMade())
            output = Integer.toString(this.getYearMade());
        
        else if(this.getYearMade() < c1.getYearMade())
            output = Integer.toString(c1.getYearMade());
        
        else
            output = Integer.toString(this.getYearMade());   
        return output;
    }
    
    //This method allows the output of any computer object's information in an organized manner when it is called in the LabTester.
    public String toString(){
        return "Serial Number: " + this.serialNumber + "  Manufacturer: " + this.manufacturer + "  Year Made: " + this.yearMade
                + "  Year Bought: " + this.yearBought + "  Processor Speed in GHz: " + this.processorSpeed + "  RAM Size in GB: " + this.sizeRAM
                + "  Warranty Expiry Year: " + this.yearExpiry;
    }
    
    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the yearMade
     */
    public int getYearMade() {
        return yearMade;
    }

    /**
     * @param yearMade the yearMade to set
     */
    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    /**
     * @return the yearBought
     */
    public int getYearBought() {
        return yearBought;
    }

    /**
     * @param yearBought the yearBought to set
     */
    public void setYearBought(int yearBought) {
        this.yearBought = yearBought;
    }

    /**
     * @return the processorSpeed
     */
    public double getProcessorSpeed() {
        return processorSpeed;
    }

    /**
     * @param processorSpeed the processorSpeed to set
     */
    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    /**
     * @return the sizeRAM
     */
    public int getSizeRAM() {
        return sizeRAM;
    }

    /**
     * @param sizeRAM the sizeRAM to set
     */
    public void setSizeRAM(int sizeRAM) {
        this.sizeRAM = sizeRAM;
    }

    /**
     * @return the yearExpiry
     */
    public int getYearExpiry() {
        return yearExpiry;
    }

    /**
     * @param yearExpiry the yearExpiry to set
     */
    public void setYearExpiry(int yearExpiry) {
        this.yearExpiry = yearExpiry;
    } 
}
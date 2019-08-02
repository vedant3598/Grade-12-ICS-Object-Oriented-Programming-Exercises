//A Java package organizes Java classes into namespaces, giving a different namespace for every type it has. The name of this package is javaapplication35.grade12.
package javaapplication35.grade12;

/**
 *
 * @author Vedant
 */
public class Lab {
    //The following two values are all variables, which are all private.
    
    //Maximum capacity of the lab
    private int maxCapacity;
    //Number of computers installed
    private int compInstalled;
    
    //The line below creates a private array of computer objects.
    
    //An array utilized to store the computers
    private Computer[] computers;
    
    //A constructor that initiates the maximum capacity and creates an array of appropriate size.
    public Lab(int m){
        maxCapacity = m;
        computers = new Computer[maxCapacity];
    }
    
    //A method which takes the information of a computer as a parameter, and then creates a “Computer” object accordingly and inserts it into the array.
    public Computer installComputer(String s, String m, int y, int z, double sp, int r, int e, int arrayNum){
        computers[arrayNum] = new Computer(s, m, y, z, sp, r, e);
        return computers[arrayNum];
    }
    
    //A method that calculates the average age of the computers in the lab
    public double computerAverage(Computer[] computer){
        int year = 2018;
        int averageAge = 0;
        for(int counter1 = 0; counter1 < computer.length; counter1++)
            averageAge += year - computer[counter1].getYearMade();
        return averageAge/computer.length;
    }
    
    //A method that returns the newest computer in the lab
    public Computer newComp(Computer[] computer){
        Computer newComputer = computer[0];
        int i = computer[0].getYearMade();
        for(int counter1 = 0; counter1 < computer.length; counter1++){
            if(i < computer[counter1].getYearMade()){
                i = computer[counter1].getYearMade();
                newComputer = computer[counter1];
            }
        }
        return newComputer;
    }
    
    //A method that returns the faster computer (highest speed) in the lab
    public Computer fastestComp(Computer[] computer){
        Computer newComputer = computer[0];
        double i = computer[0].getProcessorSpeed();
        for(int counter1 = 0; counter1 < computer.length; counter1++){
            if(i < computer[counter1].getProcessorSpeed()){
                i = computer[counter1].getProcessorSpeed();
                newComputer = computer[counter1];
            }
        }
        return newComputer;
    }

    //A method that returns the computer with the largest size of RAM
    public Computer highestRamComp(Computer[] computer){
        Computer newComputer = computer[0];
        int i = computer[0].getSizeRAM();
        for(int counter1 = 0; counter1 < computer.length; counter1++){
            if(i < computer[counter1].getSizeRAM()){
                i = computer[counter1].getSizeRAM();
                newComputer = computer[counter1];
            }
        }
        return newComputer;
    }
    
    //A method that returns the number computers that are made by the given manufacturer, which is passed as a parameter
    public int numOfManufacturer(String companyName, Computer[] computer){
        int i = 0;
        for(int counter1 = 0; counter1 < computer.length; counter1++){
            if(computer[counter1].getManufacturer().equals(companyName)){
                i++;
            }
        }
        return i;
    }
    
    //A method that returns a list (an array) of computers that are expiring in the next year 
    public String[] expiringComp(int expiryDate, int installedComp, Computer[] computer){
        String[] computersExpiring = new String[installedComp];
        int i = 0;
        for(int counter1 = 0; counter1 < computer.length; counter1++){
            if(expiryDate == computer[counter1].getYearExpiry()){
                i++;
                computersExpiring[counter1] = computer[counter1].getSerialNumber();
            }
        }
        return computersExpiring;
    }
    
    /**
     * @return the maxCapacity
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * @param maxCapacity the maxCapacity to set
     */
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * @return the compInstalled
     */
    public int getCompInstalled() {
        return compInstalled;
    }

    /**
     * @param compInstalled the compInstalled to set
     */
    public void setCompInstalled(int compInstalled) {
        this.compInstalled = compInstalled;
    }

    /**
     * @return the computers
     */
    public Computer[] getComputers() {
        return computers;
    }

    /**
     * @param computers the computers to set
     */
    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }
}

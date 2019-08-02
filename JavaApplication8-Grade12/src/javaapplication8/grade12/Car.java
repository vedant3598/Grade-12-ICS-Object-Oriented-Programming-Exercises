package javaapplication8.grade12;

/**
 *
 * @author Vedant
 */
public class Car {

    //Three instance fields
    private double secLastKm; //Second last odometer reading
    private double recentKm; //Most recent odometer reading
    private double litre; //Litres of gas used between the readings
    
    //Three class fields
    private static double gasPrice; //Price per litre
    private static final double EFFICIENT_KPL = 13; //Efficient car
    private static final double INEFFICIENT_KPL = 7; //Inefficient car
    
    //Constructor that initializes a car object
    public Car(double secondLast, double recent, double l){
        secLastKm = secondLast;
        recentKm = recent;
        litre = l;
    }
    
    //Calculate kilometres per litre
    public double calculateKPL(){
        double kilometre = (this.getRecentKm() - this.getSecLastKm()) / this.getLitre();
        return kilometre;
    }
    
    //Determines if car is gas hog
    public Boolean gasHog(double kilometrePerLitre){
        if(kilometrePerLitre < INEFFICIENT_KPL)
            return true;
        else
            return false;
    }
    
    //Determines if car is an economic car
    public Boolean economyCar(double kilometrePerLitre){
        if(kilometrePerLitre > EFFICIENT_KPL)
            return true;
        else
            return false;
    }
    
    public double fillUp(double kms, double litres){
        double fuelUsed = kms - this.recentKm;
        this.secLastKm = recentKm;
        this.recentKm = kms;
        litre = litres;
        double gasCost = (fuelUsed / litres) * 2;
        return gasCost;
    }
    
    //Compares two cars and returns most efficient car
    public Car compareTo(Car other){
        Car efficientCar;
        double carKPL1 = (this.recentKm - this.secLastKm) / this.litre;
        double carKPL2 = (other.getRecentKm() - other.getSecLastKm()) / other.getLitre();
        if(carKPL1 > carKPL2){
            efficientCar = this;
        }
        else 
            efficientCar = other;
        return efficientCar;
    }
    
    //Returns information about the car
    public String toString(){
        return "Latest fuel-efficiency: " + (this.getRecentKm() - this.getSecLastKm()) / this.getLitre() + "km / litre";
    }
            
    /**
     * @param aGasPrice the gasPrice to set
     */
    public static void setGasPrice(double aGasPrice) {
        gasPrice = aGasPrice;
    }

    /**
     * @return the secLastKm
     */
    public double getSecLastKm() {
        return secLastKm;
    }

    /**
     * @param secLastKm the secLastKm to set
     */
    public void setSecLastKm(double secLastKm) {
        this.secLastKm = secLastKm;
    }

    /**
     * @return the recentKm
     */
    public double getRecentKm() {
        return recentKm;
    }

    /**
     * @param recentKm the recentKm to set
     */
    public void setRecentKm(double recentKm) {
        this.recentKm = recentKm;
    }

    /**
     * @return the litre
     */
    public double getLitre() {
        return litre;
    }

    /**
     * @param litre the litre to set
     */
    public void setLitre(double litre) {
        this.litre = litre;
    }
}
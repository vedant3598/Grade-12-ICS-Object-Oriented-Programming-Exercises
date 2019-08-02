package javaapplication10.grade12;

/**
 *
 * @author Vedant Shah
 */
public class Insect {

    private String name; //Name of insect
    private int numOfLegs; //Number of legs the insect has
    private double age; //Age of insect
    private boolean wings; //If the insect has wings or not
    private String noise; //Noise the insect makes
    
    //Constructor constructs an Insect object.
    public Insect(String nam, int nlegs, double a, boolean w, String n){
        this.name = nam;
        this.numOfLegs = nlegs;
        this.wings = w;
        this.age = a;
        this.noise = n;
    }
    
    //Outputs all the information for the specified Insect.
    public String printInfo(){
        return "Name: " + this.getName() + " Number of Legs: " + this.getNumOfLegs() + " Age: " + this.getAge() + " Wings: " + this.isWings() + " Noise: " + this.getNoise();
    }
    
    //Outputs the noise for the Insect.
    public void talk(){
        System.out.println("Noise: " + this.getNoise());
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the numOfLegs
     */
    public int getNumOfLegs() {
        return numOfLegs;
    }

    /**
     * @param numOfLegs the numOfLegs to set
     */
    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    /**
     * @return the age
     */
    public double getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(double age) {
        this.age = age;
    }

    /**
     * @return the wings
     */
    public boolean isWings() {
        return wings;
    }

    /**
     * @param wings the wings to set
     */
    public void setWings(boolean wings) {
        this.wings = wings;
    }

    /**
     * @return the noise
     */
    public String getNoise() {
        return noise;
    }

    /**
     * @param noise the noise to set
     */
    public void setNoise(String noise) {
        this.noise = noise;
    }
}

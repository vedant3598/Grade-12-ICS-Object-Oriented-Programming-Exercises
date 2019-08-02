package javaapplication10.grade12;

/**
 *
 * @author Vedant Shah
 */
public class Animal {

    private String name; //Name of animal
    private String species; //Species the animal is from
    private int age; //Age of animal
    private String noise; //Noise the animal makes
    
    //Constructor that constructs a Animal object.
    public Animal(String nam, String spec, int a, String n){
        this.name = nam;
        this.species = spec;
        this.age = a;
        this.noise = n;
    }
    
    //Outputs all the information for the specified Animal.
    public String printInfo(){
        return "Name: " + this.name + " Species: " + this.species + " Age: " + this.age + " Noise: " + this.noise;
    }
    
    //Outputs the noise for the Animal.
    public void talk(){
        System.out.println("Noise: " + this.noise);
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
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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

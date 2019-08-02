package javaapplication10.grade12;
import java.util.ArrayList;

/**
 *
 * @author Vedant Shah
 */
public class Zoo {

    private String name; //Zoo name
    private String location; //Zoo name
    private ArrayList<Animal> animals = new ArrayList<Animal>(); //ArrayList of Animal objects
    private ArrayList<Insect> insects = new ArrayList<Insect>(); //ArrayList of Insect objects
    
    //Constructor that constructs a Zoo object.
    public Zoo(String nam, String loc){
        this.name = nam;
        this.location = loc;
    }
    
    //Outputs the zoo name and location, including all the information for each Animal and Insect in that zoo.
    public void printInfo(){
        System.out.println("Zoo Name: " + this.name + " Zoo Location: " + this.location);
        System.out.println("\nAnimals: ");
        for(int counter1 = 0; counter1 < animals.size(); counter1++){
            System.out.println(animals.get(counter1).printInfo() + "\n");
        }
        System.out.println("Insects: ");
        for(int counter1 = 0; counter1 < insects.size(); counter1++){
            System.out.println(insects.get(counter1).printInfo() + "\n");
        }
    }
    
    //Adds an Animal object to the ArrayList of Animals in the zoo.
    public void addAnimal(String nam, String spec, int a, String n){
        animals.add(new Animal(nam, spec, a, n));
    }
    
    //Adds an Insect object to the ArrayList of Insects in the zoo.
    public void addInsect(String nam, int nlegs, double a, boolean w, String n){
        insects.add(new Insect(nam, nlegs, a, w, n));
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
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * @return the animals
     */
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    /**
     * @param animals the animals to set
     */
    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    /**
     * @return the insects
     */
    public ArrayList<Insect> getInsects() {
        return insects;
    }

    /**
     * @param insects the insects to set
     */
    public void setInsects(ArrayList<Insect> insects) {
        this.insects = insects;
    }
}

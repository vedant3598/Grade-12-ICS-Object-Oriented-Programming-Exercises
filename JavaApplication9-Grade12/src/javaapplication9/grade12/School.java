package javaapplication9.grade12;

/**
 *
 * @author Vedant Shah
 */
public class School {
    private String name; //School's name
    private String address; //School's address
    private int capacity; //Maximum capacity of students school can hold
    
    //Constructor that constructs a School object.
    public School(String nam, String add, int cap){
        this.name = nam;
        this.address = add;
        this.capacity = cap;
    }
    
    //Prints all the information of the specified School object.
    public String toString(){
        return "Name: " + this.name + " Address: " + this.address + " Capacity: " + this.capacity;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
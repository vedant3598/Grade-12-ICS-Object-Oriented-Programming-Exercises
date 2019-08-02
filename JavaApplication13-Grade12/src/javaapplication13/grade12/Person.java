package javaapplication13.grade12;

/**
 *
 * @author Vedant Shah
 */
public class Person {

    private String fname; //Person's first name
    private String lname; //Person's last name
    private String DOB; //Person's date of birth
    private double height; //Person's height
    private double weight; //Persons' weight
     
    //Constuctor that constructs a Person object.
    public Person(){
        
    }
    
    //Constuctor that constructs a Person object according to the specified parameters.
    public Person(String first, String last, String DOB, double height, double weight){
        this.fname = first;
        this.lname = last;
        this.DOB = DOB;
        this.height = height;
        this.weight = weight;
    }
    
    //Returns true or false depending on if the person's weight is set or not.
    public boolean setWeight(double w){
        boolean successful = true;
        if(w > 0){
            this.weight = w;
            successful = true;
        }
        else
            successful = false;
        return successful;
    }
    
    //Returns true or false depending on if the person's height is set or not.
    public boolean setHeight(double h){
        boolean successful = true;
        if(h > 0){
            this.weight = h;
            successful = true;
        }
        else
            successful = false;
        return successful;
    }
    
    /**
     * @return the Name
     */
    public String getName() {
        return fname + " " + lname;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }
    
    //Returns year of the person's birthdate
    public int getDOB_year() {
        String year = this.DOB.split("/")[0];
        return Integer.parseInt(year);
    }
    
    //Returns month of the person's birthdate
    public int getDOB_month(){
        String year = this.DOB.split("/")[1];
        return Integer.parseInt(year);
    }
    
    //Returns day of the person's birthdate
    public int getDOB_day(){
        String year = this.DOB.split("/")[2];
        return Integer.parseInt(year);
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }
}

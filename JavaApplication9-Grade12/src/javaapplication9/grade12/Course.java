package javaapplication9.grade12;

/**
 *
 * @author Vedant Shah
 */
public class Course {
    private String code; //Course code
    private String name; //Course name
    private String level; //Course level
    
    //Constructor that constructs a Course object.
    public Course(String cod, String nam, String lv){
        this.code = cod;
        this.name = nam;
        this.level = lv;
    }
    
    //Prints all the information of the specified Course object.
    public String toString(){
        return "Name: " + this.name + " Code: " + this.code + " Level: " + this.level;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
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
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(String level) {
        this.level = level;
    }
}
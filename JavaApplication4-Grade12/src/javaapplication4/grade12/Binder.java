//A Java package organizes Java classes into namespaces, giving a different namespace for every type it has. The name of this package is javaapplication4.grade12.
package javaapplication4.grade12;
/**
 *
 * @author Vedant
 */
public class Binder {

    //The following three values are all variables, which are all private.
    private String label;
    private String colour;
    private int numOfSheetsOfPaper;
    
    //The following two values are all constants, which are all private.
    private final int weightOfSheetOfPaper = 2;
    private final int weightOfEmptyBinder = 11;
    
    //A constructor that initializes the instance variables of the object being constructed.
    public Binder(String l, String c, int numOfSheets){
        label = l;
        colour = c;
        numOfSheetsOfPaper = numOfSheets;
    }
    
    //Adds sheets to the binder.
    public int addSheets(int numSheets){
        return numOfSheetsOfPaper += numSheets;
    }
    
    //Calculates the total weight of the binder (with the sheets in it).
    public int weightOfBinder(){
         return (weightOfEmptyBinder + (weightOfSheetOfPaper * numOfSheetsOfPaper));
     
    }
    
    //Compares the weight of the implicit and explicit binder.
    public Binder larger(Binder b){
        if(this.weightOfBinder() > b.weightOfBinder())
            return this;
        else
            return b;
    }
    
    //Prints out the information of the binder that calls this method by returning binderInformation.
    public String toString(){
        String binderInformation = "Label: " + this.getLabel() + "   Colour: " + this.getColour() + "   Number of Sheets of Paper: " + this.weightOfBinder() + "   Weight: " + this.weightOfBinder() + " grams";
        return binderInformation;
    }
    
    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the numOfSheetsOfPaper
     */
    public int getNumOfSheetsOfPaper() {
        return numOfSheetsOfPaper;
    }

    /**
     * @param numOfSheetsOfPaper the numOfSheetsOfPaper to set
     */
    public void setNumOfSheetsOfPaper(int numOfSheetsOfPaper) {
        this.numOfSheetsOfPaper = numOfSheetsOfPaper;
    }

    /**
     * @return the weightOfSheetOfPaper
     */
    public int getWeightOfSheetOfPaper() {
        return weightOfSheetOfPaper;
    }

    /**
     * @return the weightOfEmptyBinder
     */
    public int getWeightOfEmptyBinder() {
        return weightOfEmptyBinder;
    }
    
}

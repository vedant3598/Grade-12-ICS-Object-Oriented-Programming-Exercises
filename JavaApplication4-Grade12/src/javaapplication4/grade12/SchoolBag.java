//A Java package organizes Java classes into namespaces, giving a different namespace for every type it has. The name of this package is javaapplication4.grade12.
package javaapplication4.grade12;

/**
 *
 * @author Vedant
 */
public class SchoolBag {

    //The following three values are all variables, which are all private.
    private String style;
    private int numOfSheetsOfPaper;
    private int totalNumOfSheets = 0;
    
    //The following two lines creates two Binders, which are all private.
    private Binder binder1;
    private Binder binder2;
    
    //The following three values are all constants, which are all private.
    private final int weightOfEmptySchoolBag = 15;
    private final int weightOfSheetOfPaper = 2;
    private final int weightOfEmptyBinder = 11;
    
    //The constructor below takes two object reference parameters. The two objects will be the two binders in the schoolbag.
    public SchoolBag(Binder b1, Binder b2){
        binder1 = b1;
        binder2 = b2;
    }
    
    //The constructor below takes as parameters all the information of the two binders.  The two binders will be created in the constructor and assigned to the corresponding fields.
    public SchoolBag(String style, String lbl1, String lbl2, String colour1, String colour2, int numOfSheets1, int numOfSheets2){
        Binder binder1 = new Binder(lbl1, colour1, numOfSheets1);
        Binder binder2 = new Binder(lbl2, colour2, numOfSheets2);
    }
    
    //Adds sheet(s) to given binder (specified by id / index).
    public int addSheets(int numSheets, int addingSheets, int binderID, int schoolBagID){
        this.setTotalNumOfSheets(addingSheets + numSheets);
        this.setNumOfSheetsOfPaper(addingSheets + numSheets);
        return getNumOfSheetsOfPaper();
    } 
    
    //Removes sheet(s) from given binder (specified by id / index).
    public int removeSheets(int numSheets, int removingSheets, int binderID, int schoolBagID){
        setTotalNumOfSheets(numSheets - removingSheets);
        this.setNumOfSheetsOfPaper(numSheets - removingSheets);
        return this.getNumOfSheetsOfPaper();
    } 

    //Calculates the average weight of a binder in the schoolbag.
    public int weightOfBinder(){
        int binderWeight = (this.getTotalNumOfSheets() * getWeightOfSheetOfPaper()) + getWeightOfEmptyBinder();
        return binderWeight;
    }
    
    //Calculates the total weight of the schoolbag (with the binders).
    public int schoolBagWeight(){
        int totalSchoolBagWeight = weightOfEmptySchoolBag + this.weightOfBinder();
        return totalSchoolBagWeight;
    }
    
    //Prints out the information of the schoolbag that calls this method by returning this.schoolBagWeight().
    public String toString(){
        return "" + this.schoolBagWeight();
    }
    
    /**
     * @return the style
     */
    public String getStyle() {
        return style;
    }

    /**
     * @param style the style to set
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * @return the binder1
     */
    public Binder getBinder1() {
        return binder1;
    }

    /**
     * @param binder1 the binder1 to set
     */
    public void setBinder1(Binder binder1) {
        this.binder1 = binder1;
    }

    /**
     * @return the binder2
     */
    public Binder getBinder2() {
        return binder2;
    }

    /**
     * @param binder2 the binder2 to set
     */
    public void setBinder2(Binder binder2) {
        this.binder2 = binder2;
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
     * @return the totalNumOfSheets
     */
    public int getTotalNumOfSheets() {
        return totalNumOfSheets;
    }

    /**
     * @param totalNumOfSheets the totalNumOfSheets to set
     */
    public void setTotalNumOfSheets(int totalNumOfSheets) {
        this.totalNumOfSheets = totalNumOfSheets;
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

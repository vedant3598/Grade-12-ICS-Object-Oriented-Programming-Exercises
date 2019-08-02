package javaapplication37;

/**
 *
 * @author Vedant & Eduard
 */
public class Jam {

    private String fruitName;
    private String expiryDate;
    private double size;
    
    public Jam(String name, String date, double asize){
        fruitName = name;
        expiryDate = date;
        size = asize;
    }
    
    public String emptyJam(double s){
        String jarEmpty = "";
        if(getSize() <= s)
            jarEmpty = "The jar is empty.";
        
        else if(getSize() == 0)
            jarEmpty = "The jar is empty.";

        return jarEmpty;
    }
    
    public String removeJam(double s){
        Jam jam = new Jam("", "", 4);
        String removeJar = "";
        if(s >= getSize()){
            if(getSize() == 0){
                removeJar = jam.emptyJam(s);
            }
            else{
                removeJar = "Spreading " + getSize() + " fluid ounces of " + getFruitName() + ". " + jam.emptyJam(s);
                setSize(0);
            }
        }
        else if(s < getSize()){
            setSize(getSize() - s);
            removeJar = "Spreading " + s + " fluid ounces of " + getFruitName() + ".";
        }
        return removeJar;
    }
    
    @Override
    public String toString(){
        return this.getFruitName() + "   " + this.getExpiryDate() + "   " + this.getSize() + " fluid ounces";
    }

    /**
     * @return the fruitName
     */
    public String getFruitName() {
        return fruitName;
    }

    /**
     * @param fruitName the fruitName to set
     */
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    /**
     * @return the expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the expiryDate to set
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

}


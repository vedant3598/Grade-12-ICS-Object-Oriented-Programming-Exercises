package javaapplication37;

/**
 *
 * @author Vedant & Eduard
 */
public class Pantry {
    
   private Jam j1;
   private Jam j2;
   private Jam j3;
    
    public Pantry(Jam jam1, Jam jam2, Jam jam3){
        j1 = jam1; 
        j2 = jam2;
        j3 = jam3;
        
    }
    
    public String spreadJam(double amount, Jam jam){
           String s = jam.removeJam(amount);
           return s;
    }

    /**
     * @return the j1
     */
    public Jam getJ1() {
        return j1;
    }

    /**
     * @param j1 the j1 to set
     */
    public void setJ1(Jam j1) {
        this.j1 = j1;
    }

    /**
     * @return the j2
     */
    public Jam getJ2() {
        return j2;
    }

    /**
     * @param j2 the j2 to set
     */
    public void setJ2(Jam j2) {
        this.j2 = j2;
    }

    /**
     * @return the j3
     */
    public Jam getJ3() {
        return j3;
    }

    /**
     * @param j3 the j3 to set
     */
    public void setJ3(Jam j3) {
        this.j3 = j3;
    }
}

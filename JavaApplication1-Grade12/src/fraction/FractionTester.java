//A Java package organizes Java classes into namespaces, giving a different namespace for every type it has. The name of this package is fraction.
package fraction;

/**
* @author Vedant Shah
* Date: Friday, September 28, 2018
* Course Info: ICS4U-14 Teacher: Ms. Navabi
* Project Information: This project is a project where I have created constructors in the class Fraction to the questions I was assigned in my assignment.
 */
public class FractionTester {

    /**
     * Public allows the main method to be accessible anywhere. Static assists the main method to get loaded and void clarifies that the main method will not output any value. ain is the name of the method.
     * This is required as you can only code after this has been written.
     */
    public static void main(String [] args){
        //The three lines below creates three new Fraction objects
        Fraction p = new Fraction(1, 3);
        Fraction q = new Fraction(4, 5);
        Fraction d = new Fraction(16, 24);
        //This line below creates a Fraction object called r and obtains the numerator and denominator from either p or q, depending on whichever one is larger
        Fraction r = p.larger(q);

        //All of the lines below are the outputs to the questions I was required to create constructors of
        //1 
        System.out.println("Outputing the larger fraction from a pair of fractions: " + r.getNum() + "/" + r.getDen() + ".");
        
        //2b
        Fraction e = p.plus(q);
        System.out.println("Adding two fractions: " + e.getNum() + "/" + e.getDen() + ".");
        
        //2a
        p.timesEquals(q);
        
        //2c
        Fraction reducedFraction1 = d.reduce();
        System.out.println("Fraction in lowest terms: " + reducedFraction1.getNum() + "/" + reducedFraction1.getDen() + "."); 
        
        //3a
        Fraction a = new Fraction(4, 7);
        System.out.println("Outputting an object given the numerator and denominator: " + a.getNum() + "/" + a.getDen() + ".");
        
        //3b
        Fraction b = r.duplication();
        System.out.println("Outputting an object which is a duplication of the r Fraction object: " + r.getNum() + "/" + r.getDen() + ".");
        
        //3c
        Fraction equivalentFraction = new Fraction(0.98);
        Fraction reducedFraction2 = equivalentFraction.reduce();
        System.out.println("Decimal converted to fraction (in lowest terms): " + reducedFraction2.getNum() + "/" + reducedFraction2.getDen() + ".");
        
        //3 (Second page)
        Boolean equals = p.equals(q);
        System.out.println("The fact that the p Fraction object is equal to the q Fraction object is: " + equals + ".");
        
        //3a (Third page)
        Fraction productFraction = p.product(q);
        System.out.println("Product of the p Fraction object to the q Fraction object: " + productFraction.getNum() + "/" + productFraction.getDen() + ".");
        
        //3b (Third page)
        Fraction absFraction = p.abs();
        System.out.println("Absolute value of the p Fraction object: " + absFraction.getNum() + "/" + absFraction.getDen() + ".");
        
        //3c (Third page)
        boolean isPositive = p.isPositive();
        System.out.println("The fact that the p Fraction is a positive fraction is: " + isPositive + ".");
   }
}

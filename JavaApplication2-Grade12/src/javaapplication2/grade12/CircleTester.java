package javaapplication2.grade12;

/**
 *
 * @author Vedant
 */
public class CircleTester {
    public static void main(String[] args) {
        Circle c1 = new Circle(4, -1, 3);
        Circle c2 = new Circle(3, -2, 5);
        double c1Area = c1.area();
        
        System.out.println("The area of the first circle is " + c1Area + " units squared.");
        
        Circle c3 = c1.smaller(c2);
        System.out.println("The smaller circle is the circle with a radius of " + c3.radius + " units. It has a centre at (" + c3.centerX +"," + c3.centerY + "), and it has a radius of " + c3.radius + " units.");
        
        Boolean isInside = c2.isInside(c1);
        System.out.println("The fact that c2 is inside c1 is " + isInside + ".");
        c3 = new Circle(c1);
        
        Circle c4 = c1;
    }
}

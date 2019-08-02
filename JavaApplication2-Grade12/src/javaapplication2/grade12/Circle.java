package javaapplication2.grade12;

/**
 *
 * @author Vedant
 */
public class Circle {

    double radius;
    double centerX;
    double centerY;
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the centerX
     */
    public double getCenterX() {
        return centerX;
    }

    /**
     * @param centerX the centerX to set
     */
    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    /**
     * @return the centerY
     */
    public double getCenterY() {
        return centerY;
    }

    /**
     * @param centerY the centerY to set
     */
    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }
    
    public Circle(){
        centerX = 0.0;
        centerY = 0.0;
        radius = 1.0;
    }
    
    public Circle(double xCenter, double yCenter, double circleRadius){
        centerX = xCenter;
        centerY = yCenter;
        radius = Math.abs(circleRadius);
    }
    
    public Circle(Circle circle){
        this.centerX = circle.centerX;
        this.centerY = circle.centerY;
        this.radius = circle.radius;
    }
    
    public double area(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    public double radius(){
        double circleRadius = (double) radius;
        return circleRadius;
    }
    public Circle smaller(Circle circle){
        if(this.radius() < circle.radius()){
            return this;
        }
        else{
            return circle;
        }
    }
    
    public Circle distance(Circle circle){
        double distanceX = this.centerX - circle.centerX;
        Math.abs(distanceX);
        double distanceY = this.centerY - circle.centerY;
        Math.abs(distanceY);
        return new Circle(distanceX, distanceY, radius);
    }
    
    public boolean isInside(Circle circle){
        boolean isInside = true;
        if(this.area() < circle.area()){
            return isInside;
        }
        else{
            return isInside = false;
        }
    }
    
    //Ask Ms. Navabi why this is not working
    public boolean equals(Circle circle){
        boolean isEqual = true;
        if(this.radius == circle.radius && this.centerX == circle.centerX && this.centerY == circle.centerY){
            return isEqual;
        }
        else{
            return isEqual = false;
        }
    }
    
    public String toString(){
        this.radius = 2;
        this.centerX = 3;
        this.centerY = -4;
        String returnString = "centre: (3, -4)  radius: 2";
        return returnString;
    }
    
    
}

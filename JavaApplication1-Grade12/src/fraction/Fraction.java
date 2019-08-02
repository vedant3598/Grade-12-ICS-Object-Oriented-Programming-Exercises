package fraction;

/**
 * @author 325130300
 */
    public class Fraction{

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the den
     */
    public int getDen() {
        return den;
    }

    /**
     * @param den the den to set
     */
    public void setDen(int den) {
        this.den = den;
    }
      //The following nine values are all variables.
      private int num;
      private int den;
      double fractionVal;

        //A method that assigns 1 to num and 2 to den. 
        public Fraction(){
          num=1;
          den=2;
        }
        
        //A method with a parameter that assigns a to num and 2 to den. 
        public Fraction(int a){
          num=a;
          den=2;
        }
        
        //A method which takes two Fraction objects as parameters and multiplies the numerators and then the denominators.
        public Fraction times(Fraction o, Fraction q){
          Fraction newFraction = new Fraction();
          newFraction.setNum(this.getNum() * o.getNum() * q.getNum());
          newFraction.setDen(this.getDen() * o.getDen() * q.getDen());
          return newFraction;    
        }

        //A method which divides num by den.
        public double size(){
            double fraction = (double) getNum() / (double) getDen();
            return fraction;
        }

        //1
        //A method which sees which Fraction object is larger.
        public Fraction larger (Fraction other) {
            if (this.size() >= other.size()) {
            return this;
            } else {
            return other;
            }
        }
        
        //2a
        //A method that makes p represent the product of the fractions currently represented by p and q while the value of q is left unchanged.
        public void timesEquals(Fraction otherFraction){
            this.setNum(this.getNum() * otherFraction.getNum());
            this.setDen(this.getDen() * otherFraction.getDen());
        }
        
        //2b
        //A method that returns a Fraction object whose value is the sum of the implicit object parameter (this) and the explicit parameter (f). The method leaves its explicit and implicit parameters unchanged.
        public Fraction plus (Fraction f){
            Fraction addFractions = new Fraction();
            addFractions.setNum(this.getNum() * f.getDen() + this.getDen() * f.getNum());
            addFractions.setDen(this.getDen() * f.getDen());
            return addFractions;
        }
        
        //2c
        //A method that reduces its implicit Fraction parameter to lowest terms.
        public Fraction reduce(){
            int g = gcd(this.getNum(), this.getDen());
            Fraction reducedFraction = new Fraction();
            reducedFraction.setNum(this.getNum() / g);
            reducedFraction.setDen(this.getDen() / g);
            return reducedFraction;
        }
        
        //This method belows determines the Greatest Common Denominator from num and den returns that value to the method above.
        public int gcd(int num, int den){
            int n = num;
            int d = den;
            while (n != d)
                if (n > d){
                    n = n - d;
                }
                else{
                    d = d - n;
                }
            return n;
        }
        
        //3a
        //A method that assigns values n to num and p to den.
        public Fraction (int n, int p){
            num = n;
            den = p;
        }
        
        //3b
        //A method that duplicates the given Fraction object from FractionTester.java.
        public Fraction duplication(){
            Fraction duplication = new Fraction(this.getNum(), this.getDen());
            return duplication;
        }
        
        //3c
        //A method that converts a decimal number to a fraction.
        public Fraction(double otherFraction){
            int lengthOfFraction = Double.toString(otherFraction).length();
            int numberOfDecimals = lengthOfFraction - (Double.toString(otherFraction).indexOf('.') + 1);
            num = (int) ((Math.pow(10, numberOfDecimals)) * otherFraction);
            den = (int) (Math.pow(10, numberOfDecimals));
        }
        
        //3 (Second page)
        //A method that returns true if and only if the Fraction objects being compared represent equivalent fractions
        public boolean equals(Fraction other){
            boolean isEqual = false;
            if(other != null && this.getNum() == other.getNum() && this.getDen() == other.getDen())
                isEqual = true;
            
            return isEqual;
        }
        
        //3a (Third page)
        //A method that finds the product of two fractions.
        public Fraction product(Fraction otherFraction){
            Fraction productFraction = new Fraction();
            productFraction.setNum(this.getNum() * otherFraction.getNum());
            productFraction.setDen(this.getDen() * otherFraction.getDen());
            return productFraction;
        }
        
        //3b (Third page)
        //A method that determines the absolute value of a fraction.
        public Fraction abs(){
            Fraction absFraction = new Fraction();
            absFraction.setNum(Math.abs(getNum()));
            absFraction.setDen(Math.abs(getDen()));
            return absFraction;
        }
        
        //3c (Third page)
        //A method which determines if a fraction is positive or not.
        public boolean isPositive(){
            boolean isPositive = true;
            if(this.getNum() > 0 && this.getDen() > 0)
                return isPositive;
            else
                return isPositive = false;
        }
    }
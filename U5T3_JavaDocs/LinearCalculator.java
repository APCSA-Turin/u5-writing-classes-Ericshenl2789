package com.example.project;
public class LinearCalculator{
    /**This class represents a linear calculator capable of taking two coordinates
     * 
     * @author Eric Lin
     */

    /**The x-coordinate of the first point. */
    private int x1;
    /** The x-coordinate of the second point.  */
    private int x2;
    /** The y-coordinate of the first point.  */
    private int y1;
    /** The y-coordinate of the second point.  */
    private int y2;

    /** A constructor that creates an instance of the LinearCalculator. Takes a string argument and uses parse int to separate to two intergers per coordinate.
     * <p>
     * PRECONDITION: The coordinates are in the string formula "(x,y)", where x and y is an interger. 
     * 
     * @param coordinate1 The first coordinate point
     * @param coordinate2 The second coordinate point
     */
    public LinearCalculator(String coordinate1, String coordinate2){ // <--add 2 string parameters to this constructor
        int comma1 = coordinate1.indexOf(",");
        int comma2 = coordinate2.indexOf(",");
        x1 = Integer.parseInt(coordinate1.substring(1, comma1));//coverting String to int using parse source: https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java
        x2 = Integer.parseInt(coordinate2.substring(1, comma2));
        y1 = Integer.parseInt(coordinate1.substring(comma1 + 1, coordinate1.length() - 1));
        y2 = Integer.parseInt(coordinate2.substring(comma2 + 1, coordinate2.length() - 1));
    }



    //METHODS
    //getters and setters for the 4 instance variables (8 methods total) 
    /** Returns the x-coordinate of the first point
     * 
     * @return The x-coordinate of the first point
     */
    public int getX1(){return x1;}
    /** Returns the y-coordinate of the first point
     * 
     * @return The y-coordinate of the first point
     */
    public int getY1(){return y1;}
    /** Returns the x-coordinate of the second point
     * 
     * @return The x-coordinate of the second point
     */
    public int getX2(){return x2;}
    /** Returns the y-coordinate of the second point
     * 
     * @return The y-coordinate of the second point
     */
    public int getY2(){return y2;}
    /**Set the first x-coordinate to a new value
     * 
     * @param newX1 The new x-coordinate
     */
    public void setX1(int newX1){
        x1 = newX1;
    }
    /**Set the first y-coordinate to a new value
     * 
     * @param newY1 The new y-coordinate
     */
    public void setY1(int newY1){
        y1 = newY1;
    }
    /**Set the second x-coordinate to a new value
     * 
     * @param newX2 The new x-coordinate
     */
    public void setX2(int newX2){
        x2 = newX2;
    }
    /**Set the second y-coordinate to a new value
     * 
     * @param newY2 The new y-coordinate
     */
    public void setY2(int newY2){
        y2 = newY2;
    }


    /** Calculates the distance between the two points to the nearest hundredth using the distance formula
     * 
     * @return The distance between two points
    */
    public double distance(){
        return roundedToHundredth(Math.sqrt((double) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))));//distance formula
    }

    /** Returns the y-intercept of the line created by the two points rounded to the nearest hundredth. 
     * This is done using the slope and the point-slope form formula.
     * <p>
     * If the y-intercept is undefined, the function returns -999.99 instead. 
     * This only happens when the line is a vertical line, which means the slope is undefined. 
     * If the slope is undefined, the y-intercept is also undefined.
     * 
     * @return The y-intercept of the line created by the two points
    */
    public double yInt(){
        int temp = y1*-1;
        if (slope() == -999.99){
            return -999.99;
        } else {
            return roundedToHundredth((x1 * -1 * slope()) - temp);//using point-slope form to calculate the y-intercept
        } 
        
    }

    /** Returns the slope of the line created by the two points rounded to the nearest hundredth. Employs the slope forumla.
     * <p>
     * If the slope is undefined, the method will return -999.99 instead. 
     * The slope is undefined when the denominator, (x2 - x1), equals 0.
     * 
     * @return The slope of the line created by the two points
     */

    public double slope(){
        if (x2 - x1 == 0){
            return -999.99;
        }
        return roundedToHundredth((double) (y2 - y1)/(x2 - x1)); // slope formula
    }

    /** This method returns a String representing the equation of the line created by the two points in y=mx+b form.
     *  If the slope is undefined, the equation will also be undefined. 
     *  <p> 
     *  After calculating the slope and y-intercept, the code will check if either is equal to zero.
     *  If true, then it will not be added to the equation. 
     *  In addition, it will also check whether the y-intercept is positive or negative.
     *  And then add the corresponding signs in the final equation.
     * 
     * @return The equation of the line
     */
    public String equation(){
        String equation = "y=";
        if (slope() == -999.99){
            return "undefined";
        } 
        if (slope() != (double) 0){
            equation += slope() + "x";
        }
        if (yInt() != (double) 0 && slope() ==0) {
            equation +=  yInt();
        } else if (yInt() != (double) 0){
            if (yInt()>0){
                equation += "+" +yInt();
            } else if (yInt() < 0){
                equation += yInt();
            }
        }
        return equation;
    }

    /** Takes a double and rounds it to the nearest hundredth.
     * @param x The number that needs to be rounded
     * @return The number rounded to the nearest hundredth.
     */
    public double roundedToHundredth(double x){
        return Math.round(x*100) / 100.0;
    }

    /** Stores the information about the two points and the line that they create. 
     * 
     * Includes the points and the equation, slope, y-intercept, midpoint of the line.
     * Also checks whether the points are symetric and finds the distance between the points
     * 
     * @return The information to be printed. 
     */
    public String printInfo(){
        String str = "The two points are: (" + x1 + "," + y1  + ")";
        str += " and " + "(" + x2 + "," + y2 + ")";
        str += "\nThe equation of the line between these points is: " + equation() ;
        str += "\nThe slope of this line is: " + slope();
        str += "\nThe y-intercept of the line is: " + yInt();
        str += "\nThe distance between the two points is: " + distance();
        str += "\n" + findSymmetry();
        str += "\n" + Midpoint();
        return str;
    }

    /**Finds whether there is symmetry between the two points. 
     * <p>
     * First finds the midpoint coordinate. 
     * Checks the x and y of the midpoint to see if they are symmetric about the x-axis, y-axis, origin or have no symmetry.
     * 
     * @return The symmetry of the two points in String
      */
    public String findSymmetry(){//if mid point has 0 in either x or y, it is symmetric
        double midX = (x1 + x2) / 2.0;
        double midY = (y1 + y2) / 2.0;
        if (midX == 0.0 && midY == 0.0) {
            return "Symmetric about the origin";
        } else if (midX == 0.0) {
            return "Symmetric about the y-axis";
        } else if (midY == 0.0) {
            return "Symmetric about the x-axis";
        }
        return "No symmetry";
    }

    /**Finds the midpoint are returns it in "(x,y)" where x and y are coordinates of the midpoint.
     * 
     * @return The midpoint
     */
    public String Midpoint(){
        double midX = (x1 + x2) / 2.0;
        double midY = (y1 + y2) / 2.0;
        return "The midpoint of this line is: (" + midX + "," + midY + ")";
    }

}




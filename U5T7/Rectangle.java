public class Rectangle {
    // instance variables
    private double length;
    private double width;

    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // STATIC "utility" method that converts feet to inches
    public static double feetToInches(double feet) {
        return feet * 12;
    }

    public static double inchesToFeet(double inches){
        return inches / 12;
    }

    // instance method that returns area of Rectangle object
    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * length + 2 * width;
    }
}
package This;

public class Square extends Rectangle {
    // creates a subclass Square that inherits all the properties and methods of the Rectangle class.
    public Square(double sideLength) {
        // Call the constructor of the superclass (Rectangle) with the side length for both length and width.
        super(sideLength, sideLength);
        /* this line calls the constructor of the superclass using super. By passing sideLength twice as arguments, 
        it initializes the Rectangle part of the Square object with the provided sideLength for both length and width. */
    }

    // Accessor methods
    public double getSide() {
        return super.getLength();
    }

    @Override
    public Double getLength() {
        return super.getLength();
    }

    @Override
    public Double getWidth() {
        return super.getWidth();
    }

    // Mutator methods
    public void setSide(double sideLength) {
        // the length and width in the superclass have the same side lenght
        super.setLength(sideLength);
        super.setWidth(sideLength);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public String toString() {
        return "Square [Side Length: " + getSide() + "]";
    }

    public class Main {
    public static void main(String[] args) {
        // Creating a square with a side length of 4.
        Square mySquare = new Square(4.0);

        String squareInfo = mySquare.toString();
        System.out.println(squareInfo); 
        }
    }
}

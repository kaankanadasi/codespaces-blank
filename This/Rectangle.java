package This;

public class Rectangle {
    private double length;
    private double width;
    private double angle;
    private int sides;
    private String name;

    public Rectangle() {}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // I should write methods of equals(Rectangle): boolean, getArea(): double, getPerimeter(): double

    public boolean equals(Rectangle other) {
        if (other == null) {
            return false;
        }
        return this.length == other.length && this.width == other.width;
    }

    public double getArea() {
        double area = length * width;
        System.out.println("The area is " + area);
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter is " + perimeter);
        return perimeter;
    }

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.0, 3.0);
        myRectangle.getArea();
        myRectangle.getPerimeter();
    }

}

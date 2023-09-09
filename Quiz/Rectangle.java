package Quiz;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 7.5);

        System.out.println("Width: " + rectangle.width);
        System.out.println("Height: " + rectangle.height);
    }
}

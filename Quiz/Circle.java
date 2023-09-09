package Quiz;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }   
        public static void main(String[] args) {
            // Create an instance of the Circle class with a radius of 5.5
            Circle circle = new Circle(5.5);

            System.out.println("Circle: " + circle.radius);
        }
}

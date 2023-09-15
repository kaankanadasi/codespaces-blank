package Unit2;

public class CallingNonVoidMethod {
    private double xaxis;
    private double yaxis;

    public CallingNonVoidMethod(double xaxis, double yaxis) {
        this.xaxis = xaxis;
        this.yaxis = yaxis;
    }
    
    public double calculateHypothenuse() {
        return Math.sqrt(Math.pow(xaxis, 2) + Math.pow(yaxis, 2));
        // since it returns something this code is a non-void method
    }

    public static void main(String[] args) {
        CallingNonVoidMethod hypothenuse = new CallingNonVoidMethod(4.0, 3.0);
        double area = hypothenuse.calculateHypothenuse();

        System.out.println(area);
    }
}

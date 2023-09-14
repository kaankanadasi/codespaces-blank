package Unit2;

public class Objects {
    private String model;
    private int year;
    private double price;

    // Constructor to initialize the object with model, year, and price values
    public Objects(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Method to display information about the car
    public void displayInfo() {  
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price + " $");
    }

     public static void main(String[] args) {
        // Create an instance of the Objects class, initializing it with specific values
        Objects myCar = new Objects("718 cayman style edition - Porsche", 2024, 125.800);
        myCar.displayInfo();
    }
}
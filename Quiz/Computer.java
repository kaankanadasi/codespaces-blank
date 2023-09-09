package Quiz;

public class Computer {
    private String brand;
    private String model;
    private double price;
    public Computer (String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "Dell Inspiron 15 3000", 1299.99);

        System.out.println("Brand: " + dell.brand);
        System.out.println("Model: " + dell.model);
        System.out.println("Price: " + dell.price);
    }

}


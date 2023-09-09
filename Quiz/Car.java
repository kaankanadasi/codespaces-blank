package Quiz;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
        public static void main(String[] args) {
            Car car = new Car("Toyota", "Camry", 2022);

            System.out.println("Make: " + car.make);
            System.out.println("Model: " + car.model);
            System.out.println("Year: " + car.year);
        }
    
    }

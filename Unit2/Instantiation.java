package Unit2;

public class Instantiation {
    private String name;
    private int age;

    public Instantiation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating objects (instantiating the Person class)
        Instantiation person1 = new Instantiation("Alice", 25);
        Instantiation person2 = new Instantiation("Bob", 30);

        Instantiation[] people = new Instantiation[2];
        people[0] = person1;
        people[1] = person2;

        for (Instantiation person : people) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println(); // Empty line for separation
        }
    }
}

package Quiz;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Student alice = new Student("Alice", 18);

        System.out.println("Name: " + alice.name);
        System.out.println("Age: " + alice.age);
    }

}
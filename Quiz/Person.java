package Quiz;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public static void main(String[] args) {
        Person person = new Person("Jessica" , "Pearson", 23);

        System.out.println("First Name: " + person.firstName);
        System.out.println("Last Name: " + person.lastName);
        System.out.println("Age: " + person.age);
    }

}

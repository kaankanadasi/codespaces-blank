package Quiz;

public class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }
    public static void main(String[] args) {
        Employee johnSmith = new Employee("John Smith", 12345);

        System.out.println("Name: " + johnSmith.name);
        System.out.println("Employee Id: " + johnSmith.employeeId);
    }
}
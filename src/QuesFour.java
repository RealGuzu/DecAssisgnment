class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        // Override the getLastName() method to include job title
        return super.getLastName() + ", " + jobTitle;
    }
}

public class QuesFour {
    
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());

        Employee employee = new Employee("Alice", "Smith", 123, "Software Engineer");
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() +
                " (ID: " + employee.getEmployeeId() + ")");
    }
}

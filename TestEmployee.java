class Employee {
    private int EmployeeId;
    private String EmployeeName;

    public Employee(int id, String name) {
        this.EmployeeId = id;
        this.EmployeeName = name;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " +EmployeeId);
        System.out.println("Employee Name: " + EmployeeName);
    }
}

class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public void displayDetails() {

        System.out.println("Employee Type: Full-Time");
        System.out.println("Salary: $" + salary);
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double hourlyRate) {
        super(id, name);
        this.hourlyRate = hourlyRate;
    }

    public void displayDetails() {
        System.out.println("Employee Type: Part-Time");
        System.out.println("Hourly Rate: $" + hourlyRate);
    }

    public void displayDetails(int type) {


        super.displayDetails();

    }

}


public class TestEmployee{
    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployeete = new FullTimeEmployee(1,"Dhananjay",100000000);
        PartTimeEmployee freelancer = new PartTimeEmployee(2,"Akash",20000);

        //calling method from fte
        fullTimeEmployeete.displayDetails();

        //call part time employee;

        freelancer.displayDetails();

        //call parent(employee) method
        freelancer.displayDetails(1);
    }
}

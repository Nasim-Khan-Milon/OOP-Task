abstract class Employee {
    protected String name;
    protected int id;
    protected String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public abstract double calculatePay();
}

class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay() {
        return fixedSalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class ContractEmployee extends Employee {
    private String projectName;
    private double contractAmount;

    public ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculatePay() {
        return contractAmount;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Alice", 1, "HR", 50000);
        Employee e2 = new PartTimeEmployee("Bob", 2, "Support", 200, 40);
        Employee e3 = new ContractEmployee("Charlie", 3, "IT", "Website Redesign", 30000);

        System.out.println("FullTime Pay: $" + e1.calculatePay());
        System.out.println("PartTime Pay: $" + e2.calculatePay());
        System.out.println("Contract Pay: $" + e3.calculatePay());
    }
}

interface EmployeeInfo {
    double calculateBonus();
    double calculateTotalSalary();
}

abstract class Employee implements EmployeeInfo {
    protected String name;
    protected int ID;
    protected double baseSalary;

    public Employee(String name, int ID, double baseSalary) {
        this.name = name;
        this.ID = ID;
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateTotalSalary() {
        return baseSalary + calculateBonus();
    }
}

class Manager extends Employee {
    public Manager(String name, int ID, double baseSalary) {
        super(name, ID, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.20;
    }
}

class Developer extends Employee {
    private final int projectsDone;

    public Developer(String name, int ID, double baseSalary, int projectsDone) {
        super(name, ID, baseSalary);
        this.projectsDone = projectsDone;
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.15 + (baseSalary * 0.15 * 0.05 * projectsDone);
    }
}

class Intern extends Employee {
    public Intern(String name, int ID, double baseSalary) {
        super(name, ID, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.05;
    }
}

public class LabReport7 {
    public static void main(String[] args) {
        Manager manager = new Manager("Tanvir", 1787, 20000);
        System.out.printf("Manager: Name: %s, ID: %d, Salary: %.2f, Bonus: %.2f, Total: %.2f%n",
                manager.name, manager.ID,
                20000.0, manager.calculateBonus(), manager.calculateTotalSalary());
        System.out.println();

        Developer developer = new Developer("Rivnat", 5678, 20000, 12);
        System.out.printf("Developer: Name: %s, ID: %d, Salary: %.2f, Bonus: %.2f, Total: %.2f%n",
                developer.name, developer.ID,
                20000.0, developer.calculateBonus(), developer.calculateTotalSalary());
        System.out.println();

        Intern intern = new Intern("Sadman", 9012, 10000);
        System.out.printf("Intern: Name: %s, ID: %d, Salary: %.2f, Bonus: %.2f, Total: %.2f%n",
                intern.name, intern.ID,
                10000.0, intern.calculateBonus(), intern.calculateTotalSalary());
    }
}


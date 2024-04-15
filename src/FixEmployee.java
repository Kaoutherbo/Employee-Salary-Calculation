public class FixEmployee extends Employee{
    double salary;
    public FixEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    @Override
    public double calculateSalary() {
        return salary;
    }
}

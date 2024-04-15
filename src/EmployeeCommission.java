public class EmployeeCommission extends Employee{
    double base_salary;
    double sales; //vents
    double percentage;
    public EmployeeCommission(String name, double base_salary, double sales, double percentage) {
        super(name);
        this.base_salary = base_salary;
        this.sales = sales;
        this.percentage = percentage;
    }

    @Override
    public double calculateSalary() {
        return this.percentage * this.sales + this.base_salary ;
    }
}

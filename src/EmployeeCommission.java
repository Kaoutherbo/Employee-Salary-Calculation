class EmployeeCommission extends Employee {
    double baseSalary;
    double sales;
    double percentage;

    public EmployeeCommission(String name, double baseSalary, double sales, double percentage) {
        super(name);
        this.baseSalary = baseSalary;
        this.sales = sales;
        this.percentage = percentage;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (sales * percentage);
    }
}
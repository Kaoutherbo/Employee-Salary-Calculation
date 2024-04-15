class FixEmployee extends Employee {
    private double fixedSalary;

    public FixEmployee(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}
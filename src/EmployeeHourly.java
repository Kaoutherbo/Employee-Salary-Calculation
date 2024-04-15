class EmployeeHourly extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public EmployeeHourly(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
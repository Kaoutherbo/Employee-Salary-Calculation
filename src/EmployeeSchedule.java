public class EmployeeSchedule extends Employee{
    double hourly_rate;
    double number_hours;
    public EmployeeSchedule(String name, double hourly_rate, double number_hours) {
        super(name);
        this.hourly_rate = hourly_rate;
        this.number_hours = number_hours;
    }
    @Override
    public double calculateSalary() {
        return this.hourly_rate * this.number_hours;
    }

}

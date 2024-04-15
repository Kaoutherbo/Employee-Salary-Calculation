public class Test {
    public static void main(String[] args) {
        FixEmployee fixEmployee = new FixEmployee("Alice", 3000);
        EmployeeCommission employeeCommission = new EmployeeCommission("Bob", 1500, 5000, 0.1);
        EmployeeHourly employeeHourly = new EmployeeHourly("Charlie", 20, 160);

        Employee[] employees = {fixEmployee, employeeCommission, employeeHourly};

        Business business = new Business();

        double averageSalary = business.average(employees);
        System.out.println("Average employee salary: " + averageSalary);
    }
}
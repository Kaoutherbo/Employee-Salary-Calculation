class Business {
    public double average(Employee[] employees) {
        double totalSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
        }

        return totalSalary / employees.length;
    }
}
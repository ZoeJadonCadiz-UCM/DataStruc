public class ContractualEmployee extends Employee {

    private int overtime;

    public ContractualEmployee(String firstName, String lastName, int idNo, String position,
                               String department, int hoursWork, double hourlyRate, int overtime) {
        super(firstName, lastName, idNo, position, department, hoursWork, hourlyRate);
        this.overtime = overtime;
    }

    public double computeSalary() {
        return (getHoursWork() * getHourlyRate()) + (overtime * getHourlyRate());
    }
}

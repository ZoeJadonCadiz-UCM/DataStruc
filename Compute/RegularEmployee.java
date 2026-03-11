public class RegularEmployee extends Employee {

    private double bonus;

    public RegularEmployee(String firstName, String lastName, int idNo, String position,
                           String department, int hoursWork, double hourlyRate, double bonus) {
        super(firstName, lastName, idNo, position, department, hoursWork, hourlyRate);
        this.bonus = bonus;
    }

    public double computeSalary() {
        return super.computeSalary() + bonus;
    }
}

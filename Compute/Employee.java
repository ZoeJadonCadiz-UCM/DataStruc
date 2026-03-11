public class Employee extends Person implements ICompute {

    private int idNo;
    private String position;
    private String department;
    private int hoursWork;
    private double hourlyRate;

    public Employee(String firstName, String lastName, int idNo, String position,
                    String department, int hoursWork, double hourlyRate) {
        super(firstName, lastName);
        this.idNo = idNo;
        this.position = position;
        this.department = department;
        this.hoursWork = hoursWork;
        this.hourlyRate = hourlyRate;
    }

    // Getters
    public int getIdNo() {
        return idNo;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public int getHoursWork() {
        return hoursWork;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    // Setters
    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double computeSalary() {
        return hoursWork * hourlyRate;
    }
}

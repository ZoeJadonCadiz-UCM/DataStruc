public class TestPerson {

    public static void main(String[] args) {

        RegularEmployee Regular = new RegularEmployee(
                "Chrispee", "Bacon", 101, "Manager",
                "IT", 40, 20, 500);

        ContractualEmployee Contractual = new ContractualEmployee(
                "Anna", "Beethawco", 102, "Programmer",
                "IT", 8, 20, 5);

        Student student = new Student(
                "Kimpang", "Jaydoy", 201,
                "BSIT", "Computer Studies");

        System.out.println("=== Regular Employee ===");
        System.out.println("Name: " + Regular.displayInfo());
        System.out.println("ID: " + Regular.getIdNo());
        System.out.println("Position: " + Regular.getPosition());
        System.out.println("Department: " + Regular.getDepartment());
        System.out.println("Hours Work: " + Regular.getHoursWork());
        System.out.println("Hourly Rate: " + Regular.getHourlyRate());
        System.out.println("Salary: " + Regular.computeSalary());

        System.out.println("\n=== Contractual Employee ===");
        System.out.println("Name: " + Contractual.displayInfo());
        System.out.println("ID: " + Contractual.getIdNo());
        System.out.println("Position: " + Contractual.getPosition());
        System.out.println("Department: " + Contractual.getDepartment());
        System.out.println("Hours Work: " + Contractual.getHoursWork());
        System.out.println("Hourly Rate: " + Contractual.getHourlyRate());
        System.out.println("Salary: " + Contractual.computeSalary());

        System.out.println("\n=== Student ===");
        System.out.println("Name: " + student.displayInfo());
        System.out.println("ID: " + student.getIdNo());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Department: " + student.getDepartment());
    }
}

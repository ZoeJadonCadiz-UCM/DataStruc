public class Student extends Person {

    private int idNo;
    private String course;
    private String department;

    public Student(String firstName, String lastName, int idNo, String course, String department) {
        super(firstName, lastName);
        this.idNo = idNo;
        this.course = course;
        this.department = department;
    }

    // Getters
    public int getIdNo() {
        return idNo;
    }

    public String getCourse() {
        return course;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class Student implements EducationalUnit {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    public void displayDetails() {
        System.out.println("Student: " + name + ", ID: " + studentId + ", Tuition Fee: " + tuitionFee);
    }

    public int getStudentCount() {
        return 1;
    }

    public double calculateBudget() {
        return -tuitionFee;
    }
}

public class UniversityClient {
    public static void main(String[] args) {
        // Students
        Student s1 = new Student("Alice", "S001", 20000);
        Student s2 = new Student("Bob", "S002", 25000);
        Student s3 = new Student("Charlie", "S003", 22000);

        // Teachers
        Teacher t1 = new Teacher("Dr. Smith", "Math", 50000);
        Teacher t2 = new Teacher("Prof. Jones", "CS", 55000);

        // Departments
        Department csDept = new Department("Computer Science");
        csDept.addUnit(t2);
        csDept.addUnit(s1);
        csDept.addUnit(s2);

        Department mathDept = new Department("Mathematics");
        mathDept.addUnit(t1);
        mathDept.addUnit(s3);

        // College
        College engCollege = new College("College of Engineering");
        engCollege.addUnit(csDept);
        engCollege.addUnit(mathDept);

        // University
        College university = new College("New Era University");
        university.addUnit(engCollege);

        // Display
        university.displayDetails();
        System.out.println("\nTotal Students: " + university.getStudentCount());
        System.out.println("Total Budget: " + university.calculateBudget());
    }
}

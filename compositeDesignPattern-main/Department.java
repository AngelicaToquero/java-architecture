import java.util.List;
import java.util.ArrayList;

public class Department implements EducationalUnit {
    private String name;
    private List<EducationalUnit> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addUnit(EducationalUnit unit) {
        units.add(unit);
    }

    public void displayDetails() {
        System.out.println("  Department: " + name);
        for (EducationalUnit unit : units) {
            unit.displayDetails();
        }
    }

    public int getStudentCount() {
        return units.stream().mapToInt(EducationalUnit::getStudentCount).sum();
    }

    public double calculateBudget() {
        return units.stream().mapToDouble(EducationalUnit::calculateBudget).sum();
    }
}

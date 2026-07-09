import java.util.ArrayList;
import java.util.List;

public class College implements EducationalUnit {
    private String name;
    private List<EducationalUnit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void addUnit(EducationalUnit unit) {
        units.add(unit);
    }

    public void displayDetails() {
        System.out.println("College: " + name);
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

import java.util.Arrays;

public class Archer extends Character {
    public Archer() {
        super(new ShootArrow(), Arrays.asList(new Dodge()));
    }
}

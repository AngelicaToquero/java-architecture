import java.util.Arrays;

public class Knight extends Character {
    public Knight() {
        super(new SwingSword(), Arrays.asList(new Shield(), new Dodge(), new CreateMagicBarrier()));
    }
}
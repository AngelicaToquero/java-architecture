import java.util.List;  

public abstract class Character {
    protected AttackStrategy attackStrategy;
    protected List<DefenseStrategy> defenseStrategies; 

    public Character(AttackStrategy attackStrategy, List<DefenseStrategy> defenseStrategies) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategies;
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefense() {
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }
}

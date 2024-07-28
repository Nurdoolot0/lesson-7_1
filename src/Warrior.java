public class Warrior extends Hero{
    public Warrior(int health, int damage) {
        super(health, damage, "CRITICAL DAMAGE");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior used super ability: CRITICAL DAMAGE");
    }
}

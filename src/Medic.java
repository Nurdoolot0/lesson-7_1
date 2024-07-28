public class Medic extends Hero{
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, "HEALING");
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
        healPoints += (healPoints * 0.10);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic used super ability: HEALING");
    }
}

public abstract class Hero implements HavingSuperAbility {

    private int health;
    private int damage;
    private String superAbilityTypes;

    public Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityTypes = superAbilityTypes;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }






    public void applySuperAbility(String superAbilityType) {
       this.superAbilityTypes = superAbilityType;
    }
    public abstract void applySuperAbility();
}

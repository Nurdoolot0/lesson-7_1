public class Main {
    public static void main(String[] args) {

        Hero[] heroes = new Hero[] {
                new Magic(100, 50),
                new Medic(80, 30, 20),
                new Warrior(120, 60)
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("Medic heal points: " + medic.getHealPoints());
            }
        }
    }
    }
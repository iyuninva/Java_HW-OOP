package Library_4.Data.Hero;

import java.util.Random;

import Library_4.Data.Defense.LightShield;
import Library_4.Data.Weapon.Bow;

public class Archer extends Warrior<Bow, LightShield> {
    public Archer(String name, Bow bow, LightShield lightShield, int healthPoint) {
        super(name, bow, lightShield, healthPoint);
    }

    public int range() {
        Random random = new Random();
        return random.nextInt(weapon.range());
    }

    @Override
    public String toString() {
        return String.format("Archer %s", super.toString());
    }
}

package Library_4.Data.Hero;

import Library_4.Data.Defense.BigShield;
import Library_4.Data.Weapon.Sword;

public class Paladin extends Warrior<Sword, BigShield> {

    public Paladin(String name, Sword sword, BigShield bightShield, int healthPoint) {
        super(name, sword, bightShield, healthPoint);
    }

    @Override
    public String toString() {
        return String.format("Paladin %s", super.toString());
    }

}

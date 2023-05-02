package Library_4.Data.Hero;

import java.util.Random;

import Library_4.Data.Defense.Defense;
import Library_4.Data.Weapon.Weapon;

public abstract class Warrior<T extends Weapon, Type extends Defense> {

    private String name;
    protected T weapon;
    private Type defense;
    private int healthPoint;

    public Warrior(String name, T weapon, Type defense, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.defense = defense;
        this.healthPoint = healthPoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public Type getDefense() {
        return defense;
    }

    public void setDefense(Type defense) {
        this.defense = defense;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public int defend() {
        Random random = new Random();
        return random.nextInt(0, defense.defense());
    }

    @Override
    public String toString() {
        return String.format("%s HP: %d\n %s\n %s\n", name, healthPoint, weapon, defense);
    }

}

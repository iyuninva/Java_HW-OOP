package Library_4.Data.Hero;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Warrior> {
    List<T> hero = new ArrayList<>();

    public Team<T> add(T warrior) {
        hero.add(warrior);
        return this;
    }

    public List<T> getHero() {
        return hero;
    }

    public int healthPoints() {
        int sum = 0;
        for (T item : hero) {
            sum += item.getHealthPoint();
        }
        return sum;
    }

    public int getDamage() {
        int sum = 0;
        for (T item : hero) {
            sum += item.getWeapon().damage();
        }
        return sum;
    }

    public int getDefend() {
        int sum = 0;
        for (T item : hero) {
            sum += item.getDefense().defense();
        }
        return sum;
    }

    public int maxRange() {
        int max = 0;
        for (T item : hero) {
            if (item instanceof Archer) {
                if (max < ((Archer) item).range()) {
                    max = ((Archer) item).range();
                }
            }
        }
        return max;
    }

    public int minDefense() {
        int min = 100;
        for (T item : hero) {
            if (min > item.getDefense().defense()) {
                min = item.getDefense().defense();
            }
        }
        return min;
    }

    @Override
    public String toString() {
        StringBuilder warrior = new StringBuilder();
        for (T item : hero) {
            warrior.append(item);
            warrior.append("\n");
        }
        warrior.append(
                String.format("heathPoint %s, damage %s, defende %s, max range %s min defense %s", healthPoints(), getDamage(),
                        getDefend(),
                        maxRange(),
                        minDefense()));
        return warrior.toString();
    }
}

package Library_4.Config;

import Library_4.Data.Hero.Warrior;

public class Battle {
    private Warrior one;
    private Warrior two;

    public Battle(Warrior one, Warrior two) {
        this.one = one;
        this.two = two;
    }

    public Warrior fight() {
        while (one.getHealthPoint() > 0 && two.getHealthPoint() > 0) {

            int hitOne = two.defend() - one.hit();
            int defTwo = two.defend();
            if (hitOne < 0) {
                hitOne = 0;
            }
            System.out.printf("Two warrior hit damge %s. \n", hitOne);
            System.out.printf("One warrior def damge %s. \n", defTwo);
            two.setHealthPoint(two.getHealthPoint() - hitOne);
            System.out.printf("Two warrior have healthPoint %s. \n", two.getHealthPoint());
            if (two.getHealthPoint() <= 0) {
                return one;
            }
            int hitTwo = one.defend() - two.hit();
            int defOne = one.defend();
            if (hitTwo < 0) {
                hitTwo = 0;
            }
            System.out.printf("Two warrior hit damge %s. \n", hitTwo);
            System.out.printf("One warrior def damge %s. \n", defOne);
            one.setHealthPoint(one.getHealthPoint() - hitTwo);
            System.out.printf("One warrior have healthPoint %s. \n", one.getHealthPoint());
        }
        return two;
    }
}

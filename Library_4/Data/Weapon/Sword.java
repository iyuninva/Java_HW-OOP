package Library_4.Data.Weapon;

public class Sword implements Weapon {
    
    @Override
    public int damage() {
        return 25;
    }

    @Override
    public String toString() {
        return String.format("Sword: damage - %d", damage());
    }
}

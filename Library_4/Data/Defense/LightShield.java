package Library_4.Data.Defense;

public class LightShield implements Defense {

    private String name;

    @Override
    public int defense() {
        return 10;
    }

    public LightShield(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s: defense - %d", name, defense());
    }

}

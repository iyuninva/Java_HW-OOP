package Library_4.Data.Defense;

public class BigShield implements Defense {

    private String name;

    @Override
    public int defense() {
        return 20;
    }

    public BigShield(String name) {
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
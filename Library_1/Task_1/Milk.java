package Library_1.Task_1;

public class Milk extends Product {

    public Milk(String name, Integer cost) {
        super(name, cost);
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString());
    }
}

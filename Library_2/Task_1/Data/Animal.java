package Library_2.Task_1.Data;

import Library_2.Task_1.Data.Interface.InterfaceSayable;

public abstract class Animal implements InterfaceSayable {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String say();

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name %s: say %s, feed: %s", name, say(), feed());
    }
}

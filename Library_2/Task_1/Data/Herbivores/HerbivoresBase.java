package Library_2.Task_1.Data.Herbivores;

import Library_2.Task_1.Data.Animal;

public abstract class HerbivoresBase extends Animal {

    public HerbivoresBase(String name) {
        super(name);
    }

    public String feed() {
        return "grass";
    }
}

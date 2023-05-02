package Library_2.Task_1.Data.Predator;

import Library_2.Task_1.Data.Animal;

public abstract class PredatorBase extends Animal {

    public PredatorBase(String name) {
        super(name);
    }

    public String feed() {
        return "meat";
    }
}

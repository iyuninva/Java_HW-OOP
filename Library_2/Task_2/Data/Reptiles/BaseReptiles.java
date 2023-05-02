package Library_2.Task_2.Data.Reptiles;

import Library_2.Task_2.Data.Animals;

public abstract class BaseReptiles extends Animals {

    public BaseReptiles(String name, int age) {
        super(name, age);
    }

    public String Animals() {
        return "Reptiles";
    }

}

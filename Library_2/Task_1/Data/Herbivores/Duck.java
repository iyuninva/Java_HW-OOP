package Library_2.Task_1.Data.Herbivores;

import Library_2.Task_1.Data.Interface.InterfaceFlyable;
import Library_2.Task_1.Data.Interface.InterfaceSwimmingSpeed;
import Library_2.Task_1.Data.Interface.InterfaceWalkable;

public class Duck extends HerbivoresBase implements InterfaceWalkable, InterfaceFlyable, InterfaceSwimmingSpeed {

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Krya-krya-krya";
    }

    @Override
    public int speedForFly() {
        return 80;
    }

    @Override
    public int speedForWalk() {
        return 5;
    }

    @Override
    public int speedSwimming() {
        return 3;
    }
}

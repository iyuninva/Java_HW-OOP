package Library_2.Task_1.Data.Predator;

import Library_2.Task_1.Data.Interface.InterfaceFlyable;

public class Bat extends PredatorBase implements InterfaceFlyable {

    public Bat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pip-pip-pip";
    }

    @Override
    public int speedForFly() {
        return 120;
    }

}

package Library_2.Task_1.Data.Predator;

import Library_2.Task_1.Data.Interface.InterfaceWalkable;

public class Wolf extends PredatorBase implements InterfaceWalkable {

    public Wolf(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Uuuu";
    }

    @Override
    public String toString() {
        return String.format("Wolf, %s", super.toString());
    }

    @Override
    public int speedForWalk() {
        return 40;
    }
}

package Library_2.Task_1.Data.Herbivores;

import Library_2.Task_1.Data.Interface.InterfaceWalkable;

public class Hare extends HerbivoresBase implements InterfaceWalkable {

    public Hare(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pipipi";
    }

    @Override
    public String toString() {
        return String.format("Hare, %s", super.toString());
    }

    @Override
    public int speedForWalk() {
        return 25;
    }
}

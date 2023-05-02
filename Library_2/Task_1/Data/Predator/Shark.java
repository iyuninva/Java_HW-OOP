package Library_2.Task_1.Data.Predator;

import Library_2.Task_1.Data.Interface.InterfaceSwimmingSpeed;

public class Shark extends PredatorBase implements InterfaceSwimmingSpeed {

    public Shark(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "swiiiii";
    }

    @Override
    public String toString() {
        return String.format("Shark, %s", super.toString());
    }

    @Override
    public int speedSwimming() {
        return 8;
    }

}

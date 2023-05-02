package Library_2.Task_2.Data.Reptiles;

import Library_2.Task_2.Data.Reptiles.Interface.InterfaceDiet;
import Library_2.Task_2.Data.Reptiles.Interface.InterfaceSpeedMovement;
import Library_2.Task_2.Data.Reptiles.Interface.InterfaceTypeAnimals;

public class Lizard extends BaseReptiles implements InterfaceSpeedMovement, InterfaceDiet, InterfaceTypeAnimals {

    public Lizard(String name, int age) {
        super(name, age);
    }

    @Override
    public String diet() {
        return "insects";
    }

    @Override
    public int speedMovement() {
        return 8;
    }

    @Override
    public String TypeAnimals() {
        return "Lizard";
    }

}

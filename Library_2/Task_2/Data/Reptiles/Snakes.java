package Library_2.Task_2.Data.Reptiles;

import Library_2.Task_2.Data.Reptiles.Interface.InterfaceDiet;
import Library_2.Task_2.Data.Reptiles.Interface.InterfaceSpeedMovement;
import Library_2.Task_2.Data.Reptiles.Interface.InterfaceTypeAnimals;

public class Snakes extends BaseReptiles implements InterfaceSpeedMovement, InterfaceDiet, InterfaceTypeAnimals {

    public Snakes(String name, int age) {
        super(name, age);
    }

    @Override
    public String diet() {
        return "meat mouse";
    }

    @Override
    public int speedMovement() {
        return 1;
    }

    @Override
    public String TypeAnimals() {
        return "Snake";
    }

}

package Library_2.Task_1.Config;

import java.util.ArrayList;
import java.util.List;

import Library_2.Task_1.Data.Animal;
import Library_2.Task_1.Data.Interface.InterfaceFlyable;
import Library_2.Task_1.Data.Interface.InterfaceSayable;
import Library_2.Task_1.Data.Interface.InterfaceSwimmingSpeed;
import Library_2.Task_1.Data.Interface.InterfaceWalkable;

public class ConfigZoo {
    private Radio radio;
    private List<Animal> listAnimal = new ArrayList<>();

    public List<Animal> getListAnimal() {
        return listAnimal;
    }

    public ConfigZoo addList(Animal animal) {
        listAnimal.add(animal);
        return this;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public List<InterfaceSayable> getSayble() {
        List<InterfaceSayable> sayables = new ArrayList<>();
        for (var item : listAnimal) {
            sayables.add(item);
        }
        sayables.add(radio);
        return sayables;
    }

    public List<InterfaceWalkable> walkables() {
        List<InterfaceWalkable> walkables = new ArrayList<>();
        for (var item : listAnimal) {
            if (item instanceof InterfaceWalkable)
                walkables.add((InterfaceWalkable) item);
        }
        return walkables;
    }

    public List<InterfaceFlyable> flyables() {
        List<InterfaceFlyable> flyables = new ArrayList<>();
        for (var item : listAnimal) {
            if (item instanceof InterfaceFlyable)
                flyables.add((InterfaceFlyable) item);
        }
        return flyables;
    }

    public List<InterfaceSwimmingSpeed> swimming() {
        List<InterfaceSwimmingSpeed> swimming = new ArrayList<>();
        for (var item : listAnimal) {
            if (item instanceof InterfaceSwimmingSpeed)
                swimming.add((InterfaceSwimmingSpeed) item);
        }
        return swimming;
    }

    public InterfaceWalkable winnerWalk() {
        int index = 0;
        for (int i = 0; i < walkables().size(); i++) {
            if (walkables().get(i).speedForWalk() > walkables().get(index).speedForWalk())
                index = i;
        }
        return walkables().get(index);
    }

    public InterfaceFlyable winnerFly() {
        int index = 0;
        for (int i = 0; i < flyables().size(); i++) {
            if (flyables().get(i).speedForFly() > flyables().get(index).speedForFly())
                index = i;
        }
        return flyables().get(index);
    }

    public InterfaceSwimmingSpeed winnerSwimmingSpeed() {
        int index = 0;
        for (int i = 0; i < swimming().size(); i++) {
            if (swimming().get(i).speedSwimming() > swimming().get(index).speedSwimming())
                index = i;
        }
        return swimming().get(index);
    }

}

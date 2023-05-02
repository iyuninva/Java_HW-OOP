package Library_2.Task_2.Config;

import java.util.ArrayList;
import java.util.List;

import Library_2.Task_2.Data.Animals;
import Library_2.Task_2.Data.Reptiles.Lizard;
import Library_2.Task_2.Data.Reptiles.Snakes;


public class Config {
    private List<Animals> listAnimals = new ArrayList<>();

    public List<Animals> getListAnimals() {
        return listAnimals;
    }

    public Config addList(Animals animal) {
        listAnimals.add(animal);
        return this;
    }

    public List<Snakes> snakeList() {
        List<Snakes> snakeList = new ArrayList<>();
        for(var item : listAnimals) {
            if(item instanceof Snakes) {
                snakeList.add((Snakes) item);
            }
        }
        return snakeList;
    }

    public List<Lizard> lizardList() {
        List<Lizard> lizardList = new ArrayList<>();
        for(var item : listAnimals) {
            if(item instanceof Lizard) {
                lizardList.add((Lizard) item);
            }
        }
        return lizardList;
    }

    
    
    
}

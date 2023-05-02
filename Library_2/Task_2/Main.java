package Library_2.Task_2;

import Library_2.Task_2.Config.Config;
import Library_2.Task_2.Data.Reptiles.Lizard;
import Library_2.Task_2.Data.Reptiles.Snakes;

public class Main {

    public static void main(String[] args) {

        Config terrarium = new Config();
        terrarium.addList(new Lizard("Tim", 1))
                .addList(new Lizard("Peri", 5))
                .addList(new Lizard("Scoter", 3))
                .addList(new Snakes("Severus", 4));

        System.out.println("-----------------------");
        for (var item : terrarium.lizardList()) {
            System.out.print(item);
        }
        System.out.println("-----------------------");
        for (var item : terrarium.snakeList()) {
            System.out.print(item);
        }
        System.out.println("-----------------------");
    }

}

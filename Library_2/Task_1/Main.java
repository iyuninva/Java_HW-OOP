package Library_2.Task_1;

import Library_2.Task_1.Config.ConfigZoo;
import Library_2.Task_1.Config.Radio;
import Library_2.Task_1.Data.Herbivores.Duck;
import Library_2.Task_1.Data.Herbivores.Hare;
import Library_2.Task_1.Data.Predator.Bat;
import Library_2.Task_1.Data.Predator.Shark;
import Library_2.Task_1.Data.Predator.Wolf;

public class Main {
    public static void main(String[] args) {

        ConfigZoo zoo = new ConfigZoo();

        zoo.setRadio(new Radio());

        zoo.addList(new Wolf("Wolf"))
                .addList(new Hare("Hare"))
                .addList(new Duck("DonaldDuck"))
                .addList(new Bat("Batman"))
                .addList(new Shark("Nemo"));

        for (var item : zoo.getListAnimal()) {
            System.out.println(item);
        }

        // for(var item: zoo.getSayble()) {
        // System.out.println(item.say());
        // }

        System.out.println("------------------");

        for (var item : zoo.walkables()) {
            System.out.printf("%s - %d\n", item.toString(), item.speedForWalk());
        }

        System.out.println("-----------------");

        for (var item : zoo.flyables()) {
            System.out.printf("%s - %d\n", item.toString(), item.speedForFly());
        }

        System.out.println("-----------------");

        for (var item : zoo.swimming()) {
            System.out.printf("%s - %d\n", item.toString(), item.speedSwimming());
        }

        System.out.println("----------------");

        System.out.println("Winner " + zoo.winnerWalk());

        System.out.println("-----------------");

        System.out.println("Winner " + zoo.winnerFly());

        System.out.println("-----------------");

        System.out.println("Winner " + zoo.winnerSwimmingSpeed());

        System.out.println("-----------------");

    }
}
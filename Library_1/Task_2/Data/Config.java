package Library_1.Task_2.Data;

import java.util.HashMap;
import java.util.Scanner;

public class Config {
    static HashMap<Integer, Double> volumeList = new HashMap<>();
    static Scanner in = new Scanner(System.in);

    public static HashMap<Integer, Double> volumeList() {
        volumeList.put(1, 0.2);
        volumeList.put(2, 0.3);
        volumeList.put(3, 0.4);
        return volumeList;
    }

    public static Double outVolumeList() {
        for(var key : volumeList().keySet()) {
            System.out.printf("Вариант - " + key + " (Объем - "  + volumeList().get(key) + ")" + "%n");
        }
        double volume = volumeList().get(intScanner());
        return volume;
    }

    public static Integer intScanner() {
        System.out.print("Поле ввода: ");
        int numberPosition = in.nextInt();
        if(numberPosition == 0) {
            return null;
        }
        return numberPosition;
    }
    
}

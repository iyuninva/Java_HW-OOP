package Library_1.Task_2.Data;

import java.util.HashMap;

import Library_1.Task_2.Main;

public class VendingMachine {
    HashMap<Integer, Drink> drinkList = new HashMap<>();
    private int pullMoney;

    public VendingMachine addListPosition(Integer numberPosition, Drink drink) {
        drinkList.put(numberPosition, drink);
        return this;
    } 

    public HashMap<Integer, Drink> getDrinkList() {
        return drinkList;
    }

    public Drink searchPosition(Integer numberPosition) {
        for(var key : getDrinkList().keySet()) {
            if(numberPosition == key) {
                return getDrinkList().get(key);
            }
        }
        return null;
    }

    public Double checkVolume(Integer numberPosition) {
        Drink sellDrink = searchPosition(numberPosition);
        System.out.println("Выберите объем: ");
        double volume = sellDrink.getVolume() - Config.outVolumeList();
        if(volume <= 0) {
            System.out.println("К сожалению напиток закончился, выберите другой!");
            Main.numberPosition();
            return null;
        } else {
            return volume;
        }
    }

    void pullMoney(Integer money) {
        pullMoney += money; 
        System.out.println("Денег в автомате: " + pullMoney);
    }

    public Drink sellPosition(Integer numberPosition) {
        try {
            Drink sellDrink = searchPosition(numberPosition);
            getDrinkList().replace(numberPosition, new Drink(sellDrink.getName(), checkVolume(numberPosition), sellDrink.getTemperature(), sellDrink.getPrice()));
            pullMoney(sellDrink.getPrice());
            Main.numberPosition();
            return sellDrink;
        } catch (Exception ex) {
            throw new RuntimeException("Position not found");
        }
    }
}

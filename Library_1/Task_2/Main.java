package Library_1.Task_2;

import Library_1.Task_2.Data.Config;
import Library_1.Task_2.Data.Drink;
import Library_1.Task_2.Data.VendingMachine;

public class Main {
    public static VendingMachine vendingMachine = new VendingMachine();

    public static void main(String[] args) {
        
        out(vendingMachine.addListPosition(1, new Drink("Кофе с молоком", 0.7, 55.0, 200))
        .addListPosition(2, new Drink("Черный кофе", 0.5, 65.0, 100))
        .addListPosition(3, new Drink("Капучино", 0.5, 65.0, 250))
        .addListPosition(4, new Drink("Латте", 1.0, 65.0, 250)));
        numberPosition();
    }

    public static void out(VendingMachine vendingMachine){
        System.out.println("--- Лист позиций --- ");
        for(var key : vendingMachine.getDrinkList().keySet()) {
            System.out.printf("Позиция - " + key  + "%n" + vendingMachine.getDrinkList().get(key) + "%n");
        }
    }

    public static Drink numberPosition() {
        try {
            System.out.println("Для покупки напитка введите номер позиции!");
            Drink numberPosition = vendingMachine.sellPosition(Config.intScanner());
            return numberPosition;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return null;
        
    }





    
}

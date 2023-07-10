package solid;

import solid.lsp.AbstractOrder;
import solid.lsp.FactoryOrder;

public class Main {
    public static void main(String[] args) {
        FactoryOrder creator = new FactoryOrder();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2, false));
        calculator.add(creator.create(1, 3, true));

        for (AbstractOrder order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Сумма заказа %d", calculator.calcAmount());
    }
}

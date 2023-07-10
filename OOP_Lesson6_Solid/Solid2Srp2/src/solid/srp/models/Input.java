package solid.srp.models;

import java.util.Scanner;

public class Input {

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public Order inputFromConsole() {
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int qnt = Integer.parseInt(prompt("Quantity: "));
        int price = Integer.parseInt(prompt("Price: "));
        return new Order(clientName, product, qnt, price);
    }

}

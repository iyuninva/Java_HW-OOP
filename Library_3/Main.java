package Library_3;

import Library_3.Config.MyLinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add("Test");
        list.add(1);
        list.add(2.5);
        list.add("qwerty");
        list.add(777);

        System.out.println("-----------------------");
        System.out.println("Размер: ");
        System.out.println(list.size());
        System.out.println("-----------------------");
        System.out.println("Получение элемента:");
        System.out.println(list.getElement(1));
        System.out.println("-----------------------");
        System.out.println("Вывод списка:");
        for (var data : list) {
            System.out.println(data);
        }
        System.out.println("-----------------------");
    }
}
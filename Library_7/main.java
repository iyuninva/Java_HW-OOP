import java.util.Date;

public class main {
        public static void main(String[] args) {
                Calculator c1 = new Calculator(2, 3);
                Calculator c2 = new Calculator(3, 4);
                System.out.println("c1= " + c1.getReal() + " + " + c1.getImaginary() + "i");
                System.out.println("c2= " + c2.getReal() + " + " + c2.getImaginary() + "i");
                c1.add(c2);
                System.out.println("add = " + c1.getReal() + " + " + c1.getImaginary() + "i");
                c1.subtract(c2);
                System.out.println("subtract = " +c1.getReal() + " + " + c1.getImaginary() + "i");
                c1.multiply(c2);
                System.out.println("multiply = " +c1.getReal() + " + " + c1.getImaginary() + "i");
                c1.divide(c2);
                System.out.println("divide = " +c1.getReal() + " + " + c1.getImaginary() + "i");

                logAction("Выполнены математические операции", new Date());

        }

        private static void logAction(String string, Date date) {
        }
}

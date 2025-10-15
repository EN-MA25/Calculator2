public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("2 + 2 = " + calculator.add(2, 2));
        System.out.println("2 - 2 = " + calculator.subtract(2, 2));
        System.out.println("2 * 2 = " + calculator.multiply(2, 2));
        System.out.println("2 / 2 = " + calculator.divide(2, 2));

    }
}
package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        try {
            int result = dividend / divider;

            int product = result * divider;

            if (product == dividend) {
                System.out.println("Can be divided completely");
            } else {
                System.out.println("Cannot be divided completely");
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }

    public static void main(String[] args) {
        IntegerDivider divider = new IntegerDivider();

        divider.printCompletelyDivided(10, 2);
        divider.printCompletelyDivided(15, 3);
        divider.printCompletelyDivided(7, 2);
        divider.printCompletelyDivided(10, 0);
    }
}

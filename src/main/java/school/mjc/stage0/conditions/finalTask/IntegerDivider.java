package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int sum = dividend / divider;
        sum = sum * divider;
        if (divider == 0 || dividend == 0)
            System.out.println("division by zero");
        else if (sum == dividend)
            System.out.println("can be divided completely");
        else
            System.out.println("cannot be divided completely" );
    }
}
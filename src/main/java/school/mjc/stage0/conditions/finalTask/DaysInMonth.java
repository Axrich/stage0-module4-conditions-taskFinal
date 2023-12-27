package school.mjc.stage0.conditions.finalTask;

import java.time.YearMonth;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("Invalid date");
            return;
        }

        try {
            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();

            if (yearMonth.isLeapYear()) {
                System.out.println("Leap year!");
            }

            System.out.println("Number of days in the month: " + daysInMonth);
        } catch (Exception e) {
            System.out.println("Invalid date");
        }
    }

    public static void main(String[] args) {
        DaysInMonth daysInMonth = new DaysInMonth();

        daysInMonth.printDays(2023, 2);
        daysInMonth.printDays(2024, 2);
        daysInMonth.printDays(2023, 13);
        daysInMonth.printDays(-2023, 7);
    }
}

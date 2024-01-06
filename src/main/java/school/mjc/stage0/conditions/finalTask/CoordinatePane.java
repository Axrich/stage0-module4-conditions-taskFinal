package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("First quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Fourth quadrant");
        } else if (x == 0 && y == 0) {
            System.out.println("Zero point");
        }
    }

    public static void main(String[] args) {
        CoordinatePane coordinatePane = new CoordinatePane();

        coordinatePane.printQuadrant(3, 4);
        coordinatePane.printQuadrant(-2, 5);
        coordinatePane.printQuadrant(-3, -2);
        coordinatePane.printQuadrant(4, -1);
        coordinatePane.printQuadrant(0, 0);
    }
}

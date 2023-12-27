package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (isValidTriangle(firstSide, secondSide, thirdSide)) {
            System.out.println("This is a valid triangle");
        } else {
            System.out.println("It's not a triangle");
        }
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    public static void main(String[] args) {
        TriangleSidesValidator triangleValidator = new TriangleSidesValidator();

        // Example usage:
        triangleValidator.validate(3, 4, 5);
        triangleValidator.validate(1, 1, 3);
        triangleValidator.validate(7, 8, 15);
    }
}

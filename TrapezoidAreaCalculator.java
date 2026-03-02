import java.util.Scanner;

public class TrapezoidAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baseOne;
        double baseTwo;
        double height;
        double trapezoidArea;

        System.out.println("--- Trapezoid Area Calculator ---");
        
        System.out.print("Enter the length of the first base (a): ");
        baseOne = scanner.nextDouble();

        System.out.print("Enter the length of the second base (b): ");
        baseTwo = scanner.nextDouble();

        System.out.print("Enter the vertical height (h): ");
        height = scanner.nextDouble();

        trapezoidArea = (baseOne + baseTwo) * height / 2.0;

        System.out.println("\n--- Results ---");
        System.out.println("Base A: " + baseOne);
        System.out.println("Base B: " + baseTwo);
        System.out.println("Height: " + height);
        System.out.println("The calculated area is: " + trapezoidArea);

        scanner.close();
    }
}
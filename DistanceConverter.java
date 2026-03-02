import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double totalMeters;
        double conversionFactor = 1000.0;
        int wholeKilometers;

        System.out.println("--- Distance Unit Converter ---");
        
        System.out.print("Enter the distance in meters (e.g., 2540.5): ");
        totalMeters = reader.nextDouble();

        wholeKilometers = (int) (totalMeters / conversionFactor);

        System.out.println("\n--- Results ---");
        System.out.println("Precise Meters entered: " + totalMeters);
        System.out.println("Converted to whole Kilometers: " + wholeKilometers);

        reader.close();
    }
}
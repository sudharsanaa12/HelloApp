import java.util.Scanner;

public class DayFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayNumber = input.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other Day");
                break;
        }
        input.close();
    }
}
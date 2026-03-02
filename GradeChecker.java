import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double passMark = 50.0;
        double userScore = input.nextDouble();
        boolean hasPassed = userScore >= passMark;

        if (userScore > 90) {
            System.out.println("Excellent");
        } else if (hasPassed) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        
        input.close();
    }
}
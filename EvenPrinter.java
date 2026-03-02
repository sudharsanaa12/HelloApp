public class EvenPrinter {
    public static void main(String[] args) {
        int count = 0;
        int max = 10;

        while (count < max) {
            count++;
            if (count % 2 != 0) {
                continue;
            }
            System.out.println(count);
        }
    }
}
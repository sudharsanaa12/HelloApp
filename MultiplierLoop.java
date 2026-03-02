public class MultiplierLoop {
    public static void main(String[] args) {
        int limit = 10;
        int stopAt = 7;

        for (int i = 1; i <= limit; i++) {
            if (i == stopAt) {
                break;
            }
            int result = i * 2;
            System.out.println(result);
        }
    }
}
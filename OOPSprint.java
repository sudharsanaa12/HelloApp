import java.util.HashMap;
import java.util.Map;

public class OOPSprint {

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patterns = new HashMap<>();

        patterns.put('O', new CharacterPattern('O', new String[]{
                "  OOO  ",
                " O   O ",
                " O   O ",
                " O   O ",
                "  OOO  "
        }));

        patterns.put('P', new CharacterPattern('P', new String[]{
                " PPPP  ",
                " P   P ",
                " PPPP  ",
                " P     ",
                " P     "
        }));

        patterns.put('S', new CharacterPattern('S', new String[]{
                "  SSSS ",
                " S     ",
                "  SSS  ",
                "     S ",
                " SSSS  "
        }));

        String word = "OOPS";
        printBanner(word, patterns);
    }

    private static void printBanner(String word, Map<Character, CharacterPattern> patterns) {

        int height = patterns.get(word.charAt(0)).getPattern().length;

        for (int row = 0; row < height; row++) {
            for (char c : word.toCharArray()) {
                System.out.print(patterns.get(c).getPattern()[row] + "  ");
            }
            System.out.println();
        }
    }
}

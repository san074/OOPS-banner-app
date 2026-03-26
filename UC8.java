import java.util.HashMap;

public class UC8 {

    // Create HashMap containing character patterns
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        });

        charMap.put('P', new String[]{
                "**** ",
                "** **",
                "** **",
                "**** ",
                "**   ",
                "**   ",
                "**   "
        });

        charMap.put('S', new String[]{
                "*****",
                "**   ",
                "**   ",
                " ****",
                "   **",
                "   **",
                "*****"
        });

        return charMap;
    }

    // Display banner using character map
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int lineCount = charMap.get('O').length;

        for (int line = 0; line < lineCount; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append("   ");
            }

            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}
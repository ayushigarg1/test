import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

    public static void main(String[] args) {
        String input = "Programming";
        duplicateCharacters(input);
    }

    public static void duplicateCharacters(String str) {
        //create a map to count the characters
        Map<Character, Integer> charCount = new HashMap<>();
//        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Print duplicate characters
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
        System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times ");
            }
        }
    }
}







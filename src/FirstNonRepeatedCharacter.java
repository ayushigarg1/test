public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String inputString = "swiss";
        char result = firstNonRepeatedCharacter(inputString);
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static char firstNonRepeatedCharacter(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Find the first non-repeated character
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0'; // Return null character if no non-repeated character is found
    }
}

public class RemoveDuplicateCharacters {

  public static void main(String[] args) {
    String input = "abcabcbb";
    String result = removeDuplicates(input);
    System.out.println("String after removing duplicates: " + result);
  }

  public static String removeDuplicates(String str) {
    StringBuilder result = new StringBuilder();
    int[] charCount = new int[256]; // Assuming ASCII characters

    for (int i = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);
      if (charCount[currentChar] == 0) {
        result.append(currentChar);
      }
      charCount[currentChar]++;
    }
    return result.toString();
  }
}

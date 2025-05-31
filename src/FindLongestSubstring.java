public class FindLongestSubstring {

  public static void main(String[] args) {
    String input = "abcabcbb";
    int length = findLongestSubstringLength(input);
    System.out.println("Length of the longest substring without repeating characters: " + length);
  }

  public static int findLongestSubstringLength(String str) {
    int maxLength = 0;
    int start = 0;
    int[] charIndex = new int[256]; // Assuming ASCII characters

    for (int i = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);
      if (charIndex[currentChar] > start) {
        start = charIndex[currentChar];
      }
      charIndex[currentChar] = i + 1; // Update the index of the character
      maxLength = Math.max(maxLength, i - start + 1);
    }
    return maxLength;
  }
}

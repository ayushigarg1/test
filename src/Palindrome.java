// write a program to find Palindrome without string inbuilt functions

public class Palindrome {
  public static void main(String[] args) {
    String input = "madam";
    boolean isPalindrome = checkPalindrome(input);
    System.out.println("Is the string \"" + input + "\" a palindrome? " + isPalindrome);
  }

  public static boolean checkPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false; // Not a palindrome
      }
      left++;
      right--;
    }
    return true; // Is a palindrome
  }
}

// with inbuilt functions

// public class Palindrome{
//
//    public static void main(String[] args) {
//        String inputString = "madam";
//        boolean isPalindrome = checkPalindrome(inputString);
//        System.out.println("Is the string \"" + inputString + "\" a palindrome? " + isPalindrome);
//    }
//
//    public static boolean checkPalindrome(String str) {
//        StringBuilder reversedString = new StringBuilder(str).reverse();
//        return str.equals(reversedString.toString());
//    }
// }

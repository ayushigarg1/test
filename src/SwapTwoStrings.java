public class SwapTwoStrings {
  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "World";

    System.out.println("Before swapping: str1 = " + str1 + ", str2 = " + str2);

    // Swap the strings
    String temp = str1;
    str1 = str2;
    str2 = temp;

    System.out.println("After swapping: str1 = " + str1 + ", str2 = " + str2);
  }
}

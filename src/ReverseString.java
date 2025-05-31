public class ReverseString {

  public static void main(String[] args) {

    String inputString = "Hello World";
    reverseString(inputString);
  }

  public static void reverseString(String str) {

    StringBuilder result = new StringBuilder();

    for (int i = str.length() - 1; i >= 0; i--) {
      result.append(str.charAt(i));
    }
    System.out.println("reversed string is " + result);
  }
}

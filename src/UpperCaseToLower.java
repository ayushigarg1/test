public class UpperCaseToLower {

  // ➡ Write a Java program to convert uppercase letters to lowercase and lowercase to uppercase

  public static void main(String[] args) {
    String input = "Hello World! This is a Test String.";
    StringBuilder output = new StringBuilder();

    for (char c : input.toCharArray()) {
      if (Character.isUpperCase(c)) {
        output.append(Character.toLowerCase(c));
      } else if (Character.isLowerCase(c)) {
        output.append(Character.toUpperCase(c));
      } else {
        output.append(c); // Keep non-alphabetic characters unchanged
      }
    }

    System.out.println("Original String: " + input);
    System.out.println("Converted String: " + output.toString());
  }
}
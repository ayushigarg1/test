public class countCharactersInString {

    public static void main(String[] args) {
        String inputString = "Hello World";
        int count = countCharacters(inputString);
        System.out.println("Number of characters in the string: " + count);
    }

    public static int countCharacters(String str) {
        return str.length();
    }
}

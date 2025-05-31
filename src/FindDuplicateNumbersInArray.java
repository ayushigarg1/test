import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumbersInArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3};
    findDuplicateNumbers(numbers);
  }

  public static void findDuplicateNumbers(int[] arr) {
    // Create a map to count occurrences of each number
    Map<Integer, Integer> numberCount = new HashMap<>();

    for (int num : arr) {
      numberCount.put(num, numberCount.getOrDefault(num, 0) + 1);
    }

    // Print duplicate numbers
    for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
      }
    }
  }
}

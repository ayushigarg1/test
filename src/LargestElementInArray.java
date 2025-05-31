public class LargestElementInArray {

  public static void main(String[] args) {
    int[] numbers = {3, 5, 7, 2, 8, 6};
    int largest = findLargestElement(numbers);
    System.out.println("The largest element in the array is: " + largest);
  }

  public static int findLargestElement(int[] arr) {
    int largest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }
}

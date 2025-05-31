public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 6, 4};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest number is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }
}

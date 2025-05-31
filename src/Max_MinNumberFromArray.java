public class Max_MinNumberFromArray {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};

        int maxNumber = findMax(numbers);
        int minNumber = findMin(numbers);

        System.out.println("Maximum number: " + maxNumber);
        System.out.println("Minimum number: " + minNumber);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

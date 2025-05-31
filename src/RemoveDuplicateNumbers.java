import java.util.*;
public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 2, 3, 4, 1, 3};

        int[] unique = removeDuplicates(arr);

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after removing duplicates: " + Arrays.toString(unique));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();

        // Add all elements to set (automatically removes duplicates)
        for (int num : arr) {
            set.add(num);
        }

        // Convert set back to int[]
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }
}





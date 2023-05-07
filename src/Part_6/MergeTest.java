package Part_6;

import java.util.Arrays;

public class MergeTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 2, 1, 12, 3, 9, 11, 0, 5, 6};
        Merge.sort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [0, 1, 2, 3, 4, 5, 6, 9, 11, 12]
    }
}


package Array;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        // ==================================================
        // SHALLOW COPY
        // ==================================================

        // x does NOT create a new array.
        // x and arr point to the SAME array in memory.

        // int[] x = arr;

        // Changing x will also change arr.
        // x[0] = 100;

        // System.out.println(x[0]);   // 100
        // System.out.println(arr[0]); // 100


        // ==================================================
        // DEEP / INDEPENDENT COPY
        // ==================================================

        // Arrays.copyOf() creates a new array
        // containing the same values as arr.

        int[] y = Arrays.copyOf(arr, arr.length);

        // Change the first element of y
        y[0] = 100;

        // y has changed
        System.out.println("y[0] = " + y[0]);

        // arr has NOT changed because y is a separate array
        System.out.println("arr[0] = " + arr[0]);
    }
}
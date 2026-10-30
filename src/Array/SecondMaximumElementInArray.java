
package Array;

import java.util.Scanner;
import java.util.Arrays;

public class SecondMaximumElementInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size (n):");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        System.out.println("Array: " + Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        System.out.println("Maximum Element: " + max);

        if (smax == Integer.MIN_VALUE) {
            System.out.println("Second maximum distinct element does not exist.");
        } else {
            System.out.println("Second Maximum Element: " + smax);
        }

        sc.close();
    }
}


package Array;

import java.util.Scanner;

public class ForEachLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask for array size
        System.out.println("Enter Array Size:");
        int n = sc.nextInt();

        // Create an integer array
        int[] arr = new int[n];

        // Take input for array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // For-each loop to print array elements
        System.out.println("Array elements are:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        sc.close(); // Close Scanner
    }
}

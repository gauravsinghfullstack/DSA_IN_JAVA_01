package Array;

import java.util.Scanner;

public class LinearSearchInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter the Size of Array (n): ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Take array elements
        System.out.println("Enter the Elements in Array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Take the value to search
        System.out.print("Enter the Value of Element (x): ");
        int x = sc.nextInt();

        // Assume element is not found
        boolean found = false;

        // Search the array
        for (int i = 0; i < arr.length; i++) {

            if (x == arr[i]) {
                found = true;
                break;
            }
        }

        // Print result
        if (found) {
            System.out.println("Yes, Element Found");
        } else {
            System.out.println("No, Element Not Found");
        }

        sc.close();
    }
}

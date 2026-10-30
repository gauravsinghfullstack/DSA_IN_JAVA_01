package Array;

import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size Of Array(N):");
        int N = sc.nextInt();


        int arr[] = new int[N];


        System.out.println("Enter the Elements Of Array:");

        for (int i = 0; i < N; i++) {

            // Store each element at index i
            arr[i] = sc.nextInt();
        }

        // Print all array elements
        System.out.print("Array: ");

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        // Initialize product with 1
        int product = 1;

        // Calculate product of all array elements
        for (int i = 0; i < N; i++) {
            product *= arr[i];
        }

        System.out.println("\nProduct Of Array: " + product);
    }
}
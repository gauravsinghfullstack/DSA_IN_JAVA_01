package Array;

import java.util.Scanner;

public class MaxElementOfArray {
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

        int max = arr[0];
        for (int i=0; i<N; i++){
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Maximum Element in Array(MAX):" +max);
    }
}

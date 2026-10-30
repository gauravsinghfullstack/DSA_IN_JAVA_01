package Array;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seven Elements:");

        int[] arr = new int[7];


        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Length Of Array: " + arr.length);


        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

//            System.out.print(2*arr[i] + " ");    multiply kar skate hai
        }
        sc.close();
    }
}
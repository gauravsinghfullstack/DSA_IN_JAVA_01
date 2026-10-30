package Array;

import java.util.Scanner;

public class PrintNegativeValueInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the Element in Array:");
        int x = sc.nextInt();


        for (int i=0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }

        System.out.println("Length Of Array: " + arr.length);


        for (int i=0; i<n; i++){
            if (arr[0]<0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}

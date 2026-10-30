package Multi_Dimensional_Array;

import java.util.Scanner;

public class OutputIn2DArray {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        System.out.println("Enter the 12 element:");

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println( );
        }
    }
}

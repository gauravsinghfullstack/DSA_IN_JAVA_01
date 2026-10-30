package Multi_Dimensional_Array;

import static java.lang.IO.print;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 5, 6, 7, 5},
                {7, 3, 0, 0, 2},
                {5, 0, 1, 3, 0},
                {6, 0, 2, 7, 6},
                {1, 3, 7, 2, 2},
        };
        print(arr);
//        transpose
        for (int i=0; i<arr.length; i++){
            for (int j=0; j< arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }
    private static void print{int[][] arr}{
        for (int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

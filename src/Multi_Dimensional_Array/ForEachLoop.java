package Multi_Dimensional_Array;

public class ForEachLoop {
    static void main(String[] args) {
        int[][] arr = {
                {6, 0, 2, 7, 6},
                {1, 3, 7, 2, 2},
                {9, 9, 4, 5, 2},
                {5, 1, 3, 4, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int ele : arr[i]) {
                System.out.print(ele + " ");
            }

            System.out.println();
        }
    }
}

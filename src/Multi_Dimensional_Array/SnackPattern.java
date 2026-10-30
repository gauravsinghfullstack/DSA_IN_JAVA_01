package Multi_Dimensional_Array;

public class SnackPattern {
    public static void main(String[] args) {

        int[][] arr = {
                {2, 5, 6, 7, 5},
                {7, 3, 0, 0, 2},
                {5, 0, 1, 3, 0},
                {6, 0, 2, 7, 6},
                {1, 3, 7, 2, 2},
                {9, 9, 4, 5, 2},
                {5, 1, 3, 4, 9}
        };

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {

                // Left to Right
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }

            } else {

                // Right to Left
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}

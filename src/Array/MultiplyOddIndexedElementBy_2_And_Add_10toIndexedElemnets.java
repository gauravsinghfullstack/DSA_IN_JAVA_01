package Array;

public class MultiplyOddIndexedElementBy_2_And_Add_10toIndexedElemnets {
    static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60};

        for (int i = 0; i < arr.length; i++) {

            // Odd index → multiply element by 2
            if (i % 2 == 1)
                arr[i] *= 2;

                // Even index → add 10
            else
                arr[i] += 10;

            // Print modified element
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
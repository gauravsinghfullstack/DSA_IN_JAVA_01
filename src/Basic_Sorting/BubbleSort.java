
package Basic_Sorting;

public class BubbleSort {

    // Method to print the array
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;

        System.out.println("Before sorting:");
        print(arr);

        // Optimized Bubble Sort
        for (int j = 0; j < n - 1; j++) {
            boolean isSorted = true;

            for (int i = 0; i < n - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    isSorted = false;
                }
            }

            // If no swaps occurred, the array is sorted
            if (isSorted) {
                break;
            }
        }

        System.out.println("After sorting:");
        print(arr);
    }
}

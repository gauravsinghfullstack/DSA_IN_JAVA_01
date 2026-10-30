
package Array;

public class ReverseArray {

    public static void main(String[] args) {

        // Initialize the array
        int arr[] = {3, 19, 56, 9, 83, 18, 24, 85, 14};

        // Find the length of the array
        int n = arr.length;

        // Print the original array
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Initialize two pointers
        int i = 0;       // First index
        int j = n - 1;   // Last index

        // Reverse the array using two pointers
        while (i < j) {

            // Store the left element temporarily
            int temp = arr[i];

            // Swap left and right elements
            arr[i] = arr[j];
            arr[j] = temp;

            // Move pointers toward the center
            i++;
            j--;
        }

        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();
    }
}

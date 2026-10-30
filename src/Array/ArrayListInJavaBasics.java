
package Array;
import java.util.ArrayList;
public class ArrayListInJavaBasics {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();      // Create an ArrayList to store Integer values

        arr.add(25);
        arr.add(21);                                      // Add elements to the ArrayList
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(2));  // Output: 18   Access the element at index 2 (third element)

        arr.set(3, 50);                               // Update the element at index 3 from 5 to 50

                                                        // Print the updated element at index 3  
        System.out.println(arr.get(3));  // Output: 50

                                                              // Print the complete ArrayList
        System.out.println("ArrayList: " + arr);


        int n = arr.size();                              // Similar to arr.length in arrays
                                                // Traverse the ArrayList using a normal for loop
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");                     // Print the element at the current index
        }

        System.out.println(); // Move to the next line

        // Traverse the ArrayList using an enhanced for-each loop
        for (int ele : arr) {

            // Print each element directly
            System.out.print(ele + " ");
        }
    }
}

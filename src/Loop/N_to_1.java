package Loop;

import java.util.Scanner;

public class N_to_1 {
    static void main(String[] args) {
        System.out.println("Enter the Value n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);

        }
    }
}

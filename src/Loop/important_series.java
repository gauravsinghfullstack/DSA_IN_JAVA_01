package Loop;

import java.util.Scanner;

public class important_series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of n:");
        int n = sc.nextInt();

        int a = 1;
        int r = n;

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");
            System.out.print(r + " ");

            a++;
            r--;
        }

        sc.close();
    }
}

package Loop;

import java.util.Scanner;

public class Loop_1to100 {
    static void main(String[] args) {
        System.out.println("Enter the Last Num:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" ");
        }
     }
}

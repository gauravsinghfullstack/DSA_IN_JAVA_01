package pattern;

import java.util.Scanner;

public class NumberSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of Num:");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

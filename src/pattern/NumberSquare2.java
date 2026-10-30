package pattern;

import java.util.Scanner;

public class NumberSquare2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of num:");
//        System.out.println("Enter the Value of col");
        int m = sc.nextInt();

        for (int i=1; i<=m; i++){
            for (int j=1; j<=m; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

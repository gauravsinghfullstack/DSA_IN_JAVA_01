package pattern;

import java.util.Scanner;

public class LeftTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of num(m):");
        int m = sc.nextInt();

        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}

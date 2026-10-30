package pattern;

import java.util.Scanner;

public class HollowRectangle2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of row(r):");
        int m = sc.nextInt();

        System.out.println("Enter the Value of col(c):");
        int n = sc.nextInt();

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==m || j==1 || j==n)
                    System.out.print("*"+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

package pattern;

import java.util.Scanner;

public class StarRectangle1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value  of row:");
        int row = sc.nextInt();

        System.out.println("Enter the Value of col:");
        int col = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){            // colum ke liye  
            System.out.print("* ");
            }
            System.out.println();
        }

    }
}

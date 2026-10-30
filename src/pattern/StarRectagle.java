package pattern;

import java.util.Scanner;

public class StarRectagle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value OF row:");
        int row = sc.nextInt();
        for(int i=1; i<=row; i++){
            System.out.println("* * * * *");
        }
        
    }
}

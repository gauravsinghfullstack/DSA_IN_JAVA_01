package pattern;

import java.util.Scanner;

public class SmallAlphabetSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of Num:");
        int n = sc.nextInt();
        n += 96;

        for (char i=97; i<=n; i++){
            for (char j=97; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

package pattern;

import java.util.Scanner;

public class ABCDpattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of Num:");
        int n = sc.nextInt();
        n += 64;

        for (char i=65; i<=n; i++){
            for (char j=65; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

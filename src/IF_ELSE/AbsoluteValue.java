package IF_ELSE;

import java.util.Scanner;

public class AbsoluteValue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value:");
        int n = sc.nextInt();

        if (n > 0){
            System.out.print(n);
        }
        else {
            System.out.println(-n);
        }


    }
}

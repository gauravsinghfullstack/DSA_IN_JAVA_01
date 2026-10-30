package IF_ELSE;

import java.util.Scanner;

public class IntegerOrNot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        double n = sc.nextDouble();
        int x = (int)n;
        if (n-x == 0) {
            System.out.print("It is an Integer");
        }
        else {
            System.out.print("It is not Integer");
        }



    }
}

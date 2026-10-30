package IF_ELSE;

import java.util.Scanner;

public class FourDigitNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        double n = sc.nextDouble();
        if (n>999 && n<1000) {
            System.out.print("Number Four Digit");
        }
        else {
            System.out.print("It is not Four Digit");
        }



    }
}

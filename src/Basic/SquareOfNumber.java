package Basic;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num = sc.nextDouble();

        double s;
        s = num * num;

        System.out.println("Square = " + s);

        sc.close();
    }
}
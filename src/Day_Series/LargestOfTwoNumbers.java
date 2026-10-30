package Day_Series;

import java.util.Scanner;

public class LargestOfTwoNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value Of Num1:");
        double num1 = sc.nextDouble();

        System.out.print("Enter the Value Of Num2:");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("Largest number is Num1: " + num1);
        } else if (num2 > num1) {
            System.out.println("Largest number is Num2: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

    }
}

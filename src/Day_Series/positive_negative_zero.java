package Day_Series;

import java.util.Scanner;

public class positive_negative_zero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num1:");
        double a = sc.nextDouble();

        if (a > 0) {
            System.out.println("Number is Positive");
        }
        else if (a<0) {
            System.out.println("Number is Negative");
        }
        else {
            System.out.print("zero");
        }
    }
}

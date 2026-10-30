package Day_Series;

import java.util.Scanner;

public class BasicCalculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value Of Num1:");
        double num1 = sc.nextDouble();

        System.out.print("Enter the Value Of Num2:");
        double num2 = sc.nextDouble();

        System.out.println("Sum Of Num:" +(num1+num2));
        System.out.println("Diff Of Num:" +(num1-num2));
        System.out.println("Mult Of Num:" +(num1*num2));
        System.out.println("divi Of Num:" +(num1/num2));
        System.out.println("modulas Of Num:" +(num1%num2));


    }
}


package Day_Series;

import java.util.Scanner;

public class EvenOrOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value Of Num1:");
        double num1 = sc.nextDouble();
        

        if (num1%2==0){
            System.out.print("Number is Even");
        }
        else {
            System.out.print("Number is Odd");
        }
    }
}

package IF_ELSE;

import java.util.Scanner;

public class DivisibleBY_5or3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        double n = sc.nextDouble();
        if (n%5==0 || n%3==0) {
            System.out.print("Divisible By 5 or 3:" +n);
        }
        else {
            System.out.print("Num is not Divisible By 5 or 3:" +n);
        }



    }
}

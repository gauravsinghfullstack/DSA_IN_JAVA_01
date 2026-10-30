package IF_ELSE;

import java.util.Scanner;

public class GrestestNumber3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Num1:");
        double a = sc.nextDouble();
        System.out.println("Enter the Num2:");
        double b = sc.nextDouble();
        System.out.println("Enter the Num3:");
        double c = sc.nextDouble();

        if (a>b && a>c){
            System.out.println("Num1 is greatest:" +a);
        } else if (a<b && b>c) {
            System.out.println("Num2 is greatest:" +b);
        }
        else if (a<c && b<c) {
            System.out.println("Num2 is greatest:" +c);
        }
        else {
            System.out.println("All are number equal");
        }
    }
}

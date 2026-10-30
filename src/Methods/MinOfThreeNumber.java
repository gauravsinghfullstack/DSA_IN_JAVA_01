package Methods;

import java.util.Scanner;

public class MinOfThreeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        System.out.println("Enter b:");
        System.out.println("Enter c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Minimum Value");
        System.out.println(Math.min(Math.min(a,b),c));
    }
}

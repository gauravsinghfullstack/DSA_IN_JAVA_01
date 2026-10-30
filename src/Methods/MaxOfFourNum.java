package Methods;

import java.util.Scanner;

public class MaxOfFourNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println("Enter c:");
        int c = sc.nextInt();

        System.out.println("Enter d:");
        int d = sc.nextInt();

        System.out.println("Maximum Value: "
                + Math.max(Math.max(a, b), Math.max(c, d)));

        sc.close();
    }
}

package Methods;

import java.util.Scanner;

public class MaxOfTreeBuiltIn {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        System.out.println("Enter b:");
        System.out.println("Enter c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Maximum Value");
        System.out.println(Math.max(Math.max(a,b),c));
    }
}

package Basic;

import java.util.Scanner;

public class AreaOfCircle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //input lene ke liye
        System.out.print("Enter Radius:");
        double r = sc.nextDouble();
        double pi, a;
        pi = 3.14;
        a = pi*r*r;
        System.out.print("Area:");
        System.out.println(a);

    }
}


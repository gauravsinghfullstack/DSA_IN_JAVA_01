package Basic;

import java.util.Scanner;

public class SimpleInterest {
    static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Enter the value of p:");
        double p = ab.nextDouble();

        System.out.print("Enter the value of r:");
        double r = ab.nextDouble();

        System.out.print("Enter the value of t:");
        double t = ab.nextDouble();

        double si = p*r*t/100;

        System.out.print("Simple Interest:" + si);
    }
    }
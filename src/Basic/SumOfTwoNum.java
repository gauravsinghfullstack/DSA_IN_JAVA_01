package Basic;

import java.util.Scanner;

public class SumOfTwoNum {
    static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Enter the Value of x:");
        int x = ab.nextInt();

        System.out.print("Enter the Value of y:");
        int y = ab.nextInt();

        System.out.print("Enter the Value of z:");
        int z = ab.nextInt();


        System.out.print("Enter the Value of x+y+z:");
        System.out.print(x+y+z);
    }
}

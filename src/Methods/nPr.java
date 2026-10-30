package Methods;

import java.util.Scanner;

public class nPr {
    public static int Factorial(int x){
        int f  = 1;
        for(int i=1; i<=x; i++){
            f *= i;
        }
        return f;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter c:");
        int r = sc.nextInt();


        int nCr = Factorial(n)/(Factorial(r)*Factorial(n-r));
        System.out.println(nCr);

    }
}

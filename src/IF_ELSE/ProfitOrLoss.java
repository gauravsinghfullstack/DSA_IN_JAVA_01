package IF_ELSE;

import java.util.Scanner;

public class ProfitOrLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the SP:");
        double sp = sc.nextDouble();

        System.out.println("Enter the CP:");
        double cp = sc.nextDouble();

        if (sp > cp) {
            System.out.print("Profit is " +(sp - cp));
        } else if (sp < cp){
            System.out.print("Loss is" +(cp - sp));
        } else {
            System.out.print("No Profit and No loss");
        }
    }
}
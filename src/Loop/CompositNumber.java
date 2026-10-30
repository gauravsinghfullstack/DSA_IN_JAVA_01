import java.util.Scanner;

public class CompositNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        boolean composite = false;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                composite = true;
                break;
            }
        }

        if (composite) {
            System.out.println("Composite Number");
        } else {
            System.out.println("Not a Composite Number");
        }

        sc.close();
    }
}
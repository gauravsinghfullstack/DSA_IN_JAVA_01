package Array;

public class PassingArrayToMethod {
    static void main(String[] args) {
        int x[] = {10,3,29,38};
        System.out.println("Element Of 2nd Index: " +x[2]);
        change(x);
        System.out.println("After Change Element: " +x[2]);
    }
    public static void change(int[] y){
        y[2] = 99;
    }

}

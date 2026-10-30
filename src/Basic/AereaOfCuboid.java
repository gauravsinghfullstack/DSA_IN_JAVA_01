package Basic;

public class AereaOfCuboid {
    public static void main(String[] args) {
        double L = 10;
        double B = 5;
        double H = 4;

        double area = 2 * (L * B + B * H + H * L);

        System.out.println("Surface Area of Cuboid = " + area);
    }
}
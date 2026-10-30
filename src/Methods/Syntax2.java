package Methods;

public class Syntax2 {
    static void main(String[] args) {
        System.out.println("Name:");

        Name();
        student();

    }
    public static void Colle(){
        System.out.println("KIET");
    }
    public static void Branc(){
        System.out.println("CSE");
    }
    public static void Specilization(){
        System.out.println("AI&ML");
        Branc();
        Colle();
    }
    public static void student(){
        System.out.println("Roll No."+ "2300291530072");
        Specilization();
    }
    public static void Name(){
        System.out.println("Gaurav Singh");
    }
}

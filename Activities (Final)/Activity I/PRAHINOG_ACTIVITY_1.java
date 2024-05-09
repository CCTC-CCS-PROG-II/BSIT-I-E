import java.util.Scanner;

public class PRAHINOG_ACTIVITY_1 {
    public static double feettoinches(double feetvalue) {
        double inches = feetvalue * 12;
        System.out.println(inches);
        return inches; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        feettoinches(num);
    }
}

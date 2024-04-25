import java.util.Scanner;

public class ABATAYO_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of feet:");
        double feet = sc.nextDouble();
        double inches = sc.nextDouble();
        System.out.print("Inches:" + inches);
        sc.close();
    }

    public static double convertfeettoInches(double feet) {
        return feet * 12;

    }

}

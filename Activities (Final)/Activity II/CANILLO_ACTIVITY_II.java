import java.util.Scanner;

public class CANILLO_ACTIVITY_II {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of feet:");
        double feet = scanner.nextDouble();

        double inches = convertFeetToInches(feet);

        System.out.println("Inches: " + inches);

        scanner.close();
    }

    public static double convertFeetToInches(double feet) {
        return feet * 12;
    }
}
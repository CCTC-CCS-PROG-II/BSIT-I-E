import java.util.Scanner;

public class SUNGIKP_ACTIVITY_II{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input
        System.out.println("Enter the number of feet:");
        double feet = scanner.nextDouble();

        // Convert feet to inches
        double inches = convertFeetToInches(feet);

        // Print results
        System.out.println("Inches: " + inches);

        scanner.close();
    }

    // Method to convert feet to inches
    public static double convertFeetToInches(double feet) {
        return feet * 12;
    }
}

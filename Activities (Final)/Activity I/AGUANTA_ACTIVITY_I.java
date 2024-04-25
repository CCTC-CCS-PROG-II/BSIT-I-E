import java.util.Scanner;

public class AGUANTA_ACTIVITY_I {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        // Calculate area
        double area = calculateArea(length, width);

        // Print results
        System.out.println("Area: " + area);

        scanner.close();
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}
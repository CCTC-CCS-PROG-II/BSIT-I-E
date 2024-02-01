import java.util.Scanner;

public class BANDOLON_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your color: ");
        String color = scanner.nextLine();

        switch (color.toLowerCase()) { // Convert input to lowercase for case-insensitivity
            case "red":
                System.out.println("Box 1");
                break;
            case "green":
                System.out.println("Box 2");
                break;
            case "black":
                System.out.println("Box 3");
                break;
            default:
                System.out.println("Unknown color, no matching box.");
        }

        // Close the Scanner
        scanner.close();
    }
}

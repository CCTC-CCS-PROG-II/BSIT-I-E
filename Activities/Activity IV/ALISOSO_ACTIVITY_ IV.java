mport java.util.Scanner;

public class ALISOSO_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color: ");
        String color = sc.nextLine(); // Read color input from the user
        
        switch (color.toUpperCase()) { // Convert input to uppercase for case-insensitivity
            case "RED":
                System.out.println("Number 1");
                break;
            case "GREEN":
                System.out.println("Number 2");
                break;
            case "BLACK":
                System.out.println("Number 3");
                break;
            default:
                System.out.println("None");
        }
    }
}

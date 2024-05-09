import java.util.Scanner;

public class CANTEBEROS_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color base on the following choices red goes to box 1, green goes to box 2, black goes to box 3 (red, green, black): ");
        String color = scanner.nextLine();

        switch (color) {
            case "red":
                System.out.println("Goes to box 1");
                break;
            case "green":
                System.out.println("Goes to box 2");
                break;
            case "black":
                System.out.println("Goes to box 3");
                break;
            default:
                System.out.println("Invalid color");
        }
    }
}

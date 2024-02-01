import java.util.Scanner;

public class LIBRADO_ACTIVITY_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a color: ");
        System.out.println("Red Goes to box 1");
        System.out.println("Green Goes to box 2");
        System.out.println("Black Goes to box 3");
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

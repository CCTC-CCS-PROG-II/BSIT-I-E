import java.util.Scanner;

public class PLARISAN_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color;
        System.out.println("The robot will categorize a color ");
        System.out.println("Red goes to #1");
        System.out.println("Green goes to #2");
        System.out.println("Black goes to #3");
        System.out.println();
        System.out.println("Enter the color: ");
        color = sc.nextLine().toLowerCase(); 
        switch (color) {
            case "red":
                System.out.println("1");
                break;
            case "green":
                System.out.println("2");
                break;
            case "black":
                System.out.println("3");
                break;
            default:
                System.out.println("Error");
        }
    }
}

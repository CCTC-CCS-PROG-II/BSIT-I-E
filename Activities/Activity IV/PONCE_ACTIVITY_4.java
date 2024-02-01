import java.util.Scanner;

public class PONCE_ACTIVITY_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER COLOR :");
        String robot = scanner.nextLine();

        switch (robot) {
            case "RED":
                System.out.println("NUMBER 1");
                break;
            case "GREEN":
                System.out.println("NUMBER 2");
                break;
            case "BLACK":
                System.out.println("NUMBER 3");
                break;
            default:
                System.out.print("lmsc");
        }
    }
}

import java.util.Scanner;

public class ALSADO_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of seconds:");
        int seconds = scanner.nextInt();
        
        for (int i = seconds; i > 0; i--) {
            System.out.println(i);
        }
        
        System.out.println("Countdown finished!");
    }
}

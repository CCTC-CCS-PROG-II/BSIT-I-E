import java.util.Scanner;

public class DEGUZMAN_ACTIVITY_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= N) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
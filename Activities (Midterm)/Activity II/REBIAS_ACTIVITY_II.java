import java.util.Scanner;

public class REBIAS_ACTIVITY_II {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] scores = new int[10];

        for (int i = 0; i < scores.lenght; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = sc.nextLine();
            sum += i;
        }
        System.out.println(sum);
    }
}

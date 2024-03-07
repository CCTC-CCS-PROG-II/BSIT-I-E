import java.util.Scanner;

public class MONDEJAR_ACTIVITY_2 {
    public static void main(String[] args) {
        Scanner lynch = new Scanner(System.in);
        int[] scores = new int[10];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] =  lynch.nextInt();
            sum += scores[i];
        }

        double average = (double) sum / scores.length;
        System.out.println("Average score: " + average);
    }
}
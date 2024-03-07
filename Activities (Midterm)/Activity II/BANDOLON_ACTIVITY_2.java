import java.util.Scanner;

public class BANDOLON_ACTIVITY_2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter score " + (i + 1) + ": ");
            scores[i] = sc.nextDouble();
        }

        double sum = 0;
        for (double score : scores) {
            sum += score;
        } 
        
        double average = sum / scores.length;
        System.out.println("Average: "+ average);
    }
}
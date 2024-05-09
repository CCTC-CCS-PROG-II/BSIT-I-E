import java.util.Scanner;

 public class ALISOSO_ACTIVITY_II{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double [] scores = new double[10];


        for (int i = 0; i < scores.length; i++){
            System.out.print("Enter score " + (i + 1) + ":");
            scores[i] = sc.nextDouble();
    }
    double sum= 0;
    for( double score :scores){
        sum += score;
    }
    double average = sum / scores.length;
    System.out.println("Average: " + average);

    }
}

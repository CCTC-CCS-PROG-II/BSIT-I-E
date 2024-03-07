java.util.Scanner;
public class BRIONES_ACTIVITY_2{
    public stimportatic void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double [] x = new double[10];
        
        System.out.println("Enter 10 scores: ");
        for(int i = 0; i < 10;i++){
            System.out.println("Enter the score " + (1 + 1)+": ");
            score[i] = sc.nextdouble();
        }

        double sum = 0;
        for(double score : scores){
            sum += score;
        }

        double average = sum / 10;
        System.out.println("Average score: " + average);
    }
    
}
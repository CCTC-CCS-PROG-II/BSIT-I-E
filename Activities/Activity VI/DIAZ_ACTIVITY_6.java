import java.util.Scanner;
public class DIAZ_ACTIVITY_6 {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        int sum = 0;

        int i = 1;

        while(i <= num) {
            sum += 1;
            i++;

        }
        System.out.println(sum);
    }
}

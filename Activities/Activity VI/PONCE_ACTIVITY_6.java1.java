import java.util.Scanner;

public class PONCE_ACTIVITY_6 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(x:"Enter your number: ");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= num){
            sum += i;
            i++;
        } 
        System.out.println(sum);
    }
}
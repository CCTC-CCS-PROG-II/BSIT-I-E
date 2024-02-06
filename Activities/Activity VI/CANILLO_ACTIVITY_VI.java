import java.util.Scanner;

public class CANILLO_ACTIVITY_VI{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you number: ");
        int num = sc.nextInt();

        int sum = 0;
        int i = 1;

        while(i <=num){
            sum += i;
            i++;

        }
        System.out.println(sum);
    }
}

import java.util.Scanner;
public class ALISOSO_ACTIVITY_VI{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a countdown number:");
        int counter = sc.nextInt();
        int counter2 = sc.nextInt();
        
        while(counter <= 0){
            counter--;
            System.out.println(counter);
        }

    }
}
import java.util.Scanner;
public class DEJTO_ACTIVITY_II{
    public static void main (String []args){
        
        Scanner bot = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.print ("Enter first number");
        num1 = bot.nextInt();
        System.out.print ("Enter second number");
        num2 = bot.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;

        System.out.println ("Sum = " + sum);
        System.out.println ("Diff = " + diff);
        System.out.println ("Prod = " + sum);
    }
}
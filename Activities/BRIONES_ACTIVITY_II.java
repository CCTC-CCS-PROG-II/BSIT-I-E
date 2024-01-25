import java.util.Scanner;

public class BRIONES_ACTIVITY_II{
    public static void main(String[] args){
         Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Enter First number: ");

        int num1 = Scanner.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = Scanner.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;

    System.out.println("the sum is :"+ sum);
    System.out.println("The difference is :"+ diff);
    System.out.println("The prod is :"+ prod);
    }
}
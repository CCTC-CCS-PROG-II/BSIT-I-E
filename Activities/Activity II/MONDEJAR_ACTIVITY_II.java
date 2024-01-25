import java.util.Scanner;
public class MONDEJAR_ACTIVITY_II{
    public static void main(String []args){

        Scanner lynch = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Enter First number: ");
        num1 = lynch.nextInt();
        System.out.print("Enter Second number: ");
        num2 = lynch.nextInt();

         int Sum = num1 + num2;
         int Difference = num1 - num2;
         int Product = num1 * num2;
        
         System.out.println("Sum =" + Sum);
         System.out.println("difference =" + Difference);
         System.out.println("product =" + Product);
    }
}
import java.util.Scanner;
public class tampus_activity_ll{
    public static void main(String []args){

       Scanner clifton = new Scanner(System.in);
       int num1;
       int num2;

       System.out.print("Enter First number");
       num1 = clifton.nextInt();
       System.out.print("Enter Second number");
       num1 = clifton.nextInt();

       int Sum = num1 + num2;
       int Difference = num1 - num2;
       int Product = num1 * num2;

       System.out.println("Sum =" + Sum);
       System.out.println("Difference =" + Difference);
       System.out.println("Product =" + Product);
    }
}




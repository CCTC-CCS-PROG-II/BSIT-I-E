import java.util.Scanner;

public class ALSADO_ACTIVITY_1{
    public static void main(String[] args){

        Scanner Burikatsiya = new Scanner(System.in);
            int num1;
            int num2;
            
            System.out.print("Enter the first number: ");
            num1 = Burikatsiya.nextInt();

            System.out.print("Enter the second number: ");
            num2 = Burikatsiya.nextInt();

            int Sum = num1 + num2;
            int Difference = num1 - num2;
            int Product = num1 * num2;

            System.out.println("Sum = " + Sum);
            System.out.println("Sub = " + Difference);
            System.out.println("Mul =" + Product);
    
    }
}
 

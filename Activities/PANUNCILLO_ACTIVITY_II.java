import java.util.Scanner;

public class PANUNCILLO_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner circle = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enrer the first number: " );
        num1 = circle.nextInt();

        System.out.print("Enter the second number:" );
        num2 = circle.nextInt();

        int Sum = num1 + num2;
        int Difference = num1 - num2;
        int Product = num1 * num2;

        System.out.println("Sum = " + Sum);
        System.out.println("Difference = " + Difference);
        System.out.println("Product = " + Product);
    }
}        

    
    


        
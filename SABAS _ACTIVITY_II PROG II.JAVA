import java.util.Scanner;
public class SABAS{ 
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Ente First number :");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number :");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;

        System.out.println("The sum is :"+ sum);
        System.out.println("The difference is : + diff");
        System.out.println("The Product is :" + prod);

    }
}
import java.util.Scanner;
public class JAVELLO_ACTIVITY_II {
    public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number :");
    int num1 = sc.nextInt();

    System.out.print("Enter Second Number :");
    int num2 = sc.nextInt();

    int sum = num1 + num2;
    int diff = num1 - num2;
    int prod = num1 * num2;

System.out.println("The sum is :" + sum);
System.out.println("The Difference is :" + diff);
System.out.println("The Product is :" + prod);
}

}
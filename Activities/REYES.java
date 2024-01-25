import java.util.Scanner;
public class REYES{

    public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
        int num1;
        int num2;
        System.out.println("Enter your first number"); 
        int fnum = scanner.nextInt();
        System.out.println("Enter your second number");
        int snum = scanner.nextInt();
        int sum = fnum + snum;
        System.out.println("sum is = "+sum);
        int sub = fnum - snum;
        System.out.println("sub is = "+sub);
        int prod = fnum * snum;
        System.out.println("prod is = "+prod);

    }   
}
import java.util.Scanner;
public class ALISOSO_ACTIVITY_II{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int fnum = input.nextInt();

        System.out.println("Enter second number: ");
        int snum = input.nextInt();

        int sum = fnum +  snum;
        int diff = fnum - snum;
        int quo = fnum / snum;
        int pro = fnum * snum;

        System.out.println("The sum is " +sum);
        System.out.println("The quotient is " +quo);
        System.out.println("The difference is " +diff) ;
        System.out.println("The product is " +pro);
    }
}
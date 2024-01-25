import java.util.Scanner;

public class BANDOLON_ACTIVITY_I {

   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your First Number: ");
    int fnum = scanner.nextInt();

    System.out.print("Enter your Second Number: ");
    int snum = scanner.nextInt();

    int sum = fnum + snum;
    System.out.println("Sum is " + sum);

    int sub = fnum - snum;
    System.out.println("Substraction is " + sub);

    int prod = fnum * snum;
    System.out.println("Product is " + prod);
   }
}   

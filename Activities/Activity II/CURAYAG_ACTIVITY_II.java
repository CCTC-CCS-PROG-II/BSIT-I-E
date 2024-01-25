import java.util.Scanner;
public class CURAYAG_ACTIVITY_II {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int fnum = sc.nextInt();

    System.out.print("Enter second number: ");
    int snum = sc.nextInt();

    int sum = fnum + snum;
    int diff = fnum - snum;
    int prod = fnum * snum;

    System.out.println("Sum = "+ sum);
    System.out.println("Difference = "+ diff);
    System.out.println("Product = "+ prod);

  }
}
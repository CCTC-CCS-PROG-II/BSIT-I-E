import java.util.Scanner;
public class CANILLO{
  public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print(" Enter the first number: ");
int fnum = sc.nextInt();
System.out.print("Enter the Second number: ");
int snum = sc.nextInt();
int sum = fnum + snum;
System.out.println(" The sum is "+ sum);
 sum = fnum - snum;
System.out.println(" The difference is "+ sum);
sum = fnum * snum;
System.out.println("The product is "+ sum);
sum = fnum / snum;
System.out.println(" The qoutient is "+ sum);

  }
}

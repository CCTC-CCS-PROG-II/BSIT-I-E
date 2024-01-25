import java.util.Scanner;
public class CANILLO_ACTIVITY_II{
  public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int num1;
int num2;
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

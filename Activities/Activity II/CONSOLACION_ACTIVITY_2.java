import java.util.Scanner;

public class CONSOLACION_ACTIVITY_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int fnum = input.nextInt();
        System.out.print("Enter second number: ");
        int snum = input.nextInt();
        int sum = fnum + snum;
        System.out.println("The sum is " + sum);
    }
}
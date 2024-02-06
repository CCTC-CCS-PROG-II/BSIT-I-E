import java.util.Scanner;

public class COSTANILLA_Activity_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number");
        int fnum = input.nextInt();
        System.out.print("Enter second number");
        int snum = input.nextInt();
        int sum = fnum + snum;
        System.out.println("The sum is " + sum);
    }
}
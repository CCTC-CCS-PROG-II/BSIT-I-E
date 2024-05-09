import java.util.Scanner;

public class ABATAYO_ACTIVITY_II {
    static void feetToInches(double feet){
        double result = feet * 12;
        System.out.printIn("Result: " + result);
    }
    public static void main(Sring[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printIn("Enter a feet: ");
        double feet = sc.nextDouble();
        feetToInches(feet);
    }

}

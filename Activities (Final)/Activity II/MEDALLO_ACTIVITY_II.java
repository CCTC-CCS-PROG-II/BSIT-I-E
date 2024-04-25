import java.util.Scanner;

public class MEDALLO_ACTIVITY_II {
    static void FeetToInches(double feet) {
        double res = feet * 12;
        System.out.print(res);  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a feet: ");
        double feet = sc.nextDouble();
        FeetToInches(feet);
    }
}
import java.util.Scanner;

public class PLARISAN_ACTIVITY_II {
    static void feetToInches(double feet) {
        double J = feet * 12;
        System.out.println(J);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a feet:");
        double feet = sc.nextDouble();
        feetToInches(feet);
    }
}

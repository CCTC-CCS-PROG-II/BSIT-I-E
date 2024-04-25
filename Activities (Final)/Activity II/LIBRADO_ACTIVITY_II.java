import java.util.Scanner;

public class LIBRADO_ACTIVITY_II {
    
    static void feetToInches(double feet) {
        double result = feet * 12;
        System.out.println("Result: " + result);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a feet: ");
        double feet = sc.nextDouble();
        feetToInches(feet);
    }
}

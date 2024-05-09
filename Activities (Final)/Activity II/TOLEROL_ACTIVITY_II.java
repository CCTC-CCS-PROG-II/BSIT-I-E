import java.util.Scanner;

public class TOLEROL_ACTIVITY_II {
    static void FeetToInches(double feet){
        double x = feet * 12;
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a value of a feet:");
        double feet = sc.nextDouble();
        FeetToInches(feet);
    }
}
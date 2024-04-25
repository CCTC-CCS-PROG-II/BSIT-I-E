import java.util.Scanner;
public class ALISOSO_ACTIVITY_{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of feet:");
        double feet = sc.nextDouble();
        double inches = convertFeetToInches(feet);
        System.out.print("Inches: " + inches);
        sc.close();

    }
    public static double convertFeetToInches(double feet) {
        return feet * 12;
    }
}
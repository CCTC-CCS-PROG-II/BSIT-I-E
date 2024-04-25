import java.util.Scanner;

public class CURAYAG_ACTIVITY_II {
  static void FeetInches(double feet) {
    double res = feet * 12;
    System.out.println(res);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a feet: ");
    double feet = sc.nextDouble();
    FeetInches(feet);
  }
}
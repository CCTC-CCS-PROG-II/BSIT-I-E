import java.util.Scanner;

public class MEDALLO_ACTIVITY_I {
  static int length() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of Rectangle: ");
    return sc.nextInt();
  }

  static int width() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of width: ");
    return sc.nextInt();
  }

  public static void main(String[] args) {
    int result = length() * width();
    System.out.println("Area of the rectangle: " + length() * width());
  }
}
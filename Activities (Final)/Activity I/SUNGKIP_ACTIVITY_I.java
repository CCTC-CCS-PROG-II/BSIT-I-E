import java.util.Scanner;
public class SUNGKIP_ACTIVITY_I {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("enter the height of the rectangle: ");
       double height = scanner.nextDouble();

      System.out.println("enter the width of the rectangle:");
      double width = scanner.nextDouble();

      double area = calculatearea(length, width);

      System.out.println("Area: "+ area);

      scanner.close();

      public static double caculatearea(double length, double width) {
           return length * width;
       }
     }
   }
 
    

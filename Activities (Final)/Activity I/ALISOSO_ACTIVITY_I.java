import java.util.Scanner;
public class ALISOSO_ACTIVITY_I{
    public static void main(String [] args){

    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the rectangle:");
    double length = sc.nextDouble();
    
    System.out.println("Enter the width of the rectangle:");
    double width = sc.nextDouble();

    double area = calculateArea(length, width);
    System.out.println("Area: " + area);
    
    scanner.close();
}

    public static double calculateArea(double length, double width);
        return length * width;

}
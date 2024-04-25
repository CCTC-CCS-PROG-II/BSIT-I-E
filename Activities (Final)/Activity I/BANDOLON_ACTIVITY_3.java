import java.util.Scanner;
    public class BANDOLON_ACTIVITY_3 {
      
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Rectangle Area Calculator!");
        System.out.println("Method 1: Provide Length and Width separately.");
        System.out.println("Method 2: Provide Length and Width as an array.");

        
        System.out.println("Method 1:");
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of the rectangle using Method 1: " + calculateArea(length, width));

        scanner.close();
    }
    
    
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    
    public static double calculateArea(double[] dimensions) {
        if (dimensions.length != 2) {
            throw new IllegalArgumentException("Array must contain exactly two elements: length and width.");
        }
        return dimensions[0] * dimensions[1];
    }
    
    
    public static double[] getDimensions(Scanner scanner) {
        double[] dimensions = new double[2];
        System.out.print("Enter the length of the rectangle: ");
        dimensions[0] = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        dimensions[1] = scanner.nextDouble();
        return dimensions;
    }
}

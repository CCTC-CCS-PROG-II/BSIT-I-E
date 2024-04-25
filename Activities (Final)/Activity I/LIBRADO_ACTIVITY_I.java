import java.util.Scanner;
public class LIBRADO_ACTIVITY_I {
    static int length() {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        return sc.nextInt();
    }
    
    static int width() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle:");
        return sc.nextInt();
    }
    public static void main(String[] agrs) {
        int result = length() * width();
        System.out.println("Area of the rectangle: " + result); 
    }
}

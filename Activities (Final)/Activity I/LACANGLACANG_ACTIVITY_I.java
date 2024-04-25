import java.util.Scanner;
public class LACANGLACANG_ACTIVITY_I {
    Scanner sc = new Scanner(System.in);
    static int length(){
        System.out.println("Enter the value of leght");
         return sc.nextInt();     
    }
    static int width(){
        System.out.println("Enter the value of width");
        return sc.nextInt();
    }
    public static void main(String []args){
        int result = length(); * width();
        System.out.println("The area of rectangle is :" + result);
    }
}
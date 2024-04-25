import java.util.Scanner;
public class TOLERO_ACTIVITY_1 {
static int length(){
    Scanner lloyd = new Scanner (System.in);
    System.out.println("Enter the value of length: ");
    int length = lloyd.nextInt();
    return length;
    }
static int width(){
    System.out.println("Enter the value of width");
        return lloyd.nextInt();
    }
    public static void main (String []args){
        int result = length() * width()
        length();
        width();
        System.out.println("The area of the rectangle is: " length * width);
    }
       
}
  
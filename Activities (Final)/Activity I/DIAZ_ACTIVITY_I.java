  import java.util.Scanner;
  public class DIAZ_ACTIVITY_I{
    static int lenght(){
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the length of the rectangle:");
      return sc.nextInt();
}
  static int width(){
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the width of the rectangle:");
      return sc.nextInt();
}
  public static void main(String[]args){
    int result=lenght()*width();
      System.out.println("Area of the rectangle;" +lenght()*width());                                                        
   }
}

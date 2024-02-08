import java.util.Scanner;
public class LACANGLACANG_ACTIVITY_VI{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter countdown number: ");
      int counter = sc.nextInt();
    

      while(counter>=0){
        counter--;
        System.out.println(counter);
      }


    }
}
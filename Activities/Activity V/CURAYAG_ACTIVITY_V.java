import java.util.Scanner;
public class CURAYAG_ACTIVITY_V {
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    int age;
    System.out.print("Enter your age: ");
    age = sc.nextInt();

    if (age <= 64 && age >= 18){
      System.out.println("Adult");
    }else if (age <= 17 && age >= 12){
      System.out.println("Teen");
    }else{
      System.out.println("Child");
    }

  }
  
}

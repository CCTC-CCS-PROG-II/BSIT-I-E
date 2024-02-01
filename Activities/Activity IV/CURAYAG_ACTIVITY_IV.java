import java.util.Scanner;
public class CURAYAG_ACTIVITY_IV{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter color: ");
    String robot = sc.nextLine();
    switch(robot){
      case "Red":
      System.out.println("Number 1");
      break;

      case "Green":
      System.out.println("Number 2");
      break;

      case "Black":
      System.out.println("Number 3");
      break;
      default:
      System.out.println("No color");
      break;
    }

  }
}
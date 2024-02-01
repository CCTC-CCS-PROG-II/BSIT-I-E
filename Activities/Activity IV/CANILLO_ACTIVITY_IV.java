import java.util.Scanner;
public class CANILLO_ACTIVITY_IV{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
    System.out.print("ENTER COLOR");
    String robot = sc.nextline();
    
    switch(robot){
      case "RED":
      System.out.print("NUMBER 1");
      break;
      case "GREEN":
      System.out.print("NUMBER 2");
      break;
      case "BLACK":
      System.out.print("NUMBER 3");
      break;
      default:
      System.out.print("none");
    }
    }
}
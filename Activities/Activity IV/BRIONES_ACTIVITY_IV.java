import java.util.Scanner;

public class BRIONES_ACTIVITY_IV{
    public static void main(String []args){
         Scanner scanner = new Scanner(System.in);
    System.out.print("ENTER COLOR :");
    String robot = scanner.nextLine();

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
        System.out.print("WALA");
    }
    }

}       
      
         
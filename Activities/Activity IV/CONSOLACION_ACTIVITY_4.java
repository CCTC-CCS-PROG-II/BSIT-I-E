import java.util.Scanner;
public class CONSOLACION_ACTIVITY_4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
    System.out.print("ENTER COLOR:");
    String robot = sc.nextLine();
    
    switch(robot){
        case "RED":
        System.out.println("NUMBER 1");
        break;
        case "GREEN":
        System.out.println("NUMBER 2");
        break;
        case "BLAck":
        System.out.println("NUMBER 3");
        break;
        default:
        System.out.print("wala");
    }
    }
}
  
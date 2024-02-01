import java.util.Scanner;
public class  SUNGKIP_ACTIVITY_4 {
    public static void main(String[] args) {
    Scanner sc = new =Scanner(System.in);
    System.out.print("enter a color: ");
    String robot = sc.nextInt();
    Switch(robot) {
        case red:
        System.out.print(" box #1");
        break;
        case green:
        System.out.print("box #2");
        break;
        case black:
        System.out.print("BOX #3");
        break;
        default:
        System.out.print("error");  
    }      
   }
}
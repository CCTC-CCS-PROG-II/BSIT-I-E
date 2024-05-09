import java.util.Scanner;
public class REYES_ACTIVITY_IV {
   
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter a Color:");
        String robot = sc.nextLine();
            
            switch(robot){
                case "red":
                System.out.print("box #1");
                break;
                case "green":
                System.out.print("box #2");
                break;
                case "black":
                System.out.print("box #3");
                break;
                default:
                System.out.print("Error");

        }
    }
}

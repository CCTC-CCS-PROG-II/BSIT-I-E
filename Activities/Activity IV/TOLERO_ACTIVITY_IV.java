import java.util.Scanner;
public class TOLERO_ACTIVITY_IV {
   
    public static void main (String []args){

        Scanner lloyd = new Scanner(System.in);
        System.out.print( "Enter a Color:");
        String robot = lloyd.nextLine();
            
            switch(robot){
                case "red":
                System.out.print("Box #1");
                break;
                case "green":
                System.out.print("Box #2");
                break;
                case "black":
                System.out.print("Box #3");
                break;
                default:
                System.out.print("Error");

        }
    }
}
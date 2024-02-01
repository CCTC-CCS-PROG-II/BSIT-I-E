import java.util.Scanner;
public class COSTANILLA_ACTIVITY4{
    public static void main(String []args) {
             Scanner sc = new Scanner(System.in);
        System.out.println( "select color"); 
        String robot = sc.nextLine();

            switch(robot){
            case "RED":
            System.out.println("NUMBER 1");
            break;
            case "GREEN":
            System.out.println("NUMBER 2 "); 
            break;
            case "BLACK":
            System.out.println("NUMBER 3");
            break;

            default:
            System.out.println("error");
            }
        }
    }    

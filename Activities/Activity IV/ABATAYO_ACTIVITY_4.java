import java.util.Scanner;
public class ABATAYO_ACTIVITY_4.java {
    public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter Color:");
    String robot = sc.nextLine();
    
       switch(robot) {
         case "Red":
         System.out.print("Number 1:");
         break;
         case "Green":
         System.out.print("Number 2:");
         break;
         case "Black":
         System.out.print("Number 3:");
         break;
         default:
         System.out.print("None:");

       }
    }

}
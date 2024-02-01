import java.util.Scanner;
public class ALSADO_ACTIVITY_4 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Color: ");
        String robot = sc.nextLine();
        switch(robot) {
          case "RED":
              System.out.println("Number 1");
              break;
          case "GREEN":
              System.out.println("Number 2");
              break;
          case "BLACK":
              System.out.println("Number 3");
              break;
          default:
              System.out.println("Invalid color. Please enter red, green, or black.");
        }
    }
    
}

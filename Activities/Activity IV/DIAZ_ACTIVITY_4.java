 import java.util.Scanner;
    public class DIAZ_ACTIVITY_4 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println ("Enter a color");
            String color = scanner.nextLine();

          switch (color) {
          case "red":
            System.out.println("Goes to box 1");
            break;

          case "green":
            System.out.println("Goes to box 2");
            break;

          case "black":
            System.out.println("Goes to box 3");
            break;
        
            default:
            System.out.println("Invalid color");
        
          }   
         }
        }
    
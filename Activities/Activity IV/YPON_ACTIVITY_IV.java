import java.util.Scanner;
public class YPON_ACTIVITY_IV{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("The robot will catigorize a color");
        System.out.println("Red goes to #1");
        System.out.println("Yellow goes to #2");
        System.out.println("Blue goes to #3");
        System.out.println();
        System.out.println("Enter a color");
        String color = sc.nextLine();

        switch(color){
            case "Red":
            System.out.println("1");
            break;
            case "Yellow":
            System.out.println("2");
            break;
            case "Blue":
            System.out.println("3");
            break;
            default:
            System.out.println("Error!");

        }
    }
}
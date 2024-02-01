import java.util.Scanner;
public class PRAHINOG_ACTIVITY4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    System.out.print(" select color");
    String robot = sc.nextLine();

switch (robot) {
    case "RED":
        System.out.println("The box is 1");
        break;
    case "GREEN":
        System.out.println("The box is 2");
        break;
    case "BLACK":
        System.out.println("The box is 3");
        break;
    

    default:
        System.out.println("invalid");
        break;
}

    }
}

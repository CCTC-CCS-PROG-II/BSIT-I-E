import java.util.Scanner;
public class CANTEBEROS_ATIVITY_IV {

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int color;
        System.out.println("Pick a number (1.Red 2.Green 3.Black): ");
        int num = input.nextInt();

        switch(color) {
            case 1:
             System.out.println("Red");
             break;
            case 2:
             System.out.println("Green");
             break;
            case 3:
             System.out.println("Black");
        }
    }
}
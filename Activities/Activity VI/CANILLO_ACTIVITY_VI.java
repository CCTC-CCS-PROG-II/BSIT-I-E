import java.util.Scanner;
public class CANILLO_ACTIVITY_VI{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the time(in seconds):");
        int time = sc.nextInt();

        while(time >=0 ){
            System.out.println(time);
        }
    }
}
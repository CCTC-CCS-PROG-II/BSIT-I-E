import java.util.Scanner;

public class YPON_ACTIVITY_VI {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the time (in seconds): ");
         int time = sc.nextInt();



        while(time >= 0){
            time --;

            System.out.println(time);
        }
        

    }
    
}

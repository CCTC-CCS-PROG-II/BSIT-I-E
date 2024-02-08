import java.util.Scanner;

public class GAMBOA_ACTIVITY_6 {
    public static void main(String[] args) {
        int seconds = 5; // Countdown from 5 seconds
        
        System.out.println("Counting down...");
        
        for (int i = seconds; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Sleep for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Time's up!");
    }
}

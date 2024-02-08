import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class BANDOLON_ACTIVITY_VI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial countdown value: ");
        int countdownSeconds = scanner.nextInt();

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (countdownSeconds == 0) {
                    timer.cancel(); // Stop the timer
                    System.out.println("Time's up!");
                } else {
                    System.out.println(countdownSeconds);
                    countdownSeconds --;
                }
            }
        }, 0, 1000); // Schedule the task to run every second (1000 milliseconds)
    }
}

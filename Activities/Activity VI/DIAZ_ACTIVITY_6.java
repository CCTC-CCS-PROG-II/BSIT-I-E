import java.util.Scanner;

public class DIAZ_ACTIVITY_6 {
    public static void main(String[] args) {
        final int initialCountdown = 5;
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable countdownTask = new Runnable() {
            int currentCountdown = initialCountdown;

            @Override
            public void run() {
                if (currentCountdown >= 0) {
                    System.out.println(currentCountdown);
                } else {
                    System.out.println("Time's up!");
                    scheduler.shutdown();
                }
                currentCountdown--;
            }
        };

        scheduler.scheduleAtFixedRate(countdownTask, 0, 1, TimeUnit.SECONDS);
    }
}

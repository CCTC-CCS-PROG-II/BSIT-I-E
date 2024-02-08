import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class BANDOLON_ACTIVITY_VI {

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

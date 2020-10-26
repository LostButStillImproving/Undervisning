package NinePointSix;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class StopWatch {

    private Instant startTime;
    private Instant endTime;

    public Instant getStartTime() {

        return startTime;
    }

    public Instant getEndTime() {

        return endTime;
    }
    StopWatch(){
        startTime = Instant.now();
    }

    void start() {
        startTime = Instant.now();
    }

    void stop() {
        endTime = Instant.now();
    }

    Duration getElapsedTime() {
        return Duration.between(startTime, endTime);
    }

    public static void main(String[] args) throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start();
        TimeUnit.SECONDS.sleep(3);
        watch.stop();
        System.out.println(watch.getElapsedTime().getSeconds());
        System.out.println(watch.endTime);
    }
}


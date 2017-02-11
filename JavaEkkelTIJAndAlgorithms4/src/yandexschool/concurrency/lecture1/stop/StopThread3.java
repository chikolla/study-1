package yandexschool.concurrency.lecture1.stop;

import java.util.concurrent.TimeUnit;

/**
 * Created by nugusbayevkk on 2/11/17.
 */
public class StopThread3 {
    private static volatile boolean stopRequested;
    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(!stopRequested)
                    i++;
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}

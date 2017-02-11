package yandexschool.concurrency.lecture1.philosophers;

/**
 * Created by nugusbayevkk on 2/11/17.
 */
public class MyPhilosopher extends Philosopher implements Runnable {
    volatile boolean stopFlag = false;
    public MyPhilosopher(int position, Fork left, Fork right){
        super(position, left, right);
    }
    public void run(){
        while(!stopFlag){
            think();
            synchronized (left){
                System.out.println("[Philosopher " + position+"] took left Fork");
                synchronized (right){
                    System.out.println("[Philosopher " + position+"] took right Fork");
                    eat();
                }
            }
        }
        System.out.println("[Philosopher"+position+"] stopped.");

    }
    public static void main(String[] args) throws Exception{
        int count= 5;
        MyPhilosopher[] phils = new MyPhilosopher[count];
        Fork last = new Fork();
        Fork left = last;
        for (int i=0; i<count; i++){
            Fork right = (i==count - 1)?last:new Fork();
            phils[i] = new MyPhilosopher(i,left,right);
            left = right;
        }
        Thread[] threads = new Thread[count];
        for (int i=0;i<count;i++){
            threads[i] = new Thread(phils[i]);
            threads[i].start();
        }
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (MyPhilosopher phil:phils){
            phil.stopFlag = true;
        }
        for (Thread thread:threads){
            thread.join();
        }
        for (MyPhilosopher phil:phils){
            System.out.println("[Philosopher " + phil.position+" ] ate"+
            phil.eatCount+" times and waited "+phil.waitTime + " ms.");
        }
    }
}

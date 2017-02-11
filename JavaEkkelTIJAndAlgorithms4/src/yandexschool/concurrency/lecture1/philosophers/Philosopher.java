package yandexschool.concurrency.lecture1.philosophers;

import java.util.Random;

/**
 * Created by nugusbayevkk on 2/11/17.
 */
class Fork{

}
public class Philosopher {
    int position;
    Fork left;
    Fork right;
    int eatCount = 0;
    long waitTime = 0;
    long startWait;
    Random rnd = new Random();
    public Philosopher(int position, Fork left, Fork right){
        this.position = position;
        this.left = left;
        this.right = right;
    }
    public void eat(){
        waitTime += System.currentTimeMillis() - startWait;
        System.out.println("[Philosopher " + position+"] is eating");
        try{
            Thread.sleep(rnd.nextInt(100));
        }catch(InterruptedException e){e.printStackTrace();}
        eatCount++;
        System.out.println("[Philosopher "+position +"] is finished eating.");
    }
    public void think(){
        System.out.println("[Philospher "+position+"] is thinking.");
        try {
            Thread.sleep(rnd.nextInt(100));
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("[Philosopher "+position +"] is hungry.");
        startWait = System.currentTimeMillis();
    }
}

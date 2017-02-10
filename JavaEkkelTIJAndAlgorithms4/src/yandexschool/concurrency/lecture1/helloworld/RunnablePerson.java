package yandexschool.concurrency.lecture1.helloworld;

import algs4.basic.StdOut;

/**
 * Created by nugusbayevkk on 2/10/17.
 */
public class RunnablePerson extends Person implements Runnable {
    public RunnablePerson(String name){
        super(name);
    }
    public void run(){
        for (int i=0; i<10; i++){
            StdOut.println(getName() + ": helo World");
        }
    }
    public static void main(String[] args){
        RunnablePerson p1 = new RunnablePerson("Kane");
        Thread t1 = new Thread(p1);
        t1.start();
        RunnablePerson p2 = new RunnablePerson("Lynch");
        Thread t2 = new Thread(p2);
        t2.start();
    }
}

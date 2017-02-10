package yandexschool.concurrency.lecture1.helloworld;

/**
 * Created by nugusbayevkk on 2/10/17.
 */
public class MyThread extends Thread{
    public void run(){
        System.out.println("Hello world");
    }
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.run();

    }
}

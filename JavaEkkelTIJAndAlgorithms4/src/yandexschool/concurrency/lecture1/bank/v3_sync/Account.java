package yandexschool.concurrency.lecture1.bank.v3_sync;

/**
 * Created by nugusbayevkk on 2/11/17.
 */
public class Account {
    private String id;
    private int balance;
    public Account(String id, int balance){
        this.id = id; this.balance = balance;
    }
    public String getId(){
        return this.id;
    }
    synchronized public int getBalance(){
        return this.balance;
    }
    synchronized public void post(int value){
        balance += value;
    }
}

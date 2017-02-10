package yandexschool.concurrency.lecture1.bank.v1_seq;

/**
 * Created by nugusbayevkk on 2/10/17.
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
    public int getBalance(){
        return this.balance;
    }
    public void post(int value){
        balance += value;
    }
}

package yandexschool.concurrency.lecture1.bank.v4_deadlock;

import yandexschool.concurrency.lecture1.bank.v3_sync.Account;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nugusbayevkk on 2/11/17.
 */
public class Bank {
    private Map<String, Account> accounts;
    public Bank(){
        accounts = new HashMap<String, Account>();
    }
    public void addAccount(Account account){
        accounts.put(account.getId(), account);
    }
    public Account getAccount(String id){
        return accounts.get(id);
    }
    public void transfer(Account from, Account to, int value) throws Exception{
        if (value <=0) {throw new Exception("Amout must be positive!");}
        synchronized (from) {
            if (from.getBalance() < value) {
                throw new Exception("Not enough money");
            } else {
                from.post(-value);
            }
            synchronized (to) {to.post(value);}

        }
    }
}

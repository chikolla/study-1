package yandexschool.concurrency.lecture1.bank.v1_seq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nugusbayevkk on 2/10/17.
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
}

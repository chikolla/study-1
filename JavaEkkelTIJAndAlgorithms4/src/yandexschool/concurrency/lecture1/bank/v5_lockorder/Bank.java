package yandexschool.concurrency.lecture1.bank.v5_lockorder;

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
        int fromHash = System.identityHashCode(from);
        int toHash = System.identityHashCode(to);
        if (fromHash < toHash){
            synchronized (from){
                synchronized (to){
                    doTrasnfer(from,to,value);
                }
            }
        }else if (fromHash > toHash){
            synchronized (to){
                synchronized (from){
                    doTrasnfer(from, to,value);
                }
            }
        }else { //hashCollision
//            synchronized (tieLock){
                synchronized (from){
                    synchronized (to){
                        doTrasnfer(from, to, value);
                    }
                }
            }
//        }
    }
    private void doTrasnfer(Account from, Account to, int value){
        from.post(-value);
        to.post(value);
    }
}

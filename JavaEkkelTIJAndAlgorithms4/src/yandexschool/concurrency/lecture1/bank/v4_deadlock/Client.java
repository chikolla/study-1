package yandexschool.concurrency.lecture1.bank.v4_deadlock;

import yandexschool.concurrency.lecture1.bank.v3_sync.Account;

import java.io.*;

/**
 * Created by nugusbayevkk on 2/11/17.
 */
public class Client extends Thread {
    static final int numClients = 2;
    private int id;
    private Bank bank;
    private BufferedReader in;
    private PrintStream out;

    public Client(int id, Bank bank, BufferedReader in, PrintStream out){
        this.id=id;
        this.bank = bank;
        this.in=in;
        this.out=out;
    }
    public void run() {
        int i=0;
        while (i<1) {
            try {
                out.println("["+id+"]" + "From Account ID:");
                String accountId = in.readLine();
                Account account = bank.getAccount(accountId);
                if (account == null){
                    throw new Exception("Account not found.");
                }
                out.println(accountId);
                out.println("["+id+"]" + " To Account ID:");
                String toAccountId = in.readLine();
                Account toAccount = bank.getAccount(toAccountId);
                if (account == null){
                    throw new Exception("Account not found.");
                }
                out.println(toAccountId);
                out.println("Enter transfer amount: ");
                int value = Integer.parseInt(in.readLine());
                bank.transfer(account, toAccount, value);
                out.println(value);
                out.println("["+id+"]Balance:"+account.getBalance());
            } catch (Exception e) {
                out.println("Error! " + e.getMessage());
            }
            i++;
        }
    }
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.addAccount(new Account("Acc001",100));
        bank.addAccount(new Account("Acc002",100));
        Client[] clients = new Client[numClients];
        for (int i=0; i< numClients; i++){
            File inFile = new File("/data/test/v4_deadlock/input" + (i+1));
            try {BufferedReader in = new BufferedReader(
                    new InputStreamReader(new FileInputStream(inFile)));
                clients[i] = new Client(i+1, bank, in, System.out);
                clients[i].start();
            }catch (Exception e){
            }
        }

    }

}
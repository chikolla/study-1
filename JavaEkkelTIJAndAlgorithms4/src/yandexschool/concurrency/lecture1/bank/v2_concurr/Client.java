package yandexschool.concurrency.lecture1.bank.v2_concurr;

import yandexschool.concurrency.lecture1.bank.v1_seq.Account;
import yandexschool.concurrency.lecture1.bank.v1_seq.Bank;

import java.io.*;

/**
 * Created by nugusbayevkk on 2/10/17.
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
        while (i<3) {
            try {
                out.print("Account id:");
                String accountId = in.readLine();
                Account account = bank.getAccount(accountId);
                if (account == null) {
                    throw new Exception("Account not found");
                } else {
                    out.println("Balance: " + account.getBalance());
                }
                out.print("Enter amount: ");
                int value = Integer.parseInt(in.readLine());
                if (account.getBalance() + value >= 0) {
                    account.post(value);
                    out.println("Balance:" + account.getBalance());
                } else {
                    throw new Exception("Not enough money!");
                }
            } catch (Exception e) {
                out.println("Error! " + e.getMessage());
            }
            i++;
        }
    }
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.addAccount(new Account("Acc001",100));
        Client[] clients = new Client[numClients];
        for (int i=0; i< numClients; i++){
            File inFile = new File("/data/test/input" + (i+1));
            try {BufferedReader in = new BufferedReader(
                    new InputStreamReader(new FileInputStream(inFile)));
            clients[i] = new Client(i+1, bank, in, System.out);
            clients[i].start();
            }catch (Exception e){
            }
        }

    }

}

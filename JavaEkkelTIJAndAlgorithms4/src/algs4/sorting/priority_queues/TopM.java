package algs4.sorting.priority_queues;

import algs4.basic.StdIn;
import algs4.basic.StdOut;
import algs4.basic.dataabstraction.Transaction;
import algs4.basic.datastructures.Stack;

/**
 * Created by nugusbayevkk on 2/3/17.
 */
public class TopM {
    public static void main(String[] args){
        int M = Integer.parseInt(args[0]);
        MinPQ<Transaction> pq = new MinPQ<Transaction>(M+1);
        while(StdIn.hasNextLine())
        {
            pq.insert(new Transaction(StdIn.readLine()));
            if (pq.size() > M)
                pq.delMin();
        }
        Stack<Transaction> stack = new Stack<Transaction>();
        while(!pq.isEmpty()) stack.push(pq.delMin());
        for (Transaction t : stack) StdOut.println(t);
    }
}

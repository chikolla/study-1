package algs4.sorting.exercise._2_4;

/**
 * Created by nugusbayevkk on 2/4/17.
 */
public class UnorderedArrayMaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int n;

    public UnorderedArrayMaxPQ(int capacity){
        pq = (Key[]) new Comparable[capacity];
        n=0;
    }
    public boolean isEmpty() {return n ==0;}
    public int size(){ return n;}
    public void insert(Key x){pq[n++]=x;}
    public Key delMax(){
        int max=0;
        for (int i = 1; i < n; i++)
            if (less(max,i)) max = i;
        exch(max, n-1);
        return pq[--n];
    }
    private boolean less(int i, int j){
        return pq[i].compareTo(pq[j]) < 0;
    }
    private void exch(int i, int j){
        Key temp = pq[i];
        pq[i]=pq[j];
        pq[j] = temp;
    }
}

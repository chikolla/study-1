package algs4.sorting.exercise._2_4;

import algs4.basic.StdOut;

/**
 * Created by nugusbayevkk on 2/4/17.
 */
public class OrderedArrayMaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int n;

    public OrderedArrayMaxPQ(int capacity){
        pq = (Key[]) new Comparable[capacity];
        n = 0;
    }
    public boolean isEmpty() { return n == 0;}
    public int size() { return n;}
    public Key delMax() {return pq[--n];}

    public void insert(Key key){
        int i = n -1;
        while (i >=0 && less(key, pq[i])){
            pq[i+1] = pq[i];
            i--;
        }
    pq[i+1] = key;
    n++;
    }
    private boolean less(Key v, Key w){
        return v.compareTo(w) < 0;
    }
    public void show(){
        for (int i =0; i<pq.length; i++){
            StdOut.print(pq[i] + " ");
        }
        StdOut.println();
    }

    public static void main(String[] args){
        OrderedArrayMaxPQ<String> temp = new OrderedArrayMaxPQ<String>(5);
        temp.insert("A");
        temp.show();
        temp.insert("Z");
        temp.show();
        temp.insert("B");
        temp.show();
        temp.insert("C");
        temp.show();
        temp.insert("B");
        temp.show();
    }
}

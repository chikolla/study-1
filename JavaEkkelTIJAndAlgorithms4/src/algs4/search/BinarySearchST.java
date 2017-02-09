package algs4.search;

import algs4.basic.StdOut;
import algs4.basic.datastructures.Queue;

/**
 * Created by nugusbayevkk on 2/9/17.
 */
public class BinarySearchST<Key extends Comparable<Key>,Value> {
    private Key[] keys;
    private Value[] vals;
    private int N;
    public BinarySearchST(int capacity)
    {
       keys = (Key[]) new Comparable[capacity];
       vals = (Value[]) new Comparable[capacity];
    }
    public int size(){
        return N;
    }
    public Value get(Key key){
        if (isEmpty()) return null;
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0) return vals[i];
        else return null;
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int rank(Key key){
        int lo=0, hi = N-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            int cmp = key.compareTo(keys[mid]);
            if (cmp<0) hi=mid-1;
            else if (cmp>0) lo = mid +1;
            else return mid;
        }
        return lo;
    }
    public void put(Key key, Value val)
    {//Search for key. Update value if found; grow table if new
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0)
        { vals[i]=val;return; }
        for (int j=N; j>i; j--)
        { keys[j] =keys[j-1]; vals[j]=vals[j-1];}
        keys[i]=key;vals[i]=val;
        N++;
    }
    public void delete(Key key){
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0)
        {for (int j=i+1; j<N; j++) {
            StdOut.println("j" + j + keys[j] + vals[j]);
            keys[j - 1] = keys[j];
            vals[j - 1] = vals[j];
        }
        }
        StdOut.println(N);
//        keys[N-1]=null; vals[N-1]=null;
        N--;
    }
    public Key min(){
        return keys[0];
    }
    public Key max(){
        return keys[N-1];
    }
    public Key select(int k){
        return keys[k];
    }
    public Key ceiling(Key key){
        int i = rank(key);
        return keys[i];
    }
    public Key floor(){

    }
    public Iterable<Key> keys(Key lo, Key hi){
        Queue<Key> q=new Queue<Key>();
        for (int i=rank(lo); i< rank(hi);i++)
            q.enqueue(keys[i]);
        if(contains(hi))
            q.enqueue(keys[rank(hi)]);
        return q;
    }
    public static void main(String [] args){
        BinarySearchST<Integer,String> test = new BinarySearchST<>(5);
        test.put(0, "First");
        test.put(1, "TWO");
        test.put(2, "Free");
        test.put(3, "Four");
        test.put(4, "Five");

        for (int i=0; i< test.size(); i++){
            StdOut.println(test.get(i));
        }
        StdOut.println();
        test.delete(3);
        for (int i=0; i< test.size(); i++){
            StdOut.println(test.get(i));
        }
    }
}

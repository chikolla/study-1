package algs4.search;

import algs4.basic.StdOut;
import algs4.basic.datastructures.Queue;

/**
 * class represents an ordered symbol table of generic
 *  key-value pairs.
 *
 *  The <em>put</em> and <em>remove</em> operations each take linear time in
 *  the worst case; the <em>contains</em>, <em>ceiling</em>, <em>floor</em>,
 *  and <em>rank</em> operations take logarithmic time; the <em>size</em>,
 *  <em>is-empty</em>, <em>minimum</em>, <em>maximum</em>, and <em>select</em>
 *  operations take constant time. Construction takes constant time.
 *  <p>
 *
 * Created by nugusbayevkk on 2/9/17.
 */
public class BinarySearchST<Key extends Comparable<Key>,Value> {
    private static final int INIT_CAPACITY = 2;
    private Key[] keys;
    private Value[] vals;
    private int N;
    public BinarySearchST() {
        this(INIT_CAPACITY);
    }
    public BinarySearchST(int capacity)
    {
       keys = (Key[]) new Comparable[capacity];
       vals = (Value[]) new Comparable[capacity];
    }
    // resize the underlying arrays
    private void resize(int capacity) {
        assert capacity >= N;
        Key[]   tempk = (Key[])   new Comparable[capacity];
        Value[] tempv = (Value[]) new Object[capacity];
        for (int i = 0; i < N; i++) {
            tempk[i] = keys[i];
            tempv[i] = vals[i];
        }
        vals = tempv;
        keys = tempk;
    }

    public int size(){
        return N;
    }

    public Value get(Key key){
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        if (isEmpty()) return null;
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0) return vals[i];
        else return null;
    }
    public boolean isEmpty(){
        return N == 0;
    }

    public boolean contains(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }

    /**
     * Returns the number of keys in this symbol table strictly less than {@code key}.
     *
     * @param  key the key
     * @return the number of keys in the symbol table strictly less than {@code key}
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public int rank(Key key){
        int lo=0, hi = N-1;
        StdOut.println(lo+" hi: " + hi);
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
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");

        if (val == null) {
            delete(key);
            return;
        }
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0)
        { vals[i]=val;return; }
        // insert new key-value pair
        if (N == keys.length) resize(2*keys.length);

        for (int j=N; j>i; j--)
        { keys[j] =keys[j-1]; vals[j]=vals[j-1];}
        keys[i]=key;vals[i]=val;
        N++;
    }
    public void delete(Key key){
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");
        if (isEmpty()) return;

        int i = rank(key);
        // key not in table
        if (i == N || keys[i].compareTo(key) != 0) {
            return;
        }

        for (int j = i; j < N-1; j++)  {
            keys[j] = keys[j+1];
            vals[j] = vals[j+1];
        }

        N--;
        keys[N] = null;  // to avoid loitering
        vals[N] = null;

        // resize if 1/4 full
        if (N > 0 && N == keys.length/4) resize(keys.length/2);

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
    /**
     * Returns the smallest key in this symbol table greater than or equal to {@code key}.
     *
     * @param  key the key
     * @return the smallest key in this symbol table greater than or equal to {@code key}
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Key ceiling(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to ceiling() is null");
        int i = rank(key);
        if (i == N) return null;
        else return keys[i];
    }
    /**
     * Returns the largest key in this symbol table less than or equal to {@code key}.
     *
     * @param  key the key
     * @return the largest key in this symbol table less than or equal to {@code key}
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Key floor(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to floor() is null");
        int i = rank(key);
        if (i < N && key.compareTo(keys[i]) == 0) return keys[i];
        if (i == 0) return null;
        else return keys[i-1];
    }
    public Iterable<Key> keys(Key lo, Key hi){
        Queue<Key> q=new Queue<Key>();
        for (int i=rank(lo); i< rank(hi);i++)
            q.enqueue(keys[i]);
//        if(contains(hi))
            q.enqueue(keys[rank(hi)]);
        return q;
    }
    public static void main(String [] args){
        BinarySearchST<Integer,String> test = new BinarySearchST<>(5);
        test.put(3, "Four");
        test.put(4, "Five");
        test.put(0, "First");
        test.put(1, "TWO");
        test.put(2, "Free");


        StdOut.println(test.rank(4));

//        for (int i=0; i< test.size(); i++){
//            StdOut.println(test.get(i));
//        }
//        StdOut.println();
//        test.delete(3);
//        for (int i=0; i< test.size(); i++){
//            StdOut.println(test.get(i));
//        }
    }
}

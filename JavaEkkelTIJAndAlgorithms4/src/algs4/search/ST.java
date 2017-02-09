package algs4.search;

import algs4.basic.StdIn;
import algs4.basic.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.function.Consumer;

/**
 * The {@code ST} class represents an ordered symbol table of generic key-value pairs
 *
 * This implementation uses a balanced binary search tree. It requires that the key
 * type implements the {@code Comparable} interface and calls the {@code compareTo()}
 * and method to compare two keys. It does not call either {@code equals()} or
 * {@code hashCode()}
 * The put, contains, remove, minimum, maximum, ceiling, and floor operations
 * each take logarithmic time in the worst case
 * The size, isEmpty operations take constant time
 * Construction takes contanst time
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 *
 * Created by nugusbayevkk on 2/9/17.
 */
public class ST<Key extends Comparable<Key>,Value> implements Iterable<Key>{
    private TreeMap<Key, Value> st;

    /**
     * Initializes an empty symbol table
     */
    public ST(){
        st = new TreeMap<Key,Value>();
    }
    /*
     * Returns the value associated with the given key in this symbol table.
     */
    public Value get(Key key){
        if (key == null) throw new IllegalArgumentException("called get() with null key");
        return st.get(key);

    }
    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is {@code null}.

     */
    public void put(Key key, Value val){
        if (key == null) throw new IllegalArgumentException("called put() with null value");
        if (val == null) st.remove(key);
        else st.put(key,val);
    }
    public void delete(Key key){
        if (key == null) throw new IllegalArgumentException("called delete() with null value");
        st.remove(key);
    }
    public boolean contains(Key key){
        if (key == null) throw new IllegalArgumentException("called contains() with null key");
        return st.containsKey(key);
    }
    public int size(){
        return st.size();
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public Iterable<Key> keys(){
        return st.keySet();
    }
    @Deprecated
    public Iterator<Key> iterator(){
        return st.keySet().iterator();
    }

    public Key min(){
        if (isEmpty()) throw new NoSuchElementException("called mix() with empty symbol table");
        return st.lastKey();
    }
    public Key ceiling(Key key){
        if (key == null) throw new IllegalArgumentException("called ceiling() with null value");
        Key k = st.ceilingKey(key);
        if (k==null) throw new NoSuchElementException("all keys are less than "+key);
        return k;
    }
    public Key floor(Key key){
        if (key == null) throw new IllegalArgumentException("called floor() with null value");
        Key k = st.floorKey(key);
        if (k==null) throw new NoSuchElementException("all keys are greater than "+key);
        return k;
    }
    public static void main(String[] args){
        ST<String, Integer> st = new ST<String, Integer>();
        for (int i=0;!StdIn.isEmpty(); i++){
            String key=StdIn.readString();
            st.put(key,i);
        }
        for(String s:st.keys())
            StdOut.println(s + " " +st.get(s));

    }
}

package algs4.search;

import algs4.basic.StdOut;
import algs4.basic.datastructures.Queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by nugusbayevkk on 2/10/17.
 */
public class ArrayST<Key extends Comparable<Key>, Value> {
    private Key[] keys;
    private Value[] vals;
    private int n;
    public ArrayST(int capacity){
        keys = (Key[])new Comparable[capacity];
        vals = (Value[])new Comparable[capacity];
        n=0;
    }
    public int size(){
        return n;
    }
    public boolean isEmpty(){
        return n==0;
    }
    public boolean contains(Key key){
        if (key==null) throw new IllegalArgumentException("Argument in method contains is null");
        for (int i=0; i<n; i++)
            if (key.equals(keys[i])) return true;
        return false;
    }
    public Value get(Key key){
        if (key==null) throw new IllegalArgumentException("Argument in method get is null");
        for (int i=0; i<n; i++)
            if (key.equals(keys[i])) return vals[i];
        return null;
    }
    public void put(Key key, Value value){
        if (key==null) throw new IllegalArgumentException("First argument in method put is null");
        if (value == null){
        //here delete
        }
        for (int i=0;i<n; i++){
            if (key.equals(keys[i])){
                vals[i]=value;
                return;
            }
        }
        if (n+1==keys.length) throw new ArrayStoreException("Array not have space");
        keys[n]=key;
        vals[n]=value;
        n++;
    }
    public void delete(Key key){
        if (key==null) throw new IllegalArgumentException("Argument in method delete is null");
        int keyIndex=-1;
        for (int i=0; i<n;i++){
            if (keys[i].equals(key)) {
                keyIndex=i;break;
            }
        }
        if (keyIndex == -1) throw new NoSuchElementException("Element does not exist");
        else {
            for (int j=keyIndex+1; j<n; j++){
                keys[j-1]=keys[j]; vals[j-1]=vals[j];
            }
            keys[n-1]=null; vals[n-1]=null;
            n--;
        }
    }
    public void show(){
        for (int i=0; i<size(); i++){
            StdOut.println("Key: "+keys[i]+" Value: "+vals[i]);
        }
    }

    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue<Key>();
        for (int i=0; i<n;i++){
            queue.enqueue(keys[i]);
        }
        return queue;
    }
    public static void main(String[] args){
        ArrayST<String, Integer> q= new ArrayST<>(5);
        q.put("A",1);
        q.put("B",2);
        q.put("C",3);
        q.show();
        StdOut.println(q.size());
        q.delete("B");
        q.delete("A");
        q.delete("C");
        q.show();
        StdOut.println(q.size());
    }
}

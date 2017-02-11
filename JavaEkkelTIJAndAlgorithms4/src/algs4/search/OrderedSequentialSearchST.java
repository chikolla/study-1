package algs4.search;

import algs4.basic.StdOut;

import java.util.NoSuchElementException;

/**
 *
 * Created by nugusbayevkk on 2/10/17.
 */
public class OrderedSequentialSearchST<Key extends Comparable<Key>,Value> {
    private Node first;
    private int N;
    private class Node{
        Key key;
        Value value;
        Node next;
        Node(Key key,Value value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    public int size(){
        return N;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public void put(Key key, Value value){
        if (key==null) throw new IllegalArgumentException("Argument in method put is null.");

        for(Node x=first; x!=null; ){
            if (key.compareTo(x.key)>0) {
                if (x.next == null) {
                    Node newNode = new Node(key, value, null);
                    N++;
                    x.next = newNode;
                    return;
                }else if (x.next.key.compareTo(key)>=0){
                    Node newNode = new Node(key, value, x.next);
                    N++;
                    x.next = newNode;
                    return;
                }
                x = x.next;
            }else if (key.compareTo(x.key)<0){
                first = new Node(key, value, x);
                N++;
                return;
            }else if(key.compareTo(x.key) == 0) {
                x.value = value;
                return;
            }
        }
        first = new Node(key,value,null);
        N++;
    }
    public Value get(Key key){
        if (key == null) throw new IllegalArgumentException("First argument in method get{} is null");
        for (Node x=first; x!=null; x=x.next)
            if (x.key.equals(key)) { return x.value;}
        throw new NoSuchElementException("This key does not exist");
    }
    public Value getMin(){
        if (N==0) throw new NoSuchElementException("ST does not have any elements.");
        return first.value;
    }
    public void delete(Key key){
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");
        for (Node x=first; x!=null; x=x.next){
            if (key.equals(x.key)){
                N--;
                x=x.next;
                return;
            }else if (key.compareTo(x.key)<0){
                throw new NoSuchElementException("Key does not exist, exit from iterate");
            }
        }
    }
    private Node delete(Node x, Key key){
        if (x== null) return null;
        if (key.equals(x.key)){
            N--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }
    public void show(){
        for (Node x=first; x!=null; x=x.next)
            StdOut.println("Key: "+x.key + " Value:"+x.value);
    }
    public static void main(String[] args){
        OrderedSequentialSearchST<Integer,String> st = new OrderedSequentialSearchST();
        st.put(5, "First");

        st.put(2, "Second");

        st.put(3, "Third");

        st.put(1, "Five");

        st.put(6, "Third");

        st.put(8, "Third");

        st.put(1, "Third");
//        StdOut.println(st.get(3) + st.size());
        st.show();
        StdOut.println(st.size());
        st.delete(6);
        st.show();
    }

}

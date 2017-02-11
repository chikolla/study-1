package algs4.search;

import algs4.basic.datastructures.Queue;

/**
 * The class repressents an (unordered) symbol table of generic key-value pairs
 * This implementation uses a singly linkedlist and sequential search
 *
 * The put and delete operations tale linear time,
 * the get and contains operations take linear time in the worst case
 * The size, and isEmpty take constant time
 *
 * Construction take constant time
 *
 * @author copied
 *
 * Created by nugusbayevkk on 2/9/17.
 */
public class SequentialSearch<Key,Value> {
    private Node first;
    private int n;

    private class Node{
        Key key;
        Value val;
        Node next;
        public Node (Key key, Value val, Node next){
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
    public SequentialSearch(){}

    public int size(){
        return n;
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public boolean contains(Key key){
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) !=null;
    }

    public Value get(Key key){
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        for (Node x=first; x != null; x=x.next) {
            if (key.equals(x.key))
                return x.val;
        }
        return null;
    }
    public void put(Key key, Value val)
    { //Search for key. Update value if found; grow table if new.
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");
        if (val == null) {
            delete(key);
            return;
        }
        for (Node x=first; x!=null; x=x.next)
            if (key.equals(x.key)){
                x.val = val;
                return;
            }
        first = new Node(key, val, first);
        n++;
    }
/**
 * Removes the specified key and its associated value from this symbol table
 * (if the key is in this symbol table).
 **/
    public void delete(Key key){
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");
        first = delete(first, key);
    }
    // delete key in linked list beginning at Node x
    // warning: function call stack too large if table is large
    private Node delete(Node x, Key key){
        if (x== null) return null;
        if (key.equals(x.key)){
            n--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }

    public Iterable<Key> keys()  {
        Queue<Key> queue = new Queue<Key>();
        for (Node x = first; x != null; x = x.next)
            queue.enqueue(x.key);
        return queue;
    }

    public static void main(String[] args){
        SequentialSearch<String, String> test = new SequentialSearch<>();
        test.put("Q","S");
        test.put("Z","O");
        System.out.println(test.get("Z"));
    }
}

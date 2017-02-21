package algs4.search;

import algs4.basic.StdOut;
import algs4.basic.datastructures.Queue;

/**
 * Created by nugusbayevkk on 2/12/17.
 */
public class BST<Key extends Comparable, Value> {
    private Node root;
    private class Node{
        private Key key;
        private Value value;
        private Node left, right;
        private int N;
        public Node(Key key, Value value, int N){
            this.key = key; this.value = value; this.N=N;
        }
    }
    public int size(){return size(root);}
    private int size(Node x){
        if(x==null) return 0;
        else return x.N;
    }
    public Value get(Key key){
        return get(root, key);
    }
    private Value get(Node x, Key key){
        if (x==null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return get(x.left, key);
        if (cmp>0) return get(x.right, key);
        else return x.value;
    }

    public void put(Key key,Value value){
        root = put(root, key,value);
    }
    private Node put(Node x, Key key, Value value){
        if (x==null) return new Node(key,value, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key,value);
        else if (cmp > 0) x.right = put(x.right, key,value);
        else x.value = value;
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }
    public Key min(){
        return min(root).key;
    }
    private Node min(Node x){
        if (x.left == null) return x;
        return min(x.left);
    }
    public Key max(){
        return max(root).key;
    }
    private Node max(Node x){
        if (x.right == null) return x;
        return (x.right);
    }
    public Key floor(Key key){
        Node x = floor(root, key);
        if (x==null) return null;
        return x.key;
    }
    private Node floor(Node x, Key key){
        if (x ==null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp < 0) return floor(x.left, key);
        Node t = floor(x.right, key);
        if (t != null) return t;
        else return x;
    }
    public Key ceiling(Key key){
        Node x = ceiling(root, key);
        if (x == null) return null;
        return x.key;
    }
    private Node ceiling(Node x, Key key){
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp > 0) return ceiling(x.right, key);
        Node t = ceiling(x.left, key);
        if (t != null) return t;
        else return x;
    }
    /**
     * Return the kth smallest key in this symbol table.
     *
     * @param  k the order statistic
     * @return the {@code k}th smallest key in this symbol table
     * @throws IllegalArgumentException unless {@code k} is between 0 and
     *        <em>n</em>–1
     */
    public Key select(int k){
        return select(root, k).key;
    }
    private Node select(Node x, int k)
    { // Return node containing key of rank k
        StdOut.println("Node x "+x.key+ " N:"+x.N + " K: "+k);
        if (x == null) return null;
        int t = size(x.left);
        StdOut.println("t:"+t);
        if (t>k) return select(x.left, k);
        else if (t<k) return select(x.right, k-t-1);
        else return x;
    }
    /**
     * Returns the number of keys in this symbol table strictly less than {@code key}.
     *
     * @param  key the key
     * @return the number of keys in the symbol table strictly less than {@code key}
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public int rank(Key key){
        if (key == null) throw new IllegalArgumentException("argument is null in method rank.");
        return rank(key,root);
    }
    private int rank(Key key, Node x){
        if (x == null) return 0;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return rank(key, x.left);
        else if (cmp>0) return 1+size(x.left)+rank(key, x.right);
        else return size(x.left);
    }
    public void deleteMin(){
        root = deleteMin(root);
    }
    private Node deleteMin(Node x){
        if (x.left ==null) return x.right;
        x.left = deleteMin(x.left);
        x.N = size(x.left) + size(x.right)+1;
        return x;
    }
    public void deleteMax(){
        root = deleteMax(root);
    }
    private Node deleteMax(Node x){
        if (x.right==null)  return x.left;
        x.right = deleteMax(x.right);
        x.N =size(x.left) + size(x.right)+1;
        return x;
    }
    public void delete(Key key){
        root=delete(root, key);
    }
    private Node delete(Node x, Key key){
        if (x==null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp<0) x.left = delete(x.left, key);
        else if (cmp > 0) x.right = delete(x.right, key);
        else
        {
            if (x.right == null) return x.left;
            if (x.left == null) return x.right;
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.N = size(x.left) + size(x.right)+1;
        return x;
    }
    public void print(){
        print(root);
    }

    private void print(Node x){
        if (x==null) return;
        print(x.left);
        StdOut.println(x.key);
        print(x.right);
    }
    public Iterable<Key> keys(){
        return keys(min(), max());
    }
    public Iterable<Key> keys(Key lo, Key hi){
        Queue<Key> queue=new Queue<Key>();
        keys(root, queue, lo, hi);
        return queue;
    }
    private void keys(Node x, Queue<Key> queue, Key lo, Key hi){
        if (x == null) return;
        int cmplo = lo.compareTo(x.key);
        int cmphi = hi.compareTo(x.key);
        if (cmplo < 0) keys(x.left, queue, lo, hi);
        if (cmplo <= 0 && cmphi >= 0) queue.enqueue(x.key);
        if (cmphi > 0) keys(x.right, queue, lo,hi);
    }

    //delete delete min deleteMax
    //keys
    public static void main(String[] args){
        BST<String, String> temp = new BST<>();
        temp.put("M", "MASTER");
        temp.put("G", "GENERAL");
        temp.put("R", "RARITY");
        temp.put("Z", "ZERO");
        temp.put("E", "ELEMENTARY");
        temp.print();
        temp.deleteMax();
        StdOut.println();
        temp.print();
        temp.deleteMax();
        StdOut.println();
        temp.print();
    }
}

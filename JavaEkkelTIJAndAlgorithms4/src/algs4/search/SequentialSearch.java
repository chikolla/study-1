package algs4.search;

/**
 * Created by nugusbayevkk on 2/9/17.
 */
public class SequentialSearch<Key,Value> {
    private Node first;
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
    public Value get(Key key){
        for (Node x=first; x != null; x=x.next)
            if (key.equals(x.key))
                return x.val;
        return null;
    }
    public void put(Key key, Value val)
    { //Search for key. Update value if found; grow table if new.
        for (Node x=first; x!=null; x=x.next)
            if (key.equals(key)){
                x.val = val;
                return;
            }
        first = new Node(key, val, first);
    }
}

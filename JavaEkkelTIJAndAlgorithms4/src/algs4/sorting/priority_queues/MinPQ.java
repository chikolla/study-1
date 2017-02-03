package algs4.sorting.priority_queues;

import java.util.Comparator;

/**
 * Created by nugusbayevkk on 2/3/17.
 */
public class MinPQ<Key> implements Iterable<Key> {
    private Key[] pq;
    private int n;
    private Comparator<Key> comparator;

    public MinPQ(int initCapacity){
        pq = (Key[]) new Object[initCapacity+1];
        n=0;
    }
    public MinPQ(){
        this(1);
    }
    public MinPQ(int initCapacity, Comparator<Key> comparator){
        this.comparator = comparator;
        pq = (Key[]) new Object[initCapacity+1];
        n=0;
    }

    public MinPQ(Comparator<Key> comparator){
        this(1,comparator);
    }
    public MinPQ(Key[] keys){
        n = keys.length;
        pq =
    }


}

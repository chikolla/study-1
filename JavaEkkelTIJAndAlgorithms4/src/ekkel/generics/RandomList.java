package ekkel.generics;

import algs4.basic.StdOut;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item) {storage.add(item);}
    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }
    public static void main(String [] args){
        RandomList<String> t = new RandomList<String>();
        for (String s: "The quick brown fox jumped over the lazy brown dog.".split(" "))
            t.add(s);
        RandomList<Integer> t2 = new RandomList<Integer>();
        for (String s: "1 2 3 10 15 20".split(" "))
            t2.add(Integer.valueOf(s));
        for (int i=0; i< 11; i++) {
            StdOut.println(t.select());
            StdOut.println(t2.select());
        }
    }

}

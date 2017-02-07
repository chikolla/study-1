package ekkel.generics.exercises;

import algs4.basic.StdOut;
import ekkel.generics.Fibonacci;
import ekkel.generics.IterableFibonacci;

import java.util.Iterator;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class Exercise7 implements Iterable<Integer>{
    private int n;
    Fibonacci fib;
    Exercise7(int n){
        fib = new Fibonacci();
        this.n = n;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() { return n > 0; }
            public Integer next() {
                n--;
                return Exercise7.this.fib.next();
            }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args){
        for (int i: new Exercise7(20))
            StdOut.println(i);
    }
}

package ekkel.innerclasses;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
interface Selector<T> {
    boolean end();
    T current();
    void next();
}

public class Sequence<T> {
    private T[] items;
    private int next = 0;
    public Sequence(int size) { items = (T[])new Object[size]; }
    public void add(T x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector<T> implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public T current() { return (T)items[i]; }
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence<String> sequence = new Sequence<String>(10);
        for(int i = 0; i < 10; i++)
            sequence.add("Abra "+i);
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
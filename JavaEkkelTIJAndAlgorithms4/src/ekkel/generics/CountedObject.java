package ekkel.generics;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id() { return id; }
    public String toString() { return "CountedObject " + id;}
}

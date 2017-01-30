package algs4.sorting;

import algs4.basic.In;
import algs4.basic.StdOut;

import java.util.Arrays;

/**
 * Created by nugusbayevkk on 1/31/17.
 */
public class Example {
    public static void sort(Comparable[] a){
        Arrays.sort(a);
    }
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }
    private static void show(Comparable[] a){
        for (int i=0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }
    public static boolean isSorted(Comparable[] a){
        for (int i=1; i < a.length; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }
    public static void main(String[] args){
        String[] a = {"S", "O", "R", "T", "E", "X", "A" ,"M", "P", "0", "L", "E"};
//        sort(a);
        assert isSorted(a);
        show(a);
    }
}

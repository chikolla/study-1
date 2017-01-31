package algs4.sorting;

import java.util.Comparator;

/**
 * Created by nugusbayevkk on 1/31/17.
 */
public class Insertion {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 1; i < N; i++)
            for (int j=i; j>0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
    }
    public static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }
    public static void exch(Comparable[] a,int i, int j){
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }
}

package algs4.sorting;

import algs4.basic.StdOut;
import algs4.basic.StdRandom;

/**
 * Created by nugusbayevkk on 2/2/17.
 */
public class Quick3way {
    private Quick3way(){}

    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);
        show(a);
        StdOut.println();
        sort(a, 0, a.length-1);
        assert isSorted(a);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if (hi<=lo) return;
        int lt=lo, gt=hi;
        Comparable v=a[lo];
        int i=lo;
        while(i<=gt){
            int cmp = a[i].compareTo(v);
            if (cmp < 0)exch(a, lt++, i++);
            else if (cmp > 0) exch(a, i, gt--);
            else i++;
        }
        sort(a, lo, lt-1);
        sort(a, gt+1, hi);
        assert isSorted(a, lo, hi);
   }
    private static void exch(Comparable[] a, int i, int j){
        Comparable temp = a[i]; a[i]=a[j]; a[j]=temp;
    }
    private static boolean less(Comparable w, Comparable v){
        return w.compareTo(v) < 0;
    }
    private static boolean isSorted(Comparable[] a){
        return isSorted(a, 0, a.length - 1);
    }
    private static boolean isSorted(Comparable[] a, int lo, int hi){
        for (int i=lo+1; i<=hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    private static void show(Comparable[] a){
        for (int i=0; i<a.length; i++)
            StdOut.print(a[i]+" ");
    }
    public static void main(String[] args){
        String[] a = new String[]{"A","B","Q","E","C","Z"};
        Quick3way.sort(a);
        show(a);

    }
}

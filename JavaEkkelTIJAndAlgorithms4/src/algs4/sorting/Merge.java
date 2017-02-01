package algs4.sorting;

import java.util.Comparator;

/**
 * Created by nugusbayevkk on 2/1/17.
 */
public class Merge {
    private static Comparable[] aux;
    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);

        //copy to aux[]
        for (int k=lo; k<=hi; k++) {
            aux[k] = a[k];
        }

        //merge back to a[]
        int i=lo, j=mid+1;
        for (int k=lo; k<=hi;k++){
            if (i>mid) a[k]=aux[j++];
            else if (j>hi) a[k]=aux[i++];
            else if (less(a[j], a[i])) a[k]=a[j++];
            else a[k]=a[i++];
        }
        //postcondiotn a[lo..hi] is sorted
        assert isSorted(a, lo, hi);
    }

    //mergesort a[lo..hi] using auxiliry array aux[lo..hi]
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
        if (hi<=lo) return;
        int mid=lo+(hi-lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a, 0, a.length -1);
        assert isSorted(a);
    }

    public static void sort(Comparable[] a, int lo, int hi){
        //Sort a[lo..hi]
        if (hi <= lo) return;
        int mid = lo + (hi - lo) /2;
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }
    public static void merge(Comparable[] a, int lo, int mid, int hi){
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];
        for(int k=lo; k<= hi; k++)
            if (i>mid) a[k]=aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
    }
    /*
    * Helper sorting function*/
    // if v < w ?
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(2) < 0;
    }
    /***
     * Check if array is sorted - useful for debugging.
      */
    private static boolean isSorted(Comparable[] a){
        return isSorted(a, 0, a.length -1);
    }
    private static  boolean isSorted(Comparable[] a,int lo, int hi){
        for (int i = lo+1; i<=hi; i++)
            if (less(a[i],a[i-1])) return false;
        return true;
    }

}

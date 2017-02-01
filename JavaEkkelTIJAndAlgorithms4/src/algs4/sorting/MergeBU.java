package algs4.sorting;

/**
 * Created by nugusbayevkk on 2/1/17.
 */
public class MergeBU {
    private static Comparable[] aux;

    public static void sort(Comparable[] a)
    { // DO lg N passes of pairwise merges
        int N = a.length;
        aux = new Comparable[N];
        for (int sz=1; sz < N; sz = sz+sz)   //sz: subarray size
            for (int lo = 0; lo < N-sz; lo += sz+sz) // lo: subarray index
                merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
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
    public static boolean less(Comparable c1, Comparable c2){
        return c1.compareTo(c2) < 0;
    }
}

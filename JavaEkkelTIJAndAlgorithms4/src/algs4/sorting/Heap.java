package algs4.sorting;

import algs4.basic.StdIn;
import algs4.basic.StdOut;

/**
 * Created by nugusbayevkk on 2/4/17.
 */
public class Heap {
    private Heap(){}

    public static void sort(Comparable[] pq){
        int n = pq.length;
        for (int k =n/2; k>=1; k--){
            sink(pq, k, n);
        }
        while (n>1){
            exch(pq, 1, n--);
            sink(pq, 1,n);
        }
    }

    private static void sink(Comparable[] pq, int k, int N){
        while(2*k<= N){
            int j = 2*k;
            if (j<N && less(pq,j, j+1)) j++;
            if (!less(pq,k,j)) break;
            exch(pq,k,j);
            k=j;
        }
    }
    private static boolean less(Comparable[] pq, int i, int j){
        return pq[i-1].compareTo(pq[j-1]) < 0;
    }
    private static void exch(Object[] pq, int i, int j){
        Object swap = pq[i-1];
        pq[i-1] = pq[j-1];
        pq[j-1] = swap;
    }
    /***************************************************************************
     *  Check if array is sorted - useful for debugging.
     ***************************************************************************/
    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a, i, i-1)) return false;
        return true;
    }


    // print array to standard output
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

    /**
     * Reads in a sequence of strings from standard input; heapsorts them;
     * and prints them to standard output in ascending order.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        String[] a = new String[]{"A","Z", "S", "C","D"};
        Heap.sort(a);
        show(a);
        assert isSorted(a);
    }

}

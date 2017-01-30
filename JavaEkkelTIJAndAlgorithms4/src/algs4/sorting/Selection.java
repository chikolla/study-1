package algs4.sorting;

/**
 * Created by nugusbayevkk on 1/31/17.
 */
public class Selection {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i=0; i < N; i++){ //Exchange a[i] with smallest entry in a[i+1..N]
            int min = i;
            for (int j=i+1; j < N;j++)
                if (less(a[j], a[min])) min = j;
            exch(a, i, min);
        }
    }
    public static boolean less(Comparable n, Comparable m){
        return n.compareTo(m) < 0;
    }
    public static void exch(Comparable[] a, int cur, int that){
        Comparable t=a[cur]; a[cur] = a[that]; a[that] = t;
    }
}

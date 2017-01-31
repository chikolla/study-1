package algs4.sorting;

/**
 * Created by nugusbayevkk on 1/31/17.
 */
public class Shell {
    public static void sort(Comparable[] a){
        //Sort a[] into increasing order
        int N = a.length;
        int h =1 ;
        while (h < N/3) h = 3*h + 1; // 1 4 13 40 121 364
        while (h >= 1){ //h sort the array
            for (int i=h; i < N; i++){
                for (int j=i; j>=h &&less(a[j], a[j-h]); j-=h)
                    exch(a, j, j-h);
            }
            h = h/3;
        }
    }
    public static boolean less(Comparable c1, Comparable c2){
        return c1.compareTo(c2) < 0;
    }
    public static void exch(Comparable[] a, int q, int p){
        Comparable t=a[q]; a[q]=a[p]; a[p]=t;
    }
}

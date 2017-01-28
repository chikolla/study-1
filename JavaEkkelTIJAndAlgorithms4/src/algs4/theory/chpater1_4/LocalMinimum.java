package algs4.theory.chpater1_4;

/**
 * Created by halfmediator on 24.01.2017.
 */
public class LocalMinimum {
    public static void find(int[] a, int lo, int hi){
        int mid = lo + (hi - lo) / 2;

        if (mid+1 == hi) {
            return;
        }

        int right = a[mid+1];
        int left = a[mid-1];

        if (a[mid] < left && a[mid] < right) {
            System.out.println("Found one:");
            System.out.println(Integer.toString(left) + " " + Integer.toString(a[mid]) + " " + Integer.toString(right));
            return;
        }

        find(a, hi, mid);
        find(a, mid, lo);
    }
    public static void main(String[] args){
        int[] a = new int[]{8,10,9,11};
        find(a, 0, a.length);
    }
}

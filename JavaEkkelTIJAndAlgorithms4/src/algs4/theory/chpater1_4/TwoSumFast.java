package algs4.theory.chpater1_4;

import algs4.basic.StdOut;
import algs4.basic.search.BinarySearch;

import java.util.Arrays;

/**
 * Created by halfmediator on 22.01.2017.
 */
public class TwoSumFast {
    public static int count(int[] a){
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++){
            if (BinarySearch.rank(a,-a[i]) > i)
                cnt++;
        }
        return cnt;
    }
    public static void main(String[] args){
        int[] a = {2,3,4,5,-2,6,-6,9,-9};
        StdOut.println(count(a));
    }
}

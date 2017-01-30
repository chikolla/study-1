package algs4.theory.chpater1_4;

import algs4.basic.StdOut;
import algs4.basic.StdRandom;
import algs4.basic.search.Counter;

import java.util.Arrays;

/**
 * Created by halfmediator on 24.01.2017.
 */
public class TwoPairSort {
    public static int count(int[] a){
        if(a == null || a.length == 0) return -1;
        Counter ops = new Counter("ops");
        Counter comparisons = new Counter("comparisons");
        int N = 0;
        Arrays.sort(a);
        for (int i=1; i< a.length; i++){
            comparisons.increment();
            if (a[i] == a[i-1]) {
                ops.increment();
                ops.increment();
                i++;
                N++;
            }
        }
        StdOut.printf("Operations: %d , comparissons: %d\n", ops.tally() , comparisons.tally());
        return N;
    }
    public static void main(String[] args){
        int[] a = new int[10000];
        for (int i=0; i <a.length; i++){
            a[i] = StdRandom.uniform(50);
        }
        StdOut.println(count(a));
    }
}

package algs4.theory.chpater1_4;

import algs4.basic.StdOut;
import algs4.basic.search.Counter;

import java.math.BigInteger;

/**
 * Created by halfmediator on 22.01.2017.
 */
public class ThreeSum {
    public static int count(int[] a){
        Counter opsCount= new Counter("ops");
        Counter comparisonsCount= new Counter("comparisons");
        int N = a.length;
        int cnt = 0;
        for (int i =0; i< N; i++)
            for (int j=i+1; j<N; j++)
                for (int k=j+1; k<N; k++)
                    if (BigInteger.valueOf(a[i]).add(BigInteger.valueOf(a[j])).add(BigInteger.valueOf(a[k])).equals(0))
                    {cnt++; opsCount.increment(); comparisonsCount.increment();
                    }else comparisonsCount.increment();
        StdOut.printf("%d operations , %d comparisons \n", opsCount.tally(), comparisonsCount.tally());
        return cnt;
    }
    public static void main(String[] args){
        int[] a = new int[1000];
        for (int i=0; i <a.length; i++){
            a[i] = i - 5000;
        }
        StdOut.println(count(a));
    }
}

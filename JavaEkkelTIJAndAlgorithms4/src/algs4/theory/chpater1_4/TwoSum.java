package algs4.theory.chpater1_4;

import algs4.basic.StdOut;

import java.math.BigInteger;

/**
 * Created by halfmediator on 23.01.2017.
 */
public class TwoSum {
    public static int count(int[] a){
        int N = a.length;
        int cnt = 0;
        for (int i =0; i< N; i++)
            for (int j = i + 1; j < N; j++)
                if (BigInteger.valueOf(a[i]).add(BigInteger.valueOf(a[j])).equals(0)) cnt++;
        return cnt;
    }
    public static void main(String[] args){
        int[] a = new int[40000];
        for (int i=0; i <a.length; i++){
            a[i] = i - 5000;
        }
        StdOut.println(count(a));
    }
}

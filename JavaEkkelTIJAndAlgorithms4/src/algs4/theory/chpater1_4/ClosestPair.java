package algs4.theory.chpater1_4;

import alg4s.basic.StdOut;

import java.util.Arrays;

/**
 * Created by halfmediator on 24.01.2017.
 */
public class ClosestPair {
    public static int[] getClosestPair(int[] a){
        int[] res = new int[2];
        if (a == null) return null;
        else if (a.length == 0 || a.length == 1) return null;
        else if (a.length == 2) return a;
        else {
            Arrays.sort(a);
            int min=Math.abs(a[0]-a[1]);
            for (int i=0; i< a.length-1; i++){
                if (Math.abs(a[i]-a[i+1]) <= min) { res[0]=i; res[1]=i+1; min=Math.abs(a[i]-a[i+1]); }
            }
        }
        return res;
    }
    public static int[] getFathestPair(int[] a){
        int[] res = new int[2];
        if (a == null) return null;
        else if (a.length == 0 || a.length == 1) return null;
        else if (a.length == 2) return a;
        else {
            int max=Math.abs(a[0]-a[1]);
            for (int i=0; i< a.length-1; i++){
                if (Math.abs(a[i]-a[i+1]) >= max) { res[0]=i; res[1]=i+1; max=Math.abs(a[i]-a[i+1]); }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] res = getClosestPair(new int[]{1,3,10,11,20});
        for (int q: res)
            StdOut.print(q+ " ");
        res = getFathestPair(new int[]{100,1,3,10,11,20});
        for (int q: res)
            StdOut.print(q+ " ");
    }
}

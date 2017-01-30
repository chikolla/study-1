package algs4.theory.chpater1_4;

import algs4.basic.StdOut;
import algs4.basic.search.BinarySearch;

import java.util.Arrays;

/**
 * Created by halfmediator on 24.01.2017.
 */
public class FourSum {
    public static int count(int[] a){
        int cnt = 0;
        for (int i =0; i < a.length; i++)
            for (int j=i+1; j < a.length; j++)
                for (int k = j+1; k < a.length; k++)
                    if (BinarySearch.rank(a, -a[i]-a[j]-a[k])  > k) cnt++;
        return cnt;
    }
    public static void main(String[] args){
        int[] a = new int[]{1,2,3,-6,13,12,-12,-13};
        Arrays.sort(a);
//        for (int i=0; i <a.length; i++){
//            a[i] = i - 5000;
//        }
        StdOut.println(count(a));
    }
}

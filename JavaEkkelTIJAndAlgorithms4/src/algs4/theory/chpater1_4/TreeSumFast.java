package algs4.theory.chpater1_4;

import alg4s.basic.search.BinarySearch;

import java.util.Arrays;

/**
 * Created by halfmediator on 23.01.2017.
 */
public class TreeSumFast {
    public static int count(int[] a){
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0;i < N; i++){
            for (int j = i +1; j < N; j++){
                if (BinarySearch.rank(a, -a[i]-a[j])>j)
                    cnt++;
            }

        }
        return cnt;
    }
    public static void main(String[] args){

    }
}

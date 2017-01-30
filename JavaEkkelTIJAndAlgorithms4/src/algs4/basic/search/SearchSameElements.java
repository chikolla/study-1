package algs4.basic.search;

import algs4.basic.StdOut;

/**
 * Created by halfmediator on 24.01.2017.
 */
public class SearchSameElements {
    public static void main(String[] args){
        int[] a1 = new int[]{1,3,4,5,6,10,100,126,137};
        int[] a2 = new int[]{3,6,100,200,400};
        int[] res = giveIntersection(a1,a2);
        for (int q : res)
            StdOut.print(q+" ");
    }
    public static int[] giveIntersection(int[] a1, int[] a2){
        int N =0;
        int[] temp;
        if (a1.length >= a2.length) temp = new int[a2.length];
        else temp = new int[a1.length];

        for (int i = 0; i<a1.length; i++){
            if (BinarySearch.rank(a2,a1[i])!= -1) {temp[N] = a1[i]; N++;}
        }
        int[] result = new int[N];
        for (int i = 0; i < N; i++){
            result[i] = temp[i];
        }
        return result;
    }
}

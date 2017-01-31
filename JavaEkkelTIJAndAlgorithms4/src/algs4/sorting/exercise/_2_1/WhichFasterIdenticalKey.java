package algs4.sorting.exercise._2_1;

import algs4.basic.StdOut;

import static algs4.sorting.SortCompare.timeSameValInput;

/**
 * 2.1.6 Which method runs faster for an array with all keys identical, selection sort or
 insertion sort?
 *
 * Created by nugusbayevkk on 1/31/17.
 */
public class WhichFasterIdenticalKey {
    public static void main(String[] args){
        String alg1 = args[0];
        String alg2 = args[1];
        int V = Integer.parseInt(args[2]);
        int N = Integer.parseInt(args[3]);
        int T = Integer.parseInt(args[4]);
        double t1 = timeSameValInput(alg1,V, N, T);
        double t2 = timeSameValInput(alg2,V, N, T);
        StdOut.printf("FOr %d random DOubles\n %s is ", N, alg1);
        StdOut.printf(" %.1f times faster than %s\n", t2/t1, alg2);
    }
    /*
    for 2000 same value
 Selection is  0.1 times faster than Shell
 Shell is  15.0 times faster than Selection
 Insertion is  15.2 times faster than Selection
    * */
}

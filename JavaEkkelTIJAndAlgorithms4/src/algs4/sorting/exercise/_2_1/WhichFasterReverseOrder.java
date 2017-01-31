package algs4.sorting.exercise._2_1;

import algs4.basic.StdOut;

import static algs4.sorting.SortCompare.timeReverseArrayInput;
import static algs4.sorting.SortCompare.timeSameValInput;

/**
 * 2.1.7 Which method runs faster for an array in reverse order, selection sort or inser-
 tion sort?

 * Created by nugusbayevkk on 1/31/17.
 */
public class WhichFasterReverseOrder {
    public static void main(String[] args){
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double t1 = timeReverseArrayInput(alg1, N, T);
        double t2 = timeReverseArrayInput(alg2, N, T);
        StdOut.printf("FOr %d random DOubles\n %s is ", N, alg1);
        StdOut.printf(" %.1f times faster than %s\n", t2/t1, alg2);

    }

    /**
     * FOr 2000 .. 1 array of ints
     Insertion is  0.3 times faster than Selection
     Selection is  2.5 times faster than Insertion
     Selection is  0.1 times faster than Shell
     Shell is  48.2 times faster than Insertion

     * */
}

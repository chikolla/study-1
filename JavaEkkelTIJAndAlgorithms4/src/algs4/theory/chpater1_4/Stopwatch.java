package algs4.theory.chpater1_4;

import alg4s.basic.StdOut;
import alg4s.basic.StdRandom;

/**
 * Created by halfmediator on 22.01.2017.
 */
public class Stopwatch {
    private final long start;
    public Stopwatch(){
        start = System.currentTimeMillis();
    }
    public double elapsedTime(){
        long now = System.currentTimeMillis();
        return (now - start) /1000.0;
    }
    public static void main(String[] args){
        int N = 5000;
        int[] a = new int[N];
        for (int i = 0; i < N;i++)
            a[i] = StdRandom.uniform(-1000000,1000000);
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        double time = timer.elapsedTime();
        StdOut.println(cnt + " triples " + time);
    }
}

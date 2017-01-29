package algs4.theory.chpater1_4;

import alg4s.basic.StdDraw;
import alg4s.basic.StdOut;
import alg4s.basic.StdRandom;

/**
 * Created by halfmediator on 22.01.2017.
 */
public class DoublingTest {
    public static double timeTrial(int N){
        int MAX = 1000000;
        int[]  a =new int[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform(-MAX, MAX);
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        return timer.elapsedTime();
    }
    public static void main(String[] args){
        StdDraw.setXscale(0,3000);
        StdDraw.setYscale(0, 100);
        StdDraw.setPenRadius(.01);
        for (int N=1; true; N+=N){
            double time = timeTrial(N);
            StdOut.printf("%7d %5.1f\n", N, time);
            StdDraw.point(N, time);
            StdDraw.point(Math.log(N), Math.log(time));

        }
    }
}

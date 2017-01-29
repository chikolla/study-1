package alg4s.basic.dataabstraction;

import alg4s.basic.StdOut;
import alg4s.basic.search.Counter;

import java.util.Arrays;

import static alg4s.basic.StdOut.println;

/**
 * Created by halfmediator on 24.01.2017.
 */
public class StaticSETofInts {
    private int[] a;
    public StaticSETofInts(int[] keys){
        a = new int[keys.length];
        for (int i=0; i < keys.length; i++){
            a[i] = keys[i]; //defensive copy
        }
        //sort
        Arrays.sort(a);
        //removes duplicate
        int length = 0;
        for (int i =0; i < a.length; i++)
            if ((i==0)||(a[i] != a[length-1]))
                a[length++] = a[i];
        int[] b = new int[length];
        for (int i = 0; i < length; i++)
            b[i] = a[i];
    }
    public boolean contains(int key){
        return rank(key) != -1;
    }
    private int howMany(int key){
        int lo = 0;
        int hi = a.length;
        int N = 0;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            if (key > a[mid]) lo =mid + 1;
            else {
                lo = hi = mid;
                println("else +1" + mid);
                N++;
                while (--lo != 0){
                    System.out.println("lo "+lo);
                    if (a[lo] == mid)  N++;
                    else break;
                }
                while (++hi != a.length){
                    System.out.println("hi "+hi);
                    if (a[hi] == mid)  N++;
                    else break;
                }
                break;
            }
        }
        println(N);
        return N;
    }
    private int rank(int key){
        Counter counter = new Counter("ops");
        int lo = 0;
        int hi = a.length-1;
        while (lo <= hi){
            counter.increment();
            int mid = lo + (hi - lo)/2;
            if (key < a[mid]) hi = mid - 1;
            if (key > a[mid]) lo = mid + 1;
            else {println(counter.tally()); return mid; }
        }
        println(counter.tally());
        return -1;
    }
    public static void main(String[] args){
        StaticSETofInts app = new StaticSETofInts(new int[]{1,2,3,7,4,8});
        StdOut.print(app.contains(10));
    }
}

package ekkel.generics;

import algs4.basic.StdOut;
import net.mindview.util.*;

import static net.mindview.util.Tuple.  tuple;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class TupleTest2 {
    static TwoTuple<String,Integer> f() {
        // Autoboxing converts the int to Integer:
        return new TwoTuple<String,Integer>("hi", 47);
    }
    static TwoTuple f2() { return tuple("hi", 47); }

    static ThreeTuple<Amphibian,String,Integer> g() {
        return new ThreeTuple<Amphibian, String, Integer>(
                new Amphibian(), "hi", 47);
    }
    static FourTuple<Vehicle,Amphibian,String,Integer> h() {
        return
                new FourTuple<Vehicle,Amphibian,String,Integer>(
                        new Vehicle(), new Amphibian(), "hi", 47);
    }
    static
    FiveTuple<Vehicle,Amphibian,String,Integer,Double> k() {
        return new
                FiveTuple<Vehicle,Amphibian,String,Integer,Double>(
                new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }
    static SixTuple<Vehicle,Amphibian,String,Integer,Double, Float> q() {
        return new
                SixTuple<Vehicle,Amphibian,String,Integer,Double, Float>(
                new Vehicle(), new Amphibian(), "hi", 47, 11.1, 1f);
    }
    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        // ttsi.first = "there"; // Compile error: final
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        TwoTuple<String,Integer> q = f2();
        StdOut.println(q);
    }
}

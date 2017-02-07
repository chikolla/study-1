package ekkel.generics;

import algs4.basic.StdOut;
import net.mindview.util.*;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
class Amphibian{}
class Vehicle{}
public class TupleTest {
    static TwoTuple<String, Integer> f(){
        return new TwoTuple<String, Integer>("hi", 47);
    }
    static ThreeTuple<Amphibian, String, Integer> g(){
        return new ThreeTuple<Amphibian, String,Integer>(new Amphibian(),"hi Amp",1);
    }
    static
    FourTuple<Vehicle,Amphibian,String,Integer> h() {
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
    static SixTuple<Vehicle, Amphibian, String, Integer, Double,Float > l(){
        return new SixTuple<>(new Vehicle(), new Amphibian(),"Str",1,1.1,1.2f);
    }
    public static void main(String[] args){
        TwoTuple<String, Integer> ttsi = f();
        StdOut.println(g());
        StdOut.println(h());
        StdOut.println(k());
        StdOut.println(l());
    }
}


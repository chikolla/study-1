package ekkel.generics;

import algs4.basic.StdOut;

import java.util.ArrayList;

/**
 * Created by nugusbayevkk on 2/7/17.
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        StdOut.println(c1);
        StdOut.println(c2);
        System.out.println(c1 == c2);
    }
}

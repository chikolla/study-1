package ekkel.typeinfo;

import alg4s.basic.StdOut;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        StdOut.println(bounded.getClass());
        bounded = double.class;
        StdOut.println(bounded.getClass());
        bounded = Number.class;
        StdOut.println(bounded.getClass());
// Or anything else derived from Number.
    }
}

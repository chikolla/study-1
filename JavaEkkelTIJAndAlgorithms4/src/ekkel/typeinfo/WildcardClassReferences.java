package ekkel.typeinfo;

import algs4.basic.StdOut;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        StdOut.println(intClass.getClass());
        intClass = double.class;
        StdOut.println(intClass.getClass());
    }
}

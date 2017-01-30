package ekkel.typeinfo.exercises;

import algs4.basic.StdOut;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
public class Exercise10 {
    public static boolean isPrimitiveArray(Object obj){
        return (obj instanceof char[]);
    }
    public static void main(String[] args){
        char[] ch = new char[]{'c','a'};
        StdOut.println(isPrimitiveArray(ch));
        Character[] ch2 = new Character[]{'c','a'};
        StdOut.println(isPrimitiveArray(ch2));

    }
}

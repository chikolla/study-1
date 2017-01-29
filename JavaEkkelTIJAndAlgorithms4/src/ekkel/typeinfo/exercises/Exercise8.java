package ekkel.typeinfo.exercises;

import alg4s.basic.StdOut;
import ekkel.typeinfo.ToyTesst;

import static alg4s.basic.StdOut.println;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
public class Exercise8 {
    public static void printHierarchy(Object obj){
        Class temp = obj.getClass();
        StdOut.println(obj.getClass().getCanonicalName());
        while(temp != null) {
            StdOut.println(temp);
            StdOut.println(temp.getDeclaredFields());
            temp =temp.getSuperclass();
        }

    }
    public static void main(String[] args){
        String temp = new String("Kane");
        printHierarchy(temp);
        ToyTesst q = new ToyTesst();
        printHierarchy(q);
    }
}

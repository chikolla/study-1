package ekkel.strings.exercises;

import algs4.basic.StdOut;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class Exercise6 {
    private int i=5;
    private long l=10;
    private float f=5.5f;
    private double d=4.3d;

    public String toString(){
        return String.format("i:%d , l:%d, f:%.2f, d:%.2f",i,l,f,d);
    }

    public static void main(String[] args){
        Exercise6 test = new Exercise6();
        StdOut.println(test);
    }

}

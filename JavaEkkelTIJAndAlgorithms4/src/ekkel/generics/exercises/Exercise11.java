package ekkel.generics.exercises;

import algs4.basic.StdOut;
import net.mindview.util.New;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class Exercise11 {
    public static void main(String[] args){
        List<Integer> t = New.<Integer>list();
        t.add(5);
        t.add(10);
        StdOut.println(t.get(1));
    }

}

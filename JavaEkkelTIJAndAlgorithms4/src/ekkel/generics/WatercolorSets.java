package ekkel.generics;

import ekkel.generics.watercolors.Watercolors;

import java.util.EnumSet;
import java.util.Set;

import static algs4.basic.StdOut.print;
import static algs4.basic.StdOut.println;
import static ekkel.generics.watercolors.Watercolors.*;
import static net.mindview.util.Sets.*;

/**
 * Created by nugusbayevkk on 2/7/17.
 */
public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 =
                EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<Watercolors> set2 =
                EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        print("set1: " + set1);
        print("set2: " + set2);
        println("union(set1, set2): " + union(set1, set2));
        Set<Watercolors> subset = intersection(set1, set2);
        println("intersection(set1, set2): " + subset);
        println("difference(set1, subset): " +
                difference(set1, subset));
        println("difference(set2, subset): " +
                difference(set2, subset));
        println("complement(set1, set2): " +
                complement(set1, set2));
    }
}

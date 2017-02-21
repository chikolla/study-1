package ekkel.containers;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import static algs4.basic.StdOut.print;
import static algs4.basic.StdOut.println;

/**
 * Created by nugusbayevkk on 2/21/17.
 */
public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<String>();
        Collections.addAll(sortedSet,
                "one two three four five six seven eight"
                        .split(" "));
        print(sortedSet);
        String low = sortedSet.first();
        String high = sortedSet.last();
        println(low);
        println(high);
        Iterator<String> it = sortedSet.iterator();
        for(int i = 0; i <= 6; i++) {
            if(i == 3) low = it.next();
            if(i == 6) high = it.next();
            else it.next();
        }
        println(low);
        println(high);
        println();
        print(sortedSet);
        println();
        print(sortedSet.subSet(low, high));
        println();
        print(sortedSet);
        println();
        print(sortedSet.headSet(high));
        println();
        print(sortedSet);
        println();
        print(sortedSet.tailSet(low));
    }
}

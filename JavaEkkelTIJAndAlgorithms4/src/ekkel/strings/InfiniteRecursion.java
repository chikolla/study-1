package ekkel.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by halfmediator on 27.01.2017.
 */
public class InfiniteRecursion {
    public String toString() {
        return " InfiniteRecursion address: " + "\n";
    }
    public static void main(String[] args) {
        List<InfiniteRecursion> v =
                new ArrayList<InfiniteRecursion>();
        for(int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
}
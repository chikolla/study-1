package ekkel.strings;

import alg4s.basic.StdOut;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class Rudolph {
    public static void main(String[] args){
        for (String pattern: new String[]{"Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"}) {
            StdOut.println("Rudolph".matches(pattern));
        }
    }
}

package ekkel.strings.exercises;

import algs4.basic.StdOut;

import java.util.regex.Pattern;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class Exercise10 {
    public static void main(String[] args){
        String sentence = "Java now has regular expressions";
        StdOut.println(Pattern.matches("^Java.+",sentence));
//        StdOut.println(Pattern.matches("\B reg*",sentence));
        StdOut.println(Pattern.matches(".+n.w\\s+h(a|i)s.+",sentence));
        StdOut.println(Pattern.matches("J.?",sentence));
        StdOut.println(Pattern.matches("J.*",sentence));
        StdOut.println(Pattern.matches("J.+",sentence));
        StdOut.println(Pattern.matches("s{4}",sentence));
        StdOut.println(Pattern.matches("S{1}.",sentence));
        StdOut.println(Pattern.matches("s{0,3}",sentence));



    }
}

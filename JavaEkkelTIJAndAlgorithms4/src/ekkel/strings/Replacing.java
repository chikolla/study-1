package ekkel.strings;

import alg4s.basic.StdOut;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class Replacing {
    static String s = Splitting.knights;
    public static void main(String[] args){
        StdOut.print(s.replaceFirst("f\\w+" , "located"));
        StdOut.println();
        StdOut.print(s.replaceAll("Shrubbery|tree|herring", "banana"));
    }
}

package ekkel.strings;

import alg4s.basic.StdOut;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class IntegerMatch {
    public static void main(String[] args){
        StdOut.println("-1234".matches("-?\\d+"));
        StdOut.println("56780".matches("-?\\d+"));
        StdOut.println("+911".matches("-?\\d+"));
        StdOut.println("+911".matches("(-|\\+)?\\d+"));
    }
}

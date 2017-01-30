package ekkel.strings.exercises;

import algs4.basic.StdOut;

import java.util.regex.Pattern;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class Exercise7 {
    public static void main(String[] args){
        String sentence = "Who i am?";
        String sentence2 = "I am doctor.";
        StdOut.println(Pattern.matches("^[A-Z].+\\?$", sentence));
        StdOut.println(Pattern.matches("^[A-Z].+\\?$", sentence2));
        StdOut.println(Pattern.matches("^[A-Z].+\\.$", sentence));
        StdOut.println(Pattern.matches("^[A-Z].+\\.$", sentence2));

    }
}

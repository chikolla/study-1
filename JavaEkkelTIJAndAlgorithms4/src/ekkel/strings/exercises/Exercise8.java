package ekkel.strings.exercises;

import alg4s.basic.StdOut;
import ekkel.strings.Splitting;

import java.util.Arrays;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class Exercise8 {
    public static void main(String[] args){
        String sentence = Splitting.knights;
        StdOut.println(Arrays.toString(sentence.split("the")));
        Splitting.split("you");
    }
}

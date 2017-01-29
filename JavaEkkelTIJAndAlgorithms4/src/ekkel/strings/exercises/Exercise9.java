package ekkel.strings.exercises;

import alg4s.basic.StdOut;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class Exercise9 {
    public static void main(String[] args){
        String sentence  = "AAAQQQFASDASdkapdiqowgtuabcaub";
        StdOut.println(sentence.replaceAll("[auioeAUIOE]","_"));
    }
}

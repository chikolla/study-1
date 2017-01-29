package ekkel.strings.exercises;

import alg4s.basic.StdOut;

import java.util.regex.Pattern;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class Exercise11 {
    public static void main(String[] args){
        String regex = "(i?)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        String sentence = "Arline ate eight apples and one orange while Anita hadn’t any";
        StdOut.println(Pattern.matches(regex, sentence));
    }
}

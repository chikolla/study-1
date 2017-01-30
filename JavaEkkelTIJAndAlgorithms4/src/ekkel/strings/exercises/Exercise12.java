package ekkel.strings.exercises;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static algs4.basic.StdOut.println;

/**
 * Exercise 12: (5) Modify Groups.java to count all of the unique words that do not start
 with a capital letter.
 * Created by halfmediator on 28.01.2017.
 */
public class Exercise12 {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
    public static void main(String[] args){
        Matcher m = Pattern.compile("(\\b[a-z]\\w+\\b)").matcher(POEM);
        Set<String> set = new HashSet<String>();
        while(m.find()){
            for (int j=0; j<=m.groupCount(); j++)
                set.add(m.group(j));
        }
            println(set.size());

    }
}

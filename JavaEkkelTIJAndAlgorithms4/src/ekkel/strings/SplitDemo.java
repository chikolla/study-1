package ekkel.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

import static algs4.basic.StdOut.println;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input ="This!!unusual use!!of exclamation!!points";
        println(Arrays.toString(
                Pattern.compile("!!").split(input)));
        // Only do the first three:
        println(Arrays.toString(
                Pattern.compile("!!").split(input, 2)));
        println(Arrays.toString(input.split("!!")));
    }
}

package ekkel.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static algs4.basic.StdOut.println;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class Finding {
    public static void main(String[] args){
        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
        while(m.find())
            println(m.group()+ " ");
        int i = 0;
        while(m.find(i)){
            println(m.group()+ " " + i);
            i++;
        }
        println("total count: " + i);
    }
}

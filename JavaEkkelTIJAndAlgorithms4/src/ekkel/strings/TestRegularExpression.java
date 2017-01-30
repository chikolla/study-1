package ekkel.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static algs4.basic.StdOut.println;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class TestRegularExpression {
    public static void main(String[] args){
        if (args.length < 2){
            println("Usage:\njava TestRegularExpression characterSequence regularExpression+");
            System.exit(0);
        }
        println("Input: \"" + args[0]+"\"");
        for (String arg : args){
            println("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while(m.find()){
                println("Match \"" + m.group() + "\" at positions " + m.start() + "-" +(m.end() - 1));
            }
        }
    }
}

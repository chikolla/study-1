package ekkel.strings;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static algs4.basic.StdOut.print;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class TheReplacements {
    public static void main(String[] args) throws Exception {
        String s = TextFile.read("src/ekkel/strings/TheReplacements.java");
        // Match the specially commented block of text above:
        Matcher mInput =
                Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL)
                        .matcher(s);
        if(mInput.find())
            s = mInput.group(1); // Captured by parentheses
        // Replace two or more spaces with a single space:
        s = s.replaceAll(" {2,}", " ");
        // Replace one or more spaces at the beginning of each
        // line with no spaces. Must enable MULTILINE mode:
        s = s.replaceAll("(?m)^ +", "");

        s = s.replaceFirst("[aeiou]", "(VOWEL1)");
//        print(s);
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
//        // Process the find information as you
//        // perform the replacements:
        while(m.find())
            m.appendReplacement(sbuf, m.group().toUpperCase());
//        // Put in the remainder of the text:
//        println("=============");
        m.appendTail(sbuf);
//        println("=============");
        print(sbuf);
    }
}
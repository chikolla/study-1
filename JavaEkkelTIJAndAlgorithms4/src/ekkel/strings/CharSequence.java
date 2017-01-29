package ekkel.strings;

/**
 * CharBuffer, String, StringBuffer, StringBuilder implement this interface
 * Created by halfmediator on 28.01.2017.
 */
public interface CharSequence {
    char charAt(int i);
    int length();
    String subSequence(int start, int end);
    String toString();
}

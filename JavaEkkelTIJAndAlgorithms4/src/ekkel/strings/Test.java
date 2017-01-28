package ekkel.strings;

/**
 * Created by halfmediator on 28.01.2017.
 */
public class Test {
    public static void main(String[] args){
        String temp = "tempt";
        System.out.println(temp.length());
        System.out.println(temp.charAt(2));
        String q = temp.intern();
        System.out.println(q);

    }
}

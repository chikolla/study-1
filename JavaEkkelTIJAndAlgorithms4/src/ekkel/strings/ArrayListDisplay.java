package ekkel.strings;

import java.util.ArrayList;

/**
 * Created by halfmediator on 27.01.2017.
 */

public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<String> coffees = new ArrayList<String>();
        for(String c : (new String[]{"K", "A", "M", "Z", "Q"}))
            coffees.add(c);
        System.out.println(coffees);
    }
}
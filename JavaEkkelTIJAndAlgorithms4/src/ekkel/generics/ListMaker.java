package ekkel.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nugusbayevkk on 2/7/17.
 */
public class ListMaker<T> {
    List<T> create() { return new ArrayList<T>(); }
    public static void main(String[] args) {
        ListMaker<String> stringMaker= new ListMaker<String>();
        List<String> stringList = stringMaker.create();
    }
}

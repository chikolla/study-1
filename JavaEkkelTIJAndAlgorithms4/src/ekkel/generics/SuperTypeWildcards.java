package ekkel.generics;

import java.util.List;

/**
 * Created by nugusbayevkk on 2/7/17.
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // apples.add(new Fruit()); // Error
    }
}

package ekkel.typeinfo;

import algs4.basic.StdOut;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
class Building {}
class House extends Building {}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        StdOut.println(b.getClass());
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        StdOut.println(h.getClass());
        h = (House)b; // ... or just do this.
    }
}

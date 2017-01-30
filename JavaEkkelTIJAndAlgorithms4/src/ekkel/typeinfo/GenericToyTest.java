package ekkel.typeinfo;

import algs4.basic.StdOut;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
public class GenericToyTest {
    public static void main(String[] args){

        try {

            Class<FancyToy> ftClass = FancyToy.class;
            FancyToy fancyToy = ftClass.newInstance();
            Class<? super FancyToy> up = ftClass.getSuperclass();
            // This won’t compile:
//             Class<Toy> up2 = ftClass.getSuperclass();
            // Only produces Object:
//            Object obj = up.newInstance();
            StdOut.println(up.getClass());
            StdOut.println(up.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}

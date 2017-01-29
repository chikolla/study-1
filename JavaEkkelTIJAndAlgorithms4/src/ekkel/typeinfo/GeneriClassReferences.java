package ekkel.typeinfo;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
public class GeneriClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // To же самое
        intClass = double.class;
        // genericIntClass = double.class; // Недопустимо
    }
}

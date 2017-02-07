package ekkel.generics;

/**
 * Created by nugusbayevkk on 2/7/17.
 */
public class Erased<T> {
    private final int SIZE = 100;
    public static void f(Object arg) {
//        if(arg instanceof T) {}          // Error
//        T var = new T();                 // Error
//        T[] array = new T[SIZE];         // Error
//        T[] array = (T)new Object[SIZE]; // Unchecked warning
    }
}
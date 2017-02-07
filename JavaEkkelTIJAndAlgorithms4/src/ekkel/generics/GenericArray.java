package ekkel.generics;

/**
 * Created by nugusbayevkk on 2/7/17.
 */
public class GenericArray<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArray(int sz) {
        array = (T[])new Object[sz];
    }
    public void put(int index, T item) {
        array[index] = item;
    }
    public T get(int index) { return array[index]; }
    // Метод, предоставляющий доступ к базовому представлению:
    public T[] rep() { return array; }
    public static void main(String[] args) {
        GenericArray<Integer> gai =
                new GenericArray<Integer>(10);
        // Приводит к ClassCastException:
//         Integer[] ia = gai.rep();
        // А так можно
        Object[] oa = gai.rep();
    }
}

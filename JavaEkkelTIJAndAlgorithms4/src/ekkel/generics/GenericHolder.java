package ekkel.generics;

/**
 * Created by nugusbayevkk on 2/7/17.
 */
public class GenericHolder<T> {
    private T obj;
    public void set(T obj) { this.obj = obj; }
    public T get() { return obj; }
    public static void main(String[] args) {
        GenericHolder<Integer> holder =
                new GenericHolder<Integer>();
        holder.set(5);
        Integer s = holder.get();
    }
}

package algs4.basic.datastructures;

import java.util.NoSuchElementException;

/**
 * Created by halfmediator on 26.01.2017.
 */
public class StequeStack<T> {
    Stack<T> s1 = new Stack<>();
    Stack<T> s2 = new Stack<>();
    public boolean isEmpty (){ return s1.isEmpty() || s2.isEmpty();}
    public void push(T obj){
        s1.push(obj);
    }
    public void pop(){
        if (!s1.isEmpty()) s1.pop();
        else if (!s2.isEmpty()) s2.pop();
        else throw new NoSuchElementException();
    }
    public void enqueue(T obj){
        s2.push(obj);
    }
    @Override
    public String toString(){
        StringBuilder sb  = new StringBuilder();
        for (T t : s1)
            sb.append(t+" ");
        for (T t : s2)
            sb.append(t+" ");
        return sb.toString();
    }
    public static void main(String[] args){
        StequeStack<String> test = new StequeStack<>();
        test.push("A");
        test.push("B");
        test.push("C");
        test.pop();
        test.enqueue("O");
        test.enqueue("O");
        System.out.println(test);
    }
}

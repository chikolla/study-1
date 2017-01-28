package alg4s.basic.datastructures;

import alg4s.basic.StdOut;

import java.util.NoSuchElementException;

/**
 * Created by halfmediator on 26.01.2017.
 */
public class Deque3Stack<T> {
    private Stack<T> s_left;
    private Stack<T> s_middle;
    private Stack<T> s_right;
    private int N;

    public Deque3Stack(){
        s_left = new Stack<T>();
        s_right = new Stack<T>();
        s_middle = new Stack<T>();
        N = 0;
    }

    public void pushLeft(T item){
        s_left.push(item);
        N++;
    }
    public void pushRight(T item){
        s_right.push(item);
        N++;
    }
    public T popLeft(){
        T item;
        if (s_left.isEmpty() && s_right.isEmpty()) throw new NoSuchElementException();
        else if (!s_left.isEmpty()){
            return s_left.pop();
        } else {
            while(!s_right.isEmpty())
                s_middle.push(s_right.pop());
            item = s_middle.pop();
            N--;
            while (!s_middle.isEmpty())
                s_right.push((s_middle.pop()));
        }
        return item;
    }
    public T popRight(){
        T item;
        if (s_left.isEmpty() && s_right.isEmpty()) throw new NoSuchElementException();
        else if (!s_right.isEmpty()){
            return s_right.pop();
        } else {
            while(!s_left.isEmpty())
                s_middle.push(s_left.pop());
            item = s_middle.pop();
            N--;
            while (!s_middle.isEmpty())
                s_left.push((s_middle.pop()));
        }
        return item;
    }

    public static void main(String[] args){
        Deque3Stack d3stack = new Deque3Stack();
        d3stack.pushLeft("Kana");
        d3stack.pushLeft("Anna");

        StdOut.println(d3stack.popRight());
        StdOut.println(d3stack.popRight());
    }


}

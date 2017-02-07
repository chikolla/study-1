package ekkel.generics;

import algs4.basic.StdOut;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class LinkedStack<T> {
    private class Node{
        T item;
        Node next;
        Node() {item = null; next = null;}
        Node(T item, Node next){
            this.item = item;
            this.next = next;
        }
        boolean end() {return item == null && next == null;}
    }
    private Node top = new Node(); //end sentinel
    public void push(T item){
        top = new Node(item, top);
    }
    public T pop(){
        T result = top.item;
        if (!top.end())
            top = top.next;
        return result;
    }
    public static void main(String[] args){
        LinkedStack<String> lss = new LinkedStack<String>();
        for (String s:"Phassers on stun!".split(" "))
            lss.push(s);
        String s;
        while((s=lss.pop())!=null)
            StdOut.println(s);
    }
}

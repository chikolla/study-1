/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg4s.basic.datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author halfmediator
 */
public class Stack<Item> implements Iterable<Item> {

    private Node<Item> first;
    private int n;

    private static class Node<Item> {

        private Item item;
        private Node<Item> next;
    }

    public Stack() {
        first = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void push(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack overflow");
        }
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underlow");
        }
        return first.item;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    }

    /**
     * Returns an iterator to this stack that iterates through the items in LIFO
     * order.
     *
     * @return an iterator to this stack that iterates through the items in LIFO
     * order
     */
    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator<Item> implements Iterator<Item> {

        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    /**
     * Unit tests the {@code Stack} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
//        while (!StdIn.isEmpty()) {
//            String item = StdIn.readString();
//            if (!item.equals("-")) {
//                stack.push(item);
//            } else if (!stack.isEmpty()) {
//                StdOut.println(stack.pop() + " ");
//            }
//        }
//        StdOut.println("(" + stack.size() + " left on stack)");
    stack.push("it");
    stack.push("was");
    stack.push(" - ");
    stack.push("the");
    stack.push("-");
    stack.push("of");
    stack.push("times");
    stack.push("-");
    stack.push("-");
    stack.push("-");
    stack.push("it");
    stack.push("was");
    stack.push("-");
    stack.push("the");
    stack.push("-");
    stack.push("-");


    
    }

}

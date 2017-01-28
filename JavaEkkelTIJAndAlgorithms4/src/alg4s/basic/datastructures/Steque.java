/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg4s.basic.datastructures;

import alg4s.basic.StdOut;
import java.util.NoSuchElementException;

/**
 *
 * @author halfmediator
 */
public class Steque<Item> {

    private Node<Item> first;

    private class Node<Item> {

        Item item;
        Node<Item> next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(Item item) {
        if (first == null) {
            first = new Node<Item>();
            first.item = item;
        } else {
            Node<Item> oldfirst = first;
            first = new Node<Item>();
            first.item = item;
            first.next = oldfirst;
        }
    }

    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item returnvalue = first.item;
        first = first.next;
        return returnvalue;
    }

    public void enqueue(Item item) {
        if (first == null) {
            first = new Node<Item>();
            first.item = item;
        } else {
            Node<Item> current = first;
            Node<Item> next = first;
            while (next != null) {
                current = next;
                next = next.next;
            }
            next = new Node<Item>();
            next.item = item;
            current.next = next;
        }
    }

    public static void main(String[] args) {
        Steque<String> sq = new Steque();
        sq.push("a1");
        sq.enqueue("a3");
        sq.enqueue("a4");
        sq.enqueue("a2");
        sq.push("a3");
        StdOut.print(sq.pop());
        StdOut.print(sq.pop());
        StdOut.print(sq.pop());
        StdOut.print(sq.pop());
        StdOut.print(sq.pop());
//        StdOut.println(sq.pop());
    }
}

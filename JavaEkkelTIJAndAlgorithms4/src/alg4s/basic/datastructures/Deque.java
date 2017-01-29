/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg4s.basic.datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static alg4s.basic.StdOut.println;

/**
 *
 * @author halfmediator
 */
public class Deque<Item> implements Iterable<Item> {

    Node left;
    Node right;
    private int N;

  

    private class Node {

        Item item;
        Node next;
        Node prev;

        Node(Item item) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
    public Iterator<Item> iterator(){
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item> {

        private Node current;

        public DequeIterator() {
            this.current = left;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            } else {
                Node node = current;
                current = current.next;
                return node.item;
            }
        }
    }

    public Deque() {
        this.left = null;
        this.right = null;
        this.N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void pushLeft(Item item) {
        println("pushLeft");
        if (item == null) {
            throw new NullPointerException();
        }
        if (this.isEmpty()) {
            this.left = new Node(item);
            this.right = left;
        } else {
            Node node = new Node(item);
            node.next = this.left;
            this.left.prev = node;
            this.left = node;
        }
        println("left.prev" + left.prev + " left.item "+left.item + " left.next "+left.next);
        println("right.prev" + right.prev + " right.item "+right.item + " right.next "+right.next);
        N++;
    }

    public void pushRight(Item item) {
        if (item == null) {
            throw new NullPointerException();
        }
        if (this.isEmpty()) {
            this.right = new Node(item);
            this.left = right;
        } else {
            Node node = new Node(item);
            node.prev = this.right;
            this.right.next = node;
            this.right = node;
        }
        N++;
    }

    public Item popLeft() {
        if (this.isEmpty()) {
            throw new NullPointerException();
        }
        Item oldleftitem = left.item;
        this.left = this.left.next;
        if (this.left != null) {
            this.left.prev = null;
        } else {
            left = right = null;
        }
        N--;
        return oldleftitem;
    }
    public Item popRight(){
        if (this.isEmpty()) {
            throw new NullPointerException();
        }
        Item oldrightitem = right.item;
        this.right = this.right.prev;
        if (this.right != null) {
            this.right.next = null;
        } else {
            left = right = null;
        }
        N--;
        return oldrightitem;
    }
    public static void main(String[] args){
        Deque<String> d = new Deque<String>();
        d.pushLeft("l1");
        d.pushLeft("l2");
        d.pushLeft("l3");
        System.out.println(d.popRight());
        System.out.println(d.popLeft());
        System.out.println(d.popLeft());
    }
}

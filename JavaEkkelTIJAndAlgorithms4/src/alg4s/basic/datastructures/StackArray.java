package alg4s.basic.datastructures;

import alg4s.basic.StdOut;

import java.util.Iterator;

/**
 * Created by halfmediator on 26.01.2017.
 */
public class StackArray<Item> implements Iterable<Item> {

    private Item[] a = (Item[])new Object[1];
    private int N;
    public boolean isEmpty(){ return N == 0;}
    public int size() {return N;}
    public int arrSize() {return a.length;}
    private void resize(int max){
        Item[] temp = (Item[])new Object[max];
        for (int i=0; i<a.length; i++)
            temp[i] = a[i];
        a = temp;
    }
    public void push(Item item){
        if (a.length == N) resize(2*a.length);
        a[N++] = item;
    }
    public Item pop(){
        Item item = a[N--];
        a[N] = null;
        if (N > 0 && N == a.length/4) resize(a.length/2);
        return item;
    }
    public static void main(String[] args){
        StackArray<String> stack = new StackArray();
        stack.push("Kanagat");
        StdOut.printf("%d size , %d arraysize \n",stack.size(), stack.arrSize());
        stack.push("Kanagat2");
        StdOut.printf("%d size , %d arraysize \n",stack.size(), stack.arrSize());
        stack.push("Kanagat3");
        StdOut.printf("%d size , %d arraysize \n",stack.size(), stack.arrSize());
        stack.push("Kanagat");
        StdOut.printf("%d size , %d arraysize \n",stack.size(), stack.arrSize());
        stack.push("Kanagat2");
        StdOut.printf("%d size , %d arraysize \n",stack.size(), stack.arrSize());
        stack.push("Kanagat3");
        StdOut.printf("%d size , %d arraysize \n",stack.size(), stack.arrSize());
        stack.push("Kanagat2");
        StdOut.printf("%d size , %d arraysize \n",stack.size(), stack.arrSize());
        stack.push("Kanagat3");
        StdOut.printf("%d size , %d arraysize \n",stack.size(), stack.arrSize());
        stack.push("Kanagat3");
        StdOut.printf("%d size , %d arraysize \n",stack.size(), stack.arrSize());
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}

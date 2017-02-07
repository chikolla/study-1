package ekkel.generics.exercises;

import algs4.basic.StdOut;
import ekkel.typeinfo.pets.Cat;
import ekkel.typeinfo.pets.Dog;
import ekkel.typeinfo.pets.Pet;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class Exercise1<T> {
    private T t1;
    private T t2;
    private T t3;
    public Exercise1(T one, T two, T three){
        t1 = one; t2 = two; t3 = three;
    }
    public List<T> get(){
        return Arrays.asList(t1,t2,t3);
    }
    public String toString() {
        return "[" + t1.toString() + "]" + "[" + t2.toString() + "]"
                + "[" + t3.toString() + "]";
    }

    public static void main(String[] args){
        Pet p = new Pet();
        Dog d = new Dog();
        Cat c = new Cat();
        Exercise1<Pet> h = new Exercise1<Pet>(p,d,c);
        StdOut.println(h);
        List<Pet> l = h.get();
        for (int i =0;i< l.size(); i++){
            StdOut.println(l.get(i));
        }
    }
}

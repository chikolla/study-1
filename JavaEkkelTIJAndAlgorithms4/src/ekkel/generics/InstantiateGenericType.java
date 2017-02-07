package ekkel.generics;

import static algs4.basic.StdOut.print;

/**
 * Created by nugusbayevkk on 2/7/17.
 */

class ClassAsFactory<T> {
    T x;
    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee {}

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe =
                new ClassAsFactory<Employee>(Employee.class);
        print("ClassAsFactory<Employee> успех");
        try {
            ClassAsFactory<Integer> fi =
                    new ClassAsFactory<Integer>(Integer.class);
        } catch(Exception e) {
            print("ClassAsFactory<Integer> неудача");
        }
    }
}
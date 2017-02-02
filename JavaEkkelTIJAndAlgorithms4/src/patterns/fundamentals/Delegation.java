package patterns.fundamentals;

import algs4.basic.StdOut;

/**
 * Created by nugusbayevkk on 2/2/17.
 */
class A{
    void foo(){
        StdOut.println("A: call method foo()");
    }
    void bar(){
        StdOut.println("A: call method bar()");
    }
}
class B{
    // Create object, then to his object we delegate some behavior
    A a = new A();
    void foo(){
        a.foo();
    }
    void bar(){
        a.bar();
    }
}
public class Delegation {
    public static void main(String[] args){
        B b = new B();
        b.foo();
        b.bar();
    }
}

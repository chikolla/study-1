package ekkel.typeinfo;

import static algs4.basic.StdOut.print;
import static algs4.basic.StdOut.println;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
interface Interface{
    void doSomething();
    void somethingElse(String arg);
}
class RealObject implements  Interface{
    @Override
    public void doSomething() {println("Do SOmething");}
    @Override
    public void somethingElse(String arg) {println("Something else "+arg);}
}
class SimpleProxy implements  Interface{
    private Interface proxied;
    public SimpleProxy(Interface proxied) {this.proxied  = proxied;}
    @Override
    public void doSomething(){
        println("SimpleProxy doSOmething");
        proxied.doSomething();
    }
    @Override
    public void somethingElse(String arg) {
        println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}
public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}

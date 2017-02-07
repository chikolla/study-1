package ekkel.generics;

import algs4.basic.StdOut;
import net.mindview.util.Generator;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class GenericMethods {
    public <T> void f(T x){
        StdOut.println(x.getClass().getName());
    }
    public <T,U,G> void g(T t, U u, G g){
        StdOut.println(t.getClass().getName()+
        " " +u.getClass().getName() + " " + g.getClass().getName());
    }
    public <T,U> void e(T t, U u, int sum){
        StdOut.println(t.getClass().getName()+
                " " +u.getClass().getName() + " " + sum);
    }
    public static void main(String[] args){
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(5);
        gm.f(5.0);
        gm.f(5.0F);
        gm.f('c');
        gm.f(gm);
        gm.g(gm, gm, gm);
        gm.g(gm, 1.0f, 5);
        gm.e(gm, 5, 10);

    }
}

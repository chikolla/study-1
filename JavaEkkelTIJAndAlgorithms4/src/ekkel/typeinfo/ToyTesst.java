package ekkel.typeinfo;

import static algs4.basic.StdOut.print;
import static algs4.basic.StdOut.println;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
interface isHaveOwner{}
class Toy{
//    Toy(){}
    Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, isHaveOwner{
    FancyToy(){ super(1);}
}
public class ToyTesst {
    static void printInfo(Class cc){
        println("Class name:"+cc.getName() + " is interface? ["+ cc.isInterface() + "]");
        println("SimpleName " + cc.getSimpleName());
        println("CanonicalName " + cc.getCanonicalName());
    }
    public static void main(String[] args){
        Class c = null;
        try{
            c = Class.forName("ekkel.typeinfo.FancyToy");
        }catch(ClassNotFoundException e){
            print("Cant find FancyToy class");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance();
        }catch(InstantiationException e){
            print("Cannot instantiate");
            System.exit(1);
        }catch(IllegalAccessException e) {
            print("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}


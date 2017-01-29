package ekkel.typeinfo;

import alg4s.basic.StdOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static alg4s.basic.StdOut.print;
import static alg4s.basic.StdOut.println;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
class Candy{
    static { println("Loading Candy");}
}
class Gum{
    static { println("Loading Gum");}
}
class Cookie{
    static { println("Loading Cookie");}
}
public class SweetShop {
    public static void main(String[] args) {
        try {
            for (String className : args) {
                Class.forName("ekkel.typeinfo." + className);
            }
        }catch(ClassNotFoundException e){
            StdOut.println("Class not found");
        }
//        println("inside main");
//        new Candy();
//        println("After creating Candy");
//        try{
//            Class.forName("Gum");
//        } catch(ClassNotFoundException e){
//            println("Couldn't find Gum");
//        }
//        println("After Class.forName(\"Gum\")");
//        new Cookie();
//        println("After creating cookie");
    }
}

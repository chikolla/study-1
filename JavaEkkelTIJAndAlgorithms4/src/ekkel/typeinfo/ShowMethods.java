package ekkel.typeinfo;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static algs4.basic.StdOut.print;
import static algs4.basic.StdOut.println;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class ShowMethods {
    private static String usage = "usage:\n"
            + "ShowMethods qualified.class.name\n"
            + "To show all methods in class or:\n"
            + "ShowMethods qualified.class.name word\n"
            + "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args){

        if (args.length < 1){
            print(usage);
            System.exit(0);
        }
        int lines = 0;
        try{
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if (args.length == 1){
                for (Method method : methods){
                    println(p.matcher(method.toString()).replaceAll(""));
                }
                for (Constructor constructor: ctors){
                    println(p.matcher(constructor.toString()).replaceAll(""));
                }
                lines = methods.length + ctors.length;
            } else{

                for(Method method : methods)
                    if (method.toString().indexOf(args[1]) != -1) {
                        println(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }

                for(Constructor ctor : ctors)
                    if(ctor.toString().indexOf(args[1]) != -1) {
                        println(p.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
            }
        }catch(ClassNotFoundException e){
            print("No such class: " + e);
        }
    }
}

package ekkel.generics;

import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen =
                new BasicGenerator(CountedObject.class);
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
}

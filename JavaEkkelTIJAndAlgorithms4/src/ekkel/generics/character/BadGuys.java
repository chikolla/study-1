package ekkel.generics.character;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class BadGuys extends Guys {
    private static long counter = 0;
    private final long id = counter++;
    public String toString(){
        return getClass().getSimpleName()+" " + id;
    }
}

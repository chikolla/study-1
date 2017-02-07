package ekkel.generics.character;

import algs4.basic.StdOut;
import ekkel.generics.coffee.Coffee;
import ekkel.generics.coffee.CoffeeGenerator;
import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class StoryCharacters implements Generator<Guys>,Iterable<Guys>{
    private Class[] types={DarkVeider.class,Kolobok.class, Terminator.class};
    private Random rand = new Random(47);
    public StoryCharacters(){}
    private int size = 0;
    public StoryCharacters(int sz){size = sz;}
    public Guys next(){
        try{
            return (Guys)types[rand.nextInt(types.length)].newInstance();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    class CharacterIterator implements Iterator<Guys> {
        int count = size;
        @Override
        public boolean hasNext() {
            return count>0;
        }

        @Override
        public Guys next() {
            count--;
            return StoryCharacters.this.next();
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }
    public Iterator<Guys> iterator(){
        return new CharacterIterator();
    }
    public static void main(String[] args){
        StoryCharacters gen = new StoryCharacters();
        for(int i = 0; i<5; i++)
            StdOut.println(gen.next());
        for (Guys c: new StoryCharacters(5))
            StdOut.println(c);
    }
}

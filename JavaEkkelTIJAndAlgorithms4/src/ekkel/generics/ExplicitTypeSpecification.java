package ekkel.generics;

import ekkel.typeinfo.pets.Person;
import ekkel.typeinfo.pets.Pet;
import net.mindview.util.New;

import java.util.List;
import java.util.Map;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class ExplicitTypeSpecification {
    static void f(Map<Person,List<Pet>> getPeople){

    }
    public static void main(String[] args){
        f(New.<Person, List<Pet>>map());
    }
}

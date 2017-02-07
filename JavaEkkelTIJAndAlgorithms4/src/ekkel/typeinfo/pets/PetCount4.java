package ekkel.typeinfo.pets;

import static algs4.basic.StdOut.print;

/**
 * Created by nugusbayevkk on 2/5/17.
 */
public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for(Pet pet : Pets.createArray(20)) {
            print(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
}

package ekkel.typeinfo.pets;

import java.util.HashMap;

import static algs4.basic.StdOut.println;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
public class PetCount {

    static class PetCounter extends HashMap<String,Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if(quantity == null)
                put(type, 1);
            else
                put(type, quantity +1);
        }
    }

    public static void countPets(PetCreator creator) {
        PetCounter counter= new PetCounter();
        for(Pet pet : creator.createArray(20)) { // Подсчет всех объектов Pet:
            println(pet.getClass().getSimpleName() + " ");

            if(pet instanceof Pet) counter.count("Pet");
            if(pet instanceof Dog) counter.count("Dog");
            if(pet instanceof Mutt) counter.count("Mutt");
            if(pet instanceof Pug) counter.count("Pug");
            if(pet instanceof Cat) counter.count("Cat");
            if(pet instanceof EgyptianMau) counter.count("EgyptіanMau");
            if(pet instanceof Manx) counter.count("Manx");
            if(pet instanceof Cymtic) counter.count("Cymtic");
            if(pet instanceof Rodent) counter.count("Rodent");
            if(pet instanceof Rat) counter.count("Rat");
            if(pet instanceof Mouse) counter.count("Mouse");
            if(pet instanceof Hamster) counter.count("Hamster");
        }
        // Вывод результатов подсчета.
        println();
        println(counter);
    }
    public static void main(String[] args) {
        //countPets(new ForNameCreator());
        countPets(new LiteralPetCreator());
    }
}

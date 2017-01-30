package ekkel.typeinfo.pets;

import net.mindview.util.MapData;

import java.util.LinkedHashMap;
import java.util.Map;

import static algs4.basic.StdOut.println;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
public class PetCount3 {

    static class PetCounter extends LinkedHashMap<Class<? extends Pet>,Integer> {
        public PetCounter() {
            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }

        public void count(Pet pet) {
            // Class.isInstance() избавляет от множественных instanceof:
            for(Map.Entry<Class<? extends Pet>,Integer> pair: entrySet())
                if(pair.getKey().isInstance(pet))
                    put(pair.getKey(), pair.getValue() + 1);
        }

        @Override
        public String toString() {

            StringBuilder result = new StringBuilder("{");
            for(Map.Entry<Class<? extends Pet>,Integer> pair : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() -2, result.length());
            result.append("J");
            return result.toString();
        }
    }

    public static void main(String[] args) {
        PetCounter petCount = new PetCounter();
        for(Pet pet : Pets.createArray(20)) {
            println(pet.getClass().getSimpleName() + " ");
            petCount.count(pet);
        }
        println();
        println(petCount);

    }
}

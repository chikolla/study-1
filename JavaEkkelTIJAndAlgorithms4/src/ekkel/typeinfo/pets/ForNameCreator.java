package ekkel.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
public class ForNameCreator {

    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "ekkel.typeinfo.pets.Mutt",
            "ekkel.typeinfo.pets.Pug",
            "ekkel.typeinfo.pets.EgyptianMau",
            "ekkel.typeinfo.pets.Manx",
            "ekkel.typeinfo.pets.Cymtic",
            "ekkel.typeinfo.pets.Rat",
            "ekkel.typeinfo.pets.Mouse",
            "ekkel.typeinfo.pets.Hamster"
    };

    @SuppressWarnings("unchecked")
// загрузчик списка классов
    private static void loader() {
        try { //при загрузке класс приводится к типу заданному типизациии контейнера
            for(String name : typeNames)
                types.add((Class<? extends Pet>)Class.forName(name));
        }
        catch(ClassNotFoundException e)
        {throw new RuntimeException(e);}
    }
    // статический блок ОДНОКРТАНО загружающий список при инициализации данного класса
    static { loader(); }

    public List<Class<? extends Pet>> getTypes(){return types;}
}

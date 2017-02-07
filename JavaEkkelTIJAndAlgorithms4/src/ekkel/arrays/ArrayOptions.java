package ekkel.arrays;

import java.util.Arrays;

import static algs4.basic.StdOut.print;

/**
 * Created by nugusbayevkk on 2/7/17.
 */

public class ArrayOptions {
    public static void main(String[] args) {
        // Массивы объектов:
        BerylliumSphere[] a; // Локальная неинициализированная переменная
        BerylliumSphere[] b = new BerylliumSphere[5];
        // Ссылки в массиве автоматически инициализируются null:
        print("b: " + Arrays.toString(b));
        BerylliumSphere[] c = new BerylliumSphere[4];
        for(int i = 0; i < c.length; i++)
            if(c[i] == null) // Проверка ссылки на действительность
                c[i] = new BerylliumSphere();
        // Агрегатная инициализация:
        BerylliumSphere[] d = { new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere()
        };
        // Динамическая агрегатная инициализация:
        a = new BerylliumSphere[]{
                new BerylliumSphere(), new BerylliumSphere(),
        };
        // (Завершающая запятая не обязательна в обоих случаях)
        print("a.length = " + a.length);
        print("b.length = " + b.length);
        print("c.length = " + c.length);
        print("d.length = " + d.length);
        a = d;
        print("a.length = " + a.length);

        // Массивы примитивов:
        int[] e; // Ссылка null
        int[] f = new int[5];
        // Примитивы в массиве автоматически инициализируются нулями:
        print("f: " + Arrays.toString(f));
        int[] g = new int[4];
        for(int i = 0; i < g.length; i++)
            g[i] = i*i;
        int[] h = { 11, 47, 93 };
        // Ошибка компиляции переменная e не инициализирована:
        //!print("e.length = " + e.length);
        print("f.length = " + f.length);
        print("g.length = " + g.length);
        print("h.length = " + h.length);
        e = h;
        print("e.length = " + e.length);
        e = new int[]{ 1, 2 };
        print("e.length = " + e.length);
    }
}

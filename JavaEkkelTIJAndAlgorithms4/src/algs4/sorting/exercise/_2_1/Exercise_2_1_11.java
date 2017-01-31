package algs4.sorting.exercise._2_1;

import algs4.basic.StdOut;

import static algs4.basic.StdOut.print;

/**
 * Created by nugusbayevkk on 1/31/17.
 */
public class Exercise_2_1_11 {
    private static int[] step= new int[1];
    private static int pointer=0;
    public static void resize(int max){
        int[] temp = new int[max];
        for (int i=0; i< step.length; i++)
            temp[i] = step[i];
        step = temp;
    }
    public static void sort(Comparable[] a){
        //Sort a[] into increasing order
        int N = a.length;
        step[pointer] = 1;
   while (step[pointer] < N/3) {
            if (pointer+1 == step.length) {
                resize(2*step.length);
            }
            pointer++;
            step[pointer] = 3*step[pointer-1]+1;
        }// 1 4 13 40 121 364

        while (pointer >= 0 && step[pointer] >= 1){ //h sort the array
            for (int i=step[pointer]; i < N; i++){
                for (int j=i; j>=step[pointer] &&less(a[j], a[j-step[pointer]]); j-=step[pointer])
                    exch(a, j, j-step[pointer]);
            }
            pointer--;
        }
    }
    public static boolean less(Comparable c1, Comparable c2){
        return c1.compareTo(c2) < 0;
    }
    public static void exch(Comparable[] a, int q, int p){
        Comparable t=a[q]; a[q]=a[p]; a[p]=t;
    }
    public static void main(String[] args){
        Integer[] a = new Integer[]{1, 5,3,2, 10,1,13,12,14};
        sort(a);
        for (Integer t : a)
            print(" " + t);
    }
}

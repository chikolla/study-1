package algs4.chapter1_5;

import alg4s.basic.StdIn;
import alg4s.basic.StdOut;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
public class UF {
    private int[] id; // acces to component id (site indexed)
    private int count; // number of components
    public UF(int N){ // Initialize component id array
        count = N;
        id = new int[N];
        for (int i =0; i< N; i++)
            id[i] = i;
    }
    public int count(){
        return count;
    }
    public String print(){
        StringBuilder sb = new StringBuilder();
        for (int i:id)
            sb.append(i+" ");
        return sb.toString();
    }
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }
    public  int find(int p){
        return id[p];
    }
    private int quick_find(int p){
        while (p != id[p]) p=id[p];
        return p;
    }

    public void union(int p, int q){
        int pID = find(p);
        int qID = find(q);
        if (pID == qID) return;
        for (int i = 0; i < id.length; i++){
            if (id[i] == pID) id[i] = qID;
        }
        count--;

    }
    public void quick_union(int p, int q){
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) return;
        id[pRoot] = qRoot;
        count--;
    }
    public static void main(String[] args){
        int N = 10;
        UF uf = new UF(N);
        StdOut.println(uf.connected(5,4));
        uf.union(1,5);
        uf.union(2,3);
        StdOut.println(uf.print());
        StdOut.println(uf.count() + " components");

    }

}


package algs4.chapter1_5;

import alg4s.basic.StdIn;
import alg4s.basic.StdOut;

/**
 * Created by nugusbayevkk on 1/29/17.
 */
public class WeightedQuickUnionUF
{
    private int[] id;
    // parent link (site indexed)
    private int[] sz;
    // size of component for roots (site indexed)
    private int count;
    // number of components
    public WeightedQuickUnionUF(int N)
    {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
        sz = new int[N];
        for (int i = 0; i < N; i++) sz[i] = 1;
    }
    public int count()
    { return count; }
    public boolean connected(int p, int q)
    { return find(p) == find(q); }
    private int find(int p)
    { // Follow links to find a root.
        while (p != id[p]) p = id[p];
        return p;
    }public void union(int p, int q) {
    int i = find(p);
    int j = find(q);
    if (i == j) return;
// Make smaller root point to larger one.
    if
            (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
    else
    { id[j] = i; sz[i] += sz[j]; }
    count--;
    }
    public static void main(String[] args) {
        int N = StdIn.readInt();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(N);

        // read in a sequence of pairs of integers (each in the range 0 to N-1),
        // calling find() for each pair: If the members of the pair are not already
        // call union() and print the pair.
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println("# components: " + uf.count());
    }
}

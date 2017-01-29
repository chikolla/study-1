package algs4.theory.chpater1_4;

/**
 * Created by halfmediator on 25.01.2017.
 */
public class FibonacciSearch {
    public int min(int a, int b){
        return a < b ? a : b;
    }
    public int search(int[] arr, int x, int n){
        /*Init fibonacci nums*/
        int fibMMm2 = 0; // (m-2)'s Fibonacci No.
        int fibMMm1 = 1; // (m-1)'s Fibonacci No.
        int fibM = fibMMm2 + fibMMm1; //m'ths Fibonacci No
        while (fibM < n){
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm1 + fibMMm2;
        }
        int offset = -1;
        while (fibM > 1) {
            // Check if fibMm2 is a valid location
            int i = min(offset + fibMMm2, n - 1);

			/*
			 * If x is greater than the value at index fibMm2, cut the subarray
			 * array from offset to i
			 */
            if (arr[i] < x) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            }
            	/*
			 * If x is greater than the value at index fibMm2, cut the subarray
			 * after i+1
			 */
            else if (arr[i] > x) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            }

			/* element found. return index */
            else
                return i;
        }
        /* comparing the last element with x */
        if (fibMMm1 != 0 && arr[offset + 1] == x)
            return offset + 1;

		/* element not found. return -1 */
        return -1;
    }
    int fbsearch(int[] arry, int target) {
        int fm1 = 1;
        int fm2 = 0;
        int fm0 = fm1 + fm2;
        while (fm0 < arry.length) {
            fm2 = fm1;
            fm1 = fm0;
            fm0 = fm1 + fm2;
        }
        int offset = -1;
        while (fm1 > 0) {
            int mid = min((offset + fm1), arry.length - 1);
            if (arry[mid] == target)
                return mid;
            else if (arry[mid] < target) {
                fm0 = fm2;
                fm1 = fm1 - fm2;
                fm2 = fm2 - fm1;
                offset = mid;
            } else {
                fm0 = fm1;
                fm1 = fm2;
                fm2 = fm0 - fm1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arry[] = new int[100];
        for (int i = 0; i < 100; i++) {
            arry[i] = i + 8;
        }
        FibonacciSearch fs = new FibonacciSearch();
        for (int i : arry) {
            // System.out.println(fs.search(arry, i));
            // System.out.println(fs.search(arry, i, arry.length));
            System.out.println(fs.fbsearch(arry, i));
        }
        // System.out.println(fs.fbsearch(arry, -1887));
    }
}

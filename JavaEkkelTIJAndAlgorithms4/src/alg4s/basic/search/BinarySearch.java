/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg4s.basic.search;

import alg4s.basic.StdOut;

import java.util.Arrays;

/**
 *
 * @author halfmediator
 */
public class BinarySearch {

    public static int rank(int[] A, int key) {
        if (null == A) {
            return -1;
        }
        int len = A.length;
        return rank(A, key, 0, len - 1);
    }

    private static int rank(int[] A, int key, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == key) {
                int temp = mid;
                while(temp!=0){
                    temp--;
                    if (A[mid] == A[temp]) mid = temp;
                    else break;
                }
                return mid;
            } else if (key < A[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = new int[]{9,2,3,4,4,5,6,7,8,1};
        Arrays.sort(a);
        StdOut.print(rank(a, 4));
    }
}

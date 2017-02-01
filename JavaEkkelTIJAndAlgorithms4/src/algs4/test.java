package algs4;

import algs4.basic.StdOut;

/**
 * Created by nugusbayevkk on 2/1/17.
 */
public class test {
    public static void main(String[] args) {
        StdOut.println(approveTicket(120));
    }
    // assert that man cannot leave big than 100 year**
    static boolean approveTicket(int age){
        assert(age>60&&age<=110):"Age entered is " +age;
        if (age>60){
            return true;
        } else {
            return false;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg4s.basic.geometry;

import alg4s.basic.search.Counter;

import java.awt.*;

/**
 *
 * @author halfmediator
 */
public class Print2D {

    public static void main(String[] args) {
        double xlo = .2;
        double xhi = .4;
        double ylo = .5;
        double yhi = .6;
        int T = 10000;

        Interval1D x = new Interval1D(xlo, xhi);
        Interval1D y = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(x, y);
        box.draw();

        Counter c = new Counter("hits");
        for (int t = 0; t < T; t++) {
            int xx = (int) Math.random();
            int yy = (int) Math.random();
            Point pp = new Point(xx, yy);

        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg4s.basic;

import java.util.Random;

/**
 *
 * @author halfmediator
 */
public class StdRandom {

    private static Random random; // pseudo-random number generator
    private static long seed; //pseudo random number generaot seed

    static {
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }

    private StdRandom() {
    }

    /**
     * Sets the seed of the pseudorandom number generator. This method enables
     * you to produce the same sequence of "random"
     *
     * @param s the seed
     */
    public static void setSeed(long s) {
        seed = s;
        random = new Random(seed);
    }

    public static long getSeed() {
        return seed;
    }

    /**
     * Returns a random real number uniformly in [0, 1]
     *
     * @return a random real number uniformly in [0, 1]
     */
    public static double uniform() {
        return random.nextDouble();
    }

    public static int uniform(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("argument must be positive");
        }
        return random.nextInt(n);
    }

    /**
     *
     * @return @deprecated Replaced by {@link #uniform()}.
     */
    @Deprecated
    public static double random() {
        return uniform();
    }

    public static int uniform(int a, int b) {
        if ((b <= a) || ((long) b - a >= Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("invalid range [" + a + "," + b + "]");
        }
        return a + uniform(b - a);
    }

    public static double uniform(double a, double b) {
        if (!(a < b)) {
            throw new IllegalArgumentException("invalid range [" + a + "," + b + "]");
        }
        return a + uniform() * (b - a);
    }

    /**
     * Returns a random boolean from a Bernoulli distribution with success
     * probability <em>p</em>.
     *
     * @param p the probability of returning {@code true}
     * @return {@code true} with probability {@code p} and {@code false} with
     * probability {@code p}
     * @throws IllegalArgumentException unless {@code 0} &le; {@code p} &le;
     * {@code 1.0}
     */
    public static boolean bernoulli(double p) {
        if (!(p >= 0.0 && p <= 1.0)) {
            throw new IllegalArgumentException("probability p must be between 0.0 and 1.0");
        }
        return uniform() < p;
    }

    public static boolean bernoulli() {
        return bernoulli(0.5);
    }

    /**
     * Return a random real number from a standard Gaussian distribution.
     *
     * @return a random real number from a standart Gaussian distribution (mean
     * 0 and standart deviation 1)
     */
    public static double gaussian() {
        double r, x, y;
        do {
            x = uniform(-1.0, 1.0);
            y = uniform(-1.0, 1.0);
            r = x * x + y * y;
        } while (r >= 1 || r == 0);
        return x * Math.sqrt(-2 * Math.log(r) / r);

        //Remark : y * Math.sqrt(-2 * Math.log(r) / r)
        // is an independent random gaussian 
    }

    public static double gaussian(double mu, double sigma) {
        return mu + sigma * gaussian();
    }

}

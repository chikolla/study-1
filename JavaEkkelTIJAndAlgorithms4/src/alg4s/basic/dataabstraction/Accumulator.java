package alg4s.basic.dataabstraction;

/**
 * Created by halfmediator on 24.01.2017.
 */
public class Accumulator    {
        private double total;
        private int N;
        public void addDataValue(double val)
        {
            N++;
            total += val;
        }
        public double mean()
        { return total/N; }
        public String toString()
        { return "Mean (" + N + " values): "
                + String.format("%7.5f", mean()); }
    }



package low_level.double_solution;

import high_level.Mutation;

import java.util.Random;

public class Mutation_low implements Mutation<Double> {
    @Override
    public Double apply(Double actual, Random random) {
        return actual + (random.nextDouble() * 0.1 - 0.005);
    }
}

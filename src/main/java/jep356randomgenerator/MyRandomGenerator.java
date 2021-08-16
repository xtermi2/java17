package jep356randomgenerator;

import java.util.Random;
import java.util.random.RandomGenerator;

/**
 * Provide new interface types and implementations for pseudorandom number generators (PRNGs),
 * including jumpable PRNGs and an additional class of splittable PRNG algorithms (LXM).
 */
public class MyRandomGenerator implements RandomGenerator {

    @Override
    public long nextLong() {
        // my super random long
        return new Random().nextLong();
    }
}

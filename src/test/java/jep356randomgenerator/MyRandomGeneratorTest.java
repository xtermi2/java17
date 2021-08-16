package jep356randomgenerator;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class MyRandomGeneratorTest {

    private final RandomGenerator underTest = new MyRandomGenerator();

    @Test
    void nextLong_should_return_a_random_lomg_value() {
        final int size = 100;
        final Set<Long> randomLongs = IntStream.range(0, size)
                .mapToObj(i -> underTest.nextLong())
                .collect(Collectors.toSet());

        assertThat(randomLongs)
                .hasSize(size);
    }
}
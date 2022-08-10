package unittest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import starter.utils.Multiplier;

import static org.assertj.core.api.Assertions.assertThat;

class UnitTestExample {

    static Multiplier multiplier;

    @BeforeAll
    static void beforeAll() {
        multiplier = new Multiplier();
    }

    @Test
    void someUnitTest() {
        assertThat(multiplier.multiply(1, 3)).isEqualTo(3);
    }

    @Test
    void anotherUnitTest() {
        assertThat(multiplier.multiply(2, 3)).isEqualTo(6);
    }

    @Test
    void thirdUnitTest() {
        assertThat(multiplier.multiply(3, 3)).isEqualTo(9);
    }
}

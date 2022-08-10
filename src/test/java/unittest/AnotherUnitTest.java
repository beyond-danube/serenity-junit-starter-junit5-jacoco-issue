package unittest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import starter.utils.Divider;

import static org.assertj.core.api.Assertions.assertThat;

public class AnotherUnitTest {

    static Divider divider;

    @BeforeAll
    static void beforeAll() {
        divider = new Divider();
    }

    @Test
    void divideTest() {
        assertThat(divider.divide(3, 1)).isEqualTo(3);
    }

    @Test
    void anotherDivideTest() {
        assertThat(divider.divide(3, 3)).isEqualTo(1);
    }

    @Test
    void thirdDivideTest() {
        assertThat(divider.divide(6, 3)).isEqualTo(2);
    }
}

package codesquad.airbnb;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AirbnbTest {

    @Test
    @DisplayName("Test case 1) 1 == 1")
    void test1() {
        assertThat(1).isEqualTo(1);
    }

    @Test
    @DisplayName("Test case 2) 2 > 1")
    void test2() {
        assertThat(2).isGreaterThan(1);
    }
}

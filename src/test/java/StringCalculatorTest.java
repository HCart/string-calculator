import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    void initTest() {
        this.stringCalculator = new StringCalculator();
    }

    @Test
    @DisplayName("[1] should return 1")
    void should_add_input_string_and_returns_it() {
        assertEquals("1", stringCalculator.add("1"));
    }

    @Test
    @DisplayName("[] should return 0]")
    void add_empty_string_should_return_zero() {
        assertEquals("0", stringCalculator.add(""));
    }

    @Test
    @DisplayName("[1,2] should return 3]")
    void should_return_the_sum_of_input_numbers_separated_by_commas() {
        assertEquals("3", stringCalculator.add("1,2"));
    }

    @Test
    @DisplayName("[0,2.2] should return 3.3]")
    void should_return_the_sum_of_input_doubles_separated_by_commas() {
        assertEquals("3.3", stringCalculator.add("1.1,2.2"));
    }

    @Test
    @DisplayName("[0,2.2] should return 2.2]")
    void should_return_the_sum_of_input_doubles_and_a_zero_separated_by_commas() {
        assertEquals("2.2", stringCalculator.add("0,2.2"));
    }
}

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    static StringCalculator stringCalculator;

    @BeforeAll
    static void initTests() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void addOneStringNumberReturnsIt() {
        String result = stringCalculator.add("1");
        assertEquals("1", result);
    }

    @Test
    void addTwoStringsNumbersReturnsSum() {
        String result = stringCalculator.add("1.1,2.2");
        assertEquals("3.3", result);
    }

    @Test
    void addManyStringsNumbersReturnsSum() {
        String result = stringCalculator.add("1.1,2.2,3.3,4.4,5.5");
        assertEquals("16.5", result);
    }

    @Test
    void addEmptyStringReturnsZero() {
        String result = stringCalculator.add("");
        assertEquals("0", result);
    }
}

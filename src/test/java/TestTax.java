import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TestTax {
    @ParameterizedTest
    @CsvSource({"-1", "-100","123"})
    void calc1(int i) {
        final Tax tax = new Tax();
        assertThrows(IllegalAccessException.class, () -> tax.calc(i));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void calc2(int i, double expected) {
        System.out.println(i);
        Tax tax = new Tax();
        try {
            Assertions.assertEquals(expected, tax.calc(i), 0.01);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
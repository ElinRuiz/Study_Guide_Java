package lessons.lessons2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculusTest {
    private Calculus systemUnderTest;

    @BeforeEach
    public void setUp() {
        systemUnderTest = new Calculus();
        System.out.println("Codigo comun: ");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29})
    public void primesArePrime(int n) {
        // Action
        boolean actual = systemUnderTest.isPrime(n);

        // Assert
        assertThat(actual).isEqualTo(true);
    }

    @org.junit.jupiter.api.Test
    public void negativeCreateException() {
        // Arrange
        System.out.println("negativeCreateException: ");
        int n = -2;

        // Action and Assert
        assertThatThrownBy(() -> systemUnderTest.isPrime(n))
                .isInstanceOf(ArithmeticException.class);
    }
}

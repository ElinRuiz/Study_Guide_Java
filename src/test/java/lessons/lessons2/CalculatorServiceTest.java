package lessons.lessons2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorServiceTest {

    private CalculatorService systemUnderTest;

    @BeforeEach
    public void setUp() {
        systemUnderTest = new CalculatorService();
        System.out.println("Setting up CalculatorService instance...");
    }

    @Test
    public void shouldAddTwoNumbers() {
        System.out.println("shouldAddTwoNumbers:");
        // Arrange
        int a = 5, b = 3;
        int expected = 8;

        // Act
        int actual = systemUnderTest.add(a, b);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        System.out.println("shouldSubtractTwoNumbers:");
        // Arrange
        int a = 10, b = 6;
        int expected = 4;

        // Act
        int actual = systemUnderTest.subtract(a, b);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        System.out.println("shouldMultiplyTwoNumbers:");
        // Arrange
        int a = 4, b = 5;
        int expected = 20;

        // Act
        int actual = systemUnderTest.multiply(a, b);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        System.out.println("shouldDivideTwoNumbers:");
        // Arrange
        int a = 9, b = 3;
        int expected = 3;

        // Act
        int actual = systemUnderTest.divide(a, b);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldThrowExceptionWhenDivideByZero() {
        System.out.println("shouldThrowExceptionWhenDivideByZero:");
        // Arrange
        int a = 5, b = 0;

        // Act & Assert
        assertThatThrownBy(() -> systemUnderTest.divide(a, b))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Division by zero is not allowed");
    }
}

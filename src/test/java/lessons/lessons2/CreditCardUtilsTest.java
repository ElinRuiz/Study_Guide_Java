package lessons.lessons2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CreditCardUtilsTest {

    private CreditCardUtils systemUnderTest;

    @BeforeEach
    public void setUp() {
        systemUnderTest = new CreditCardUtils();
        System.out.println("Setting up CreditCardUtils instance...");
    }

    @Test
    public void shouldValidateValidCardNumber() {
        System.out.println("shouldValidateValidCardNumber:");
        // Arrange
        String cardNumber = "4532015112830366"; // Valid Luhn

        // Act
        boolean isValid = systemUnderTest.isValid(cardNumber);

        // Assert
        assertThat(isValid).isTrue();
    }

    @Test
    public void shouldInvalidateWrongCardNumber() {
        System.out.println("shouldInvalidateWrongCardNumber:");
        // Arrange
        String cardNumber = "4532015112830367"; // Invalid Luhn

        // Act
        boolean isValid = systemUnderTest.isValid(cardNumber);

        // Assert
        assertThat(isValid).isFalse();
    }

    @Test
    public void shouldMaskCardNumber() {
        System.out.println("shouldMaskCardNumber:");
        // Arrange
        String cardNumber = "4532015112830366";

        // Act
        String masked = systemUnderTest.mask(cardNumber);

        // Assert
        assertThat(masked).isEqualTo("************0366");
    }

    @Test
    public void shouldThrowExceptionForNull() {
        System.out.println("shouldThrowExceptionForNull:");
        // Arrange
        String cardNumber = null;

        // Act & Assert
        assertThatThrownBy(() -> systemUnderTest.isValid(cardNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Card number cannot be null");
    }

    @Test
    public void shouldThrowExceptionForShortCardNumber() {
        System.out.println("shouldThrowExceptionForShortCardNumber:");
        // Arrange
        String cardNumber = "123";

        // Act & Assert
        assertThatThrownBy(() -> systemUnderTest.isValid(cardNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Card number must be at least 13 digits");
    }
}

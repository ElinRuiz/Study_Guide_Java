package lessons.lessons2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class calculusTest {
    private calculus systemUnderTest;

    @BeforeEach
    public void setUp() {
        systemUnderTest = new calculus();
        System.out.println("Codigo comun: ");

    }

    @Test
    public void twoIsPrime() {
        System.out.println("twoIsPrime: ");
        //Arrange
        int n = 2;
        boolean actual;
        boolean expected = true;

        //Action
        actual = systemUnderTest.isPrime(n);

        //Assert
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void negativeCreateException() {
        System.out.println("negativeCreateException: ");

        //Arrange
        int n = -2;

        //Action and Assert
        //
        assertThatThrownBy(() -> systemUnderTest.isPrime(n))
                .isInstanceOf(ArithmeticException.class);

    }

}

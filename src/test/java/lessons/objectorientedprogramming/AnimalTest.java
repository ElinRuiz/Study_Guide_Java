package lessons.objectorientedprogramming;

import lessons.objectorientedprogramming.model.Animal;
import lessons.objectorientedprogramming.model.Cat;
import lessons.objectorientedprogramming.model.Chihuahua;
import lessons.objectorientedprogramming.model.Dog;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AnimalTest {
    private Animal animal;

    @Test
    void catMeows() {
        // Arrange
        animal = new Cat();
        String expected = "Meow";

        // Action
        String actual = animal.doAction();

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void chihuahaIsLazy() {
        // Arrange
        animal = new Chihuahua();
        String expected = "Meh!";

        // Action
        String actual = animal.doAction();

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void chihuahaKnowsIsAChihuahua() {
        // Arrange
        animal = new Chihuahua();
        String expected = "Chihuahua";

        // Action
        String actual = animal.whatAmI();

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    void chihuahaIsADog() {
        // Arrange
        animal = new Chihuahua();
        boolean expected = true;

        // Action
        boolean actual = animal instanceof Dog;

        // Assert
        assertThat(actual).isEqualTo(expected);
    }
}

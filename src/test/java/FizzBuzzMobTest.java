import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzMobTest {
    @Test
    void convertsOne() {
        assertEquals("1", new FizzBuzzMob().convert(1));
    }

    @Test
    void convertsTwo() {
        assertEquals("2", new FizzBuzzMob().convert(2));
    }

    @Test
    void convertsFour() {
        assertEquals("4", new FizzBuzzMob().convert(4));
    }
    @Test
    void convertsThree() {
        assertEquals("Fizz", new FizzBuzzMob().convert(3));
    }

}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzMobTest {
    private FizzBuzzMob fizzBuzzMob;
    @BeforeEach
    public void setUp() {
        fizzBuzzMob = new FizzBuzzMob();
    }

    @Test
    void convertsOne() {
        assertEquals("1", fizzBuzzMob.convert(1));
    }

    @Test
    void convertsTwo() {
        assertEquals("2", fizzBuzzMob.convert(2));
    }

    @Test
    void convertsFour() {
        assertEquals("4", fizzBuzzMob.convert(4));
    }
    @Test
    void convertsThree() {
        assertEquals("Fizz", fizzBuzzMob.convert(3));
    }

    @Test
    void convertsSix() {
        assertEquals("Fizz", fizzBuzzMob.convert(6));
    }

}
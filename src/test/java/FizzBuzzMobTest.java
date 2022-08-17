import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzMobTest {
    @Test
    void convertsOne() {
        assertEquals("1", new FizzBuzzMob().convert(1));
    }

}
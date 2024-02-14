package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void evenOddNumber() {
        assertTrue(Main.evenOddNumber(0)); // Число 0 является четным
        assertTrue(Main.evenOddNumber(2)); // Число 2 является четным
        assertFalse(Main.evenOddNumber(3)); // Число 3 является нечетным
        assertTrue(Main.evenOddNumber(-4)); // Число -4 является четным
        assertFalse(Main.evenOddNumber(-5)); // Число -5 является нечетным
    }

    @Test
    void NumberInInterval() {
        assertTrue(Main.numberInInterval(26)); // число 26 попадает в интервал (25;100)
        assertTrue(Main.numberInInterval(50)); // число 50 попадает в интервал (25;100)
        assertTrue(Main.numberInInterval(99)); // число 99 попадает в интервал (25;100)
        assertFalse(Main.numberInInterval(25)); // число 25 не попадает в интервал (25;100)
        assertFalse(Main.numberInInterval(100)); // число 100 не попадает в интервал (25;100)
        assertFalse(Main.numberInInterval(10)); // число 10 не попадает в интервал (25;100)
    }
}
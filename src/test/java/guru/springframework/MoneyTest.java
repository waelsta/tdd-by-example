package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    void multiplicationTest(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));

        Money fiVe = Money.dinar(5);
        assertEquals(Money.dinar(10), fiVe.times(2));
        assertEquals(Money.dinar(15), fiVe.times(3));
    }

    @Test
    void EqualityTest(){
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
        assertEquals(Money.dinar(5), Money.dinar(5));
        assertNotEquals(Money.dinar(5), Money.dinar(8));
    }

    @Test
    void currencyTest() {
        assertEquals("TND",Money.dinar(1).currency());
        assertEquals("USD",Money.dollar(1).currency());
    }

}

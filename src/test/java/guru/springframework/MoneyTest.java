package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void DollarMultiplicationTest(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assertions.assertEquals(new Dollar(10),product);
        product = five.times(3);
        Assertions.assertEquals(new Dollar(15),product);
    }

    @Test
    void DollarEqualityTest(){
        Assertions.assertEquals(new Dollar(5), new Dollar(5));
        Assertions.assertNotEquals(new Dollar(5), new Dollar(6));
        Assertions.assertNotEquals(new Dollar(1),new Dinar(1));
    }


    @Test
    void DinarMultiplicationTest(){
        Dinar five = new Dinar(5);
        Dinar product = five.times(2);
        Assertions.assertEquals(new Dinar(10),product);
        product = five.times(3);
        Assertions.assertEquals(new Dinar(15),product);
    }

    @Test
    void DinarEqualityTest(){
        Assertions.assertEquals(new Dinar(5), new Dinar(5));
        Assertions.assertNotEquals(new Dinar(5), new Dinar(6));
    }

}

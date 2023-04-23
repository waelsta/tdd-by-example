package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void DollarMultiplicationTest(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assertions.assertEquals(10,product);
        product = five.times(3);
        Assertions.assertEquals(15,product);
    }

    @Test
    void DollarEqualityTest(){
        Assertions.assertEquals(new Dollar(5), new Dollar(5));
        Assertions.assertNotEquals(new Dollar(5), new Dollar(6));
    }


}

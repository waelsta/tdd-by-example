package guru.springframework;

public class Dinar extends Money{
    public Dinar(int amount) {
        super(amount,"TND");
    }

    public Dinar times(int multiplier) {
       return new Dinar(amount * multiplier);
    }
}

package guru.springframework;

public class Dinar extends Money{
    public Dinar(int amount) {
        this.amount = amount;
    }

    public Dinar times(int multiplier) {
       return new Dinar(amount * multiplier);
    }
}

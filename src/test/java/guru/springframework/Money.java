package guru.springframework;

public class Money {

    protected int amount;
    public boolean equals(Object money) {
        Money coin = (Money)money;
        return coin.amount == amount && this.getClass().equals(money.getClass());
    }
}

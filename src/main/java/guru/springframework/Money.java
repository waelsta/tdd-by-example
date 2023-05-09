package guru.springframework;

public class Money {

    protected int amount;
    protected static String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount,"USD");
    }

    public static Money dinar(int amount) {
        return new Money(amount,"TND");
    }

    public String currency(){
        return currency;
    }

    public boolean equals(Object money) {
        Money coin = (Money)money;
        return coin.amount == amount && this.currency().equals(coin.currency());
    }

    //since times method might return different types of currencies we will make it abstract and implement it in child classes
    public Money times(int multiplier){
        return new Money(multiplier * amount,this.currency());
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}

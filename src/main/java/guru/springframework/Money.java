package guru.springframework;

public abstract class Money {

    protected int amount;
    protected static String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money dinar(int amount) {
        return new Dinar(amount);
    }

    public String currency(){
        return currency;
    }

    public boolean equals(Object money) {
        Money coin = (Money)money;
        return coin.amount == amount && this.getClass().equals(money.getClass());
    }

    //since times method might return different types of currencies we will make it abstract and implement it in child classes
    public abstract Money times(int multiplier);
}

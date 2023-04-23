package guru.springframework;

public class Dinar {
    private int amount;
    public Dinar(int amount) {
        this.amount = amount;
    }

    public Dinar times(int multiplier) {
       return new Dinar(amount * multiplier);
    }

    public boolean equals(Object object){
        Dinar dinar = (Dinar) object;
        return dinar.amount == amount;
    }
}

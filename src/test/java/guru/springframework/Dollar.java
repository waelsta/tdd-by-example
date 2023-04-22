package guru.springframework;

public class Dollar {
    public double amount;

    public Dollar(double amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        amount *= multiplier;
    }
}

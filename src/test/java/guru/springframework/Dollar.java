package guru.springframework;

public class Dollar {
    private double amount;

    public Dollar(double amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar obj = (Dollar)object;
        return obj.amount == amount;
    }
}

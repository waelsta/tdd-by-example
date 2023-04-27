package guru.springframework;

public class Dollar extends Money{

    public Dollar(int amount) {
        super(amount,"USD");
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}

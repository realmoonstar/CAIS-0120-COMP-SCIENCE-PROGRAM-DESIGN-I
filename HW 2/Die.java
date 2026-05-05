public class Die {

    private int value;
    private int total;

    public Die() {
        value = 0;
        total = 0;
    }

    public int roll() {
        value = (int)(6 * Math.random()) + 1;
        total += value;
        return value;
    }

    public int getTotal() {
        return total;
    }

    public void reset() {
        total = 0;
    }
}

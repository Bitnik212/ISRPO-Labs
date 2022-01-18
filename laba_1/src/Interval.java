import java.util.HashMap;

public class Interval {

    private HashMap<Integer, Integer> intervals = new HashMap<>();

    public Interval() {
        this.intervals.put(1, 10);
    }

    public boolean calc(double number) {
        for (int value: this.intervals.values()) {
            if (Double.max(number, value) == number ) {

            }
        }
        return false;
    }

}

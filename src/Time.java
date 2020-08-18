import java.util.concurrent.atomic.DoubleAccumulator;

public class Time {
    public static void main(String[] args) {
        int seconds = 1990000;
        int days  = seconds / (24 * 60 * 60);
        int hours = seconds / days;
        int minutes;
        System.out.println("Дней: " + days);
    }
}

package sample.utils;

public class Percent {

    private double percentageOfAmount(double sum, int percent) {
        return sum * percent / 100;
    }

    private double totalAmount(double sum, int percent) {
        return sum + percentageOfAmount(sum, percent);
    }

    public int roundedTotalAmount(double sum, int percent) {
        return ((int)Math.round(totalAmount(sum, percent)));
    }
}

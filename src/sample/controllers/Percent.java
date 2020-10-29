package sample.controllers;

public class Percent {

    double percentageOfAmount(double sum, int percent) {
        return sum * percent / 100;
    }

    double totalAmount(double sum, int percent) {
        return sum + percentageOfAmount(sum, percent);
    }

    int roundedTotalAmount(double sum, int percent) {
        return ((int)Math.round(totalAmount(sum, percent)));
    }
}

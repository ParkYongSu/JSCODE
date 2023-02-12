package jscode4;

public class Calculator {
    private final String owner;

    public Calculator(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public int add(int value1, int value2) {
        return value1 + value2;
    }

    public int minus(int value1, int value2) {
        return value1 - value2;
    }

    public int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public double divide(double value1, double value2) {
        return value1 / value2;
    }

    public double divide(String value1, String value2) {
        return Double.parseDouble(value1) / Double.parseDouble(value2);
    }
}

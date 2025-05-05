package javafinalcalc;

public class Calculator {
    private double num1, num2, total;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        total = num1 + num2;
    }

    public void subtract() {
        total = num1 - num2;
    }

    public void multiply() {
        total = num1 * num2;
    }

    public double getTotal() {
        return total;
    }
}

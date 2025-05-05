package javacalcwmenu;

public class Calculator2 {
    private double num1;
    private double num2;
    private double total;

    public Calculator2(double num1, double num2) {
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

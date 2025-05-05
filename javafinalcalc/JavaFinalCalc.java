package javafinalcalc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaFinalCalc {
    static JFrame frame;
    static JPanel panel;
    static JLabel num1Label;
    static JLabel num2Label;
    static JLabel resultLabel;
    static JTextField num1Field;
    static JTextField num2Field;
    static JTextField resultField;
    static JButton addButton;
    static JButton subButton;
    static JButton mulButton;

    public static void main(String[] args) {
        frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 240);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        panel = new JPanel(null);
        panel.setBackground(Color.WHITE);

        num1Label = new JLabel("Number 1:");
        num1Label.setBounds(20, 20, 80, 25);
        panel.add(num1Label);

        num1Field = new JTextField();
        num1Field.setBounds(110, 20, 180, 25);
        panel.add(num1Field);

        num2Label = new JLabel("Number 2:");
        num2Label.setBounds(20, 60, 80, 25);
        panel.add(num2Label);

        num2Field = new JTextField();
        num2Field.setBounds(110, 60, 180, 25);
        panel.add(num2Field);

        resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 100, 80, 25);
        panel.add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(110, 100, 180, 25);
        resultField.setEditable(false);
        panel.add(resultField);

        addButton = new JButton("+");
        addButton.setBounds(20, 140, 80, 30);
        addButton.addActionListener(new User());
        panel.add(addButton);

        subButton = new JButton("-");
        subButton.setBounds(110, 140, 80, 30);
        subButton.addActionListener(new User());
        panel.add(subButton);

        mulButton = new JButton("×");
        mulButton.setBounds(200, 140, 80, 30);
        mulButton.addActionListener(new User());
        panel.add(mulButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static class User implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            Calculator calc = new Calculator(n1, n2);

            if (e.getSource() == addButton) {
                calc.add();
            } else if (e.getSource() == subButton) {
                calc.subtract();
            } else if (e.getSource() == mulButton) {
                calc.multiply();
            }

            resultField.setText(String.format("%.2f", calc.getTotal()));
        }
    }
}

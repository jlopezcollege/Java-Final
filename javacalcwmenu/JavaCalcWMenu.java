// src/javacalcwmenu/JavaCalcWMenu.java
package javacalcwmenu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaCalcWMenu {
    static JFrame frame;
    static JPanel panel;
    static JLabel num1Label, num2Label, resultLabel;
    static JTextField num1Field, num2Field, resultField;
    static JButton addButton, subButton, mulButton;
    static JMenuItem addMenuItem, subMenuItem, mulMenuItem;
    static JMenuItem topAddItem, topSubItem, topMulItem;

    public static void main(String[] args) {
        frame = new JFrame("Calculator w/ Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 260);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // ─── Menu bar ─────────────────────────────────────────────────────
        JMenuBar menuBar = new JMenuBar();

        // "Options" dropdown
        JMenu options = new JMenu("Options");
        addMenuItem = new JMenuItem("Add");
        subMenuItem = new JMenuItem("Subtract");
        mulMenuItem = new JMenuItem("Multiply");
        addMenuItem.addActionListener(new User());
        subMenuItem.addActionListener(new User());
        mulMenuItem.addActionListener(new User());
        options.add(addMenuItem);
        options.add(subMenuItem);
        options.add(mulMenuItem);
        menuBar.add(options);

        // Top‐level menu items
        topAddItem = new JMenuItem("Add");
        topSubItem = new JMenuItem("Subtract");
        topMulItem = new JMenuItem("Multiply");
        topAddItem.addActionListener(new User());
        topSubItem.addActionListener(new User());
        topMulItem.addActionListener(new User());
        menuBar.add(topAddItem);
        menuBar.add(topSubItem);
        menuBar.add(topMulItem);

        frame.setJMenuBar(menuBar);

        // ─── Main panel ───────────────────────────────────────────────────
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
            Calculator2 calc = new Calculator2(n1, n2);

            Object src = e.getSource();
            if (src == addButton || src == addMenuItem || src == topAddItem) {
                calc.add();
            } else if (src == subButton || src == subMenuItem || src == topSubItem) {
                calc.subtract();
            } else if (src == mulButton || src == mulMenuItem || src == topMulItem) {
                calc.multiply();
            }

            resultField.setText(String.format("%.2f", calc.getTotal()));
        }
    }
}

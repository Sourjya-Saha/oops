import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener {
    JTextField display;
    JButton[] numButtons = new JButton[10];
    JButton add, sub, mul, div, clr, eq;
    char operator;
    double num1, num2, result;
    public Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        for (int i = 0; i <= 9; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
        }
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        eq = new JButton("=");
        clr = new JButton("C");
        JButton[] ops = {add, sub, mul, div, eq, clr};
        for (JButton b : ops) {
            b.addActionListener(this);
        }
        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(add);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(sub);
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(mul);
        panel.add(clr);
        panel.add(numButtons[0]);
        panel.add(eq);
        panel.add(div);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9') {
            display.setText(display.getText() + cmd);
        } else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
            num1 = Double.parseDouble(display.getText());
            operator = cmd.charAt(0);
            display.setText("");
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': 
                    if (num2 == 0) {
                        display.setText("Error");
                        return;
                    }
                    result = num1 / num2; 
                    break;
            }
            display.setText(String.valueOf(result));
        } else if (cmd.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
        }
    }
    public static void main(String[] args) {
        new Calculator();
    }
}

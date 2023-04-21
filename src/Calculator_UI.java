import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_UI extends JFrame implements ActionListener {

    private Container c;
    private JTextField tf_Input;
    private JTextField tf_Output;
    private JButton bt_addition;
    private JButton bt_subtraction;
    private JButton bt_multiplication;
    private JButton bt_division;
    private JButton bt_equal;
    private JButton bt_zero;
    private JButton bt_one;
    private JButton bt_two;
    private JButton bt_three;
    private JButton bt_four;
    private JButton bt_five;
    private JButton bt_six;
    private JButton bt_seven;
    private JButton bt_eight;
    private JButton bt_nine;
    private JButton bt_point;
    private JButton bt_clear;
    private JButton bt_delete;
    private JButton bt_lastAnswer;

    protected Calculator_UI() {

        setTitle("Calculator");
        setSize(375, 450);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0x123456));

        c = getContentPane();
        c.setLayout(null);

        tf_Input = new JTextField("");
        tf_Input.setSize(340, 45);
        tf_Input.setLocation(10, 10);
        tf_Input.setFont(new Font("Arial", Font.PLAIN, 24));
        tf_Input.setEditable(false);
        tf_Input.setBackground(new Color(0x404040));
        tf_Input.setForeground(Color.WHITE);
        c.add(tf_Input);

        tf_Output = new JTextField("");
        tf_Output.setSize(340, 45);
        tf_Output.setLocation(10, 65);
        tf_Output.setFont(new Font("Arial", Font.PLAIN, 24));
        tf_Output.setEditable(false);
        tf_Output.setBackground(new Color(0x404040));
        tf_Output.setForeground(Color.WHITE);
        c.add(tf_Output);

        bt_delete = new JButton("del");
        bt_delete.setFont(new Font("Arial", Font.BOLD, 17));
        bt_delete.setBounds(290, 130, 60, 60);
        bt_delete.setFocusable(false);
        bt_delete.setBackground(new Color(0x90a4ae));
        bt_delete.addActionListener(this);
        c.add(bt_delete);

        bt_clear = new JButton("c");
        bt_clear.setFont(new Font("Arial", Font.BOLD, 22));
        bt_clear.setBounds(220, 130, 60, 60);
        bt_clear.setFocusable(false);
        bt_clear.setBackground(new Color(0x90a4ae));
        bt_clear.addActionListener(this);
        c.add(bt_clear);

        bt_division = new JButton("/");
        bt_division.setBounds(290, 200, 60, 60);
        bt_division.setFont(new Font("Arial", Font.BOLD, 22));
        bt_division.setFocusable(false);
        bt_division.setBackground(new Color(0x90a4ae));
        bt_division.addActionListener(this);
        c.add(bt_division);

        bt_multiplication = new JButton("*");
        bt_multiplication.setBounds(220, 200, 60, 60);
        bt_multiplication.setFont(new Font("Arial", Font.BOLD, 22));
        bt_multiplication.setFocusable(false);
        bt_multiplication.setBackground(new Color(0x90a4ae));
        bt_multiplication.addActionListener(this);
        c.add(bt_multiplication);

        bt_addition = new JButton("+");
        bt_addition.setFont(new Font("Arial", Font.BOLD, 22));
        bt_addition.setBounds(290, 270, 60, 60);
        bt_addition.setFocusable(false);
        bt_addition.setBackground(new Color(0x90a4ae));
        bt_addition.addActionListener(this);
        c.add(bt_addition);

        bt_subtraction = new JButton("-");
        bt_subtraction.setBounds(220, 270, 60, 60);
        bt_subtraction.setFont(new Font("Arial", Font.BOLD, 22));
        bt_subtraction.setFocusable(false);
        bt_subtraction.setBackground(new Color(0x90a4ae));
        bt_subtraction.addActionListener(this);
        c.add(bt_subtraction);

        bt_equal = new JButton("=");
        bt_equal.setBounds(220, 340, 130, 60);
        bt_equal.setFont(new Font("Arial", Font.BOLD, 20));
        bt_equal.setFocusable(false);
        bt_equal.setBackground(new Color(0x99CCFF));
        bt_equal.addActionListener(this);
        c.add(bt_equal);

        bt_one = new JButton("1");
        bt_one.setBounds(10, 270, 60, 60);
        bt_one.setFont(new Font("Arial", Font.BOLD, 20));
        bt_one.setFocusable(false);
        bt_one.setBackground(new Color(0x404040));
        bt_one.setForeground(Color.WHITE);
        bt_one.addActionListener(this);
        c.add(bt_one);

        bt_two = new JButton("2");
        bt_two.setBounds(80, 270, 60, 60);
        bt_two.setFont(new Font("Arial", Font.BOLD, 20));
        bt_two.setFocusable(false);
        bt_two.setBackground(new Color(0x404040));
        bt_two.setForeground(Color.WHITE);
        bt_two.addActionListener(this);
        c.add(bt_two);

        bt_three = new JButton("3");
        bt_three.setBounds(150, 270, 60, 60);
        bt_three.setFont(new Font("Arial", Font.BOLD, 20));
        bt_three.setFocusable(false);
        bt_three.setBackground(new Color(0x404040));
        bt_three.setForeground(Color.WHITE);
        bt_three.addActionListener(this);
        c.add(bt_three);

        bt_four = new JButton("4");
        bt_four.setBounds(10, 200, 60, 60);
        bt_four.setFont(new Font("Arial", Font.BOLD, 20));
        bt_four.setFocusable(false);
        bt_four.setBackground(new Color(0x404040));
        bt_four.setForeground(Color.WHITE);
        bt_four.addActionListener(this);
        c.add(bt_four);

        bt_five = new JButton("5");
        bt_five.setBounds(80, 200, 60, 60);
        bt_five.setFont(new Font("Arial", Font.BOLD, 20));
        bt_five.setFocusable(false);
        bt_five.setBackground(new Color(0x404040));
        bt_five.setForeground(Color.WHITE);
        bt_five.addActionListener(this);
        c.add(bt_five);

        bt_six = new JButton("6");
        bt_six.setBounds(150, 200, 60, 60);
        bt_six.setFont(new Font("Arial", Font.BOLD, 20));
        bt_six.setFocusable(false);
        bt_six.setBackground(new Color(0x404040));
        bt_six.setForeground(Color.WHITE);
        bt_six.addActionListener(this);
        c.add(bt_six);

        bt_seven = new JButton("7");
        bt_seven.setBounds(10, 130, 60, 60);
        bt_seven.setFont(new Font("Arial", Font.BOLD, 20));
        bt_seven.setFocusable(false);
        bt_seven.setBackground(new Color(0x404040));
        bt_seven.setForeground(Color.WHITE);
        bt_seven.addActionListener(this);
        c.add(bt_seven);

        bt_eight = new JButton("8");
        bt_eight.setBounds(80, 130, 60, 60);
        bt_eight.setFont(new Font("Arial", Font.BOLD, 20));
        bt_eight.setFocusable(false);
        bt_eight.setBackground(new Color(0x404040));
        bt_eight.setForeground(Color.WHITE);
        bt_eight.addActionListener(this);
        c.add(bt_eight);

        bt_nine = new JButton("9");
        bt_nine.setBounds(150, 130, 60, 60);
        bt_nine.setFont(new Font("Arial", Font.BOLD, 20));
        bt_nine.setFocusable(false);
        bt_nine.setBackground(new Color(0x404040));
        bt_nine.setForeground(Color.WHITE);
        bt_nine.addActionListener(this);
        c.add(bt_nine);

        bt_zero = new JButton("0");
        bt_zero.setBounds(80, 340, 60, 60);
        bt_zero.setFont(new Font("Arial", Font.BOLD, 22));
        bt_zero.setFocusable(false);
        bt_zero.setBackground(new Color(0x404040));
        bt_zero.setForeground(Color.WHITE);
        bt_zero.addActionListener(this);
        c.add(bt_zero);

        bt_point = new JButton(".");
        bt_point.setBounds(150, 340, 60, 60);
        bt_point.setFont(new Font("Arial", Font.BOLD, 20));
        bt_point.setFocusable(false);
        bt_point.setBackground(new Color(0x404040));
        bt_point.setForeground(Color.WHITE);
        bt_point.addActionListener(this);
        c.add(bt_point);

        bt_lastAnswer = new JButton("ans");
        bt_lastAnswer.setBounds(10, 340, 60, 60);
        bt_lastAnswer.setFont(new Font("Arial", Font.BOLD, 15));
        bt_lastAnswer.setFocusable(false);
        bt_lastAnswer.setBackground(new Color(0x404040));
        bt_lastAnswer.setForeground(Color.WHITE);
        bt_lastAnswer.addActionListener(this);
        c.add(bt_lastAnswer);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String number = ((JButton) e.getSource()).getText();

        if (e.getSource() == bt_clear) {
            tf_Input.setText("");
        } else if (e.getSource() == bt_delete) {
            String str = tf_Input.getText();
            if (str.length() > 0) {
                str = str.substring(0, str.length() - 1);
                tf_Input.setText(str);
            }
        } else if (number.equals("=")) {
            // Do Nothing
        } else if (number.equals("ans")) {
            if (tf_Output.getText().contains("a")) {
                // Do Nothing
                tf_Output.setText("");
            } else {
                tf_Input.setText(tf_Output.getText());
            }
        } else {
            tf_Input.setText(tf_Input.getText() + number);
        }

        if (e.getSource() == bt_equal) {
            Calculate cal = new Calculate(tf_Input.getText());
            String output = cal.toString();
            tf_Output.setText(output);
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

    JLabel l1,l2;
    JTextField textField1, textField2;
    JButton add, sub, mul, div;
    Calculator () {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        l1 = new JLabel("Calculator");
        l1.setFont(new Font("Times New Roman",Font.BOLD,30));
        l1.setForeground(Color.BLACK);
        l1.setBounds(100,10,300,30);
        add(l1);

        textField1 = new JTextField(60);
        textField2 = new JTextField(60);
        add = new JButton("ADD");
        sub = new JButton("SUB");
        mul = new JButton("MUL");
        div = new JButton("DIV");

        l2 = new JLabel("Result:");
        l2.setBounds(100,110,200,30);
        add(l2);

        textField1.setBounds(40,60,120,30);
        textField2.setBounds(180,60,120,30);

        add.setBounds(100,160,60,30);
        sub.setBounds(180,160,60,30);
        mul.setBounds(100,200,60,30);
        div.setBounds(180,200,60,30);

        add(textField1);
        add(textField2);
        add(add);
        add(sub);
        add(mul);
        add(div);

        add.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int no1 = Integer.parseInt(textField1.getText());
                int no2 = Integer.parseInt(textField2.getText());
                l2.setText("Sum of two numbers is : " + (no1 + no2));
            }
        });

        sub.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int no1 = Integer.parseInt(textField1.getText());
                int no2 = Integer.parseInt(textField2.getText());
                l2.setText("Sub of two numbers is : " + (no1 - no2));
            }
        });

        mul.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int no1 = Integer.parseInt(textField1.getText());
                int no2 = Integer.parseInt(textField2.getText());
                l2.setText("Mul of two numbers is : " + (no1 * no2));
            }
        });

        div.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int no1 = Integer.parseInt(textField1.getText());
                int no2 = Integer.parseInt(textField2.getText());
                l2.setText("Div of two numbers is : " + (no1 % no2));
            }
        });
    }
}

class SimpleCalculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setBounds(400,200,350,300);
        c.setVisible(true);
    }
}

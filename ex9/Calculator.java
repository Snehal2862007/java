package ex9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField tf;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton add,sub,mul,div,equal,clear,sq,cube,sqrt;

    double num1, num2, result;
    String operator;

    Calculator() {

        setTitle("Swing Calculator");
        setSize(350,400);
        setLayout(new BorderLayout());

        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        add(tf, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,4,5,5));

        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");

        add=new JButton("+");
        sub=new JButton("-");
        mul=new JButton("*");
        div=new JButton("/");
        equal=new JButton("=");
        clear=new JButton("C");
        sq=new JButton("Square");
        cube=new JButton("Cube");
        sqrt=new JButton("Sqrt");

        JButton[] buttons = {b7,b8,b9,add,
                             b4,b5,b6,sub,
                             b1,b2,b3,mul,
                             b0,clear,equal,div,
                             sq,cube,sqrt};

        for(JButton b: buttons){
            panel.add(b);
            b.addActionListener(this);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String cmd = e.getActionCommand();

        if(cmd.matches("[0-9]")) {
            tf.setText(tf.getText()+cmd);
        }

        else if(cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
            num1 = Double.parseDouble(tf.getText());
            operator = cmd;
            tf.setText("");
        }

        else if(cmd.equals("=")) {

            num2 = Double.parseDouble(tf.getText());

            switch(operator){
                case "+": result=num1+num2; break;
                case "-": result=num1-num2; break;
                case "*": result=num1*num2; break;
                case "/": result=num1/num2; break;
            }

            tf.setText(String.valueOf(result));
        }

        else if(cmd.equals("Square")) {
            double n = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(n*n));
        }

        else if(cmd.equals("Cube")) {
            double n = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(n*n*n));
        }

        else if(cmd.equals("Sqrt")) {
            double n = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(Math.sqrt(n)));
        }

        else if(cmd.equals("C")) {
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

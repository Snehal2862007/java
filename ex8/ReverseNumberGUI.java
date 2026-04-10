import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberGUI extends JFrame implements ActionListener
{
    JLabel l1, l2;
    JTextField t1, t2;
    JButton btn;

    ReverseNumberGUI()
    {
        setTitle("Reverse Number");
        setSize(300,200);
        setLayout(new FlowLayout());

        l1 = new JLabel("Enter Number:");
        t1 = new JTextField(10);

        l2 = new JLabel("Reverse:");
        t2 = new JTextField(10);
        t2.setEditable(false);

        btn = new JButton("Reverse");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(btn);

        btn.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        String input = t1.getText();
        int num = Integer.parseInt(input);
        int rev = 0;

        while(num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        t2.setText(String.valueOf(rev));
    }

    public static void main(String args[])
    {
        new ReverseNumberGUI();
    }
}
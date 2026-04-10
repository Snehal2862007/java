import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI extends JFrame implements ActionListener
{
    JLabel label;
    JTextField text;
    JButton up, down, reset;

    int count = 6;

    CounterGUI()
    {
        setTitle("Counter");
        setSize(300,200);
        setLayout(new FlowLayout());

        label = new JLabel("Counter");

        text = new JTextField(5);
        text.setText(String.valueOf(count));

        up = new JButton("Count Up");
        down = new JButton("Count Down");
        reset = new JButton("Reset");

        add(label);
        add(text);
        add(up);
        add(down);
        add(reset);

        up.addActionListener(this);
        down.addActionListener(this);
        reset.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==up)
        {
            count++;
            text.setText(String.valueOf(count));
        }

        if(e.getSource()==down)
        {
            count--;
            text.setText(String.valueOf(count));
        }

        if(e.getSource()==reset)
        {
            count = 0;
            text.setText(String.valueOf(count));
        }
    }

    public static void main(String args[])
    {
        new CounterGUI();
    }
}
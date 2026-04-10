import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener
{
    JRadioButton male, female;
    JButton submit;
    ButtonGroup bg;
    JLabel result;

    RadioButtonDemo()
    {
        setTitle("Gender Selection");
        setSize(300,200);
        setLayout(new FlowLayout());

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        submit = new JButton("Submit");

        result = new JLabel("Select Gender");

        add(male);
        add(female);
        add(submit);
        add(result);

        submit.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(male.isSelected())
        {
            result.setText("Selected Gender: Male");
        }
        else if(female.isSelected())
        {
            result.setText("Selected Gender: Female");
        }
        else
        {
            result.setText("Please select a gender");
        }
    }

    public static void main(String args[])
    {
        new RadioButtonDemo();
    }
}

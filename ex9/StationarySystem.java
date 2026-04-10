package ex9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StationarySystem extends JFrame {
    private JCheckBox chkNotebook, chkPen, chkPencil;
    private JButton btnOrder;

    public StationarySystem() {
        setTitle("Stationary Purchase System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));

        JLabel title = new JLabel("Stationary Purchase System");
        title.setFont(new Font("Arial", Font.BOLD, 16));
        add(title);

        // Checkboxes with prices
        chkNotebook = new JCheckBox("Notebook @ 50");
        chkPen = new JCheckBox("Pen @ 30");
        chkPencil = new JCheckBox("Pencil @ 10");

        add(chkNotebook);
        add(chkPen);
        add(chkPencil);

        btnOrder = new JButton("Order");
        add(btnOrder);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processOrder();
            }
        });
    }

    private void processOrder() {
        StringBuilder summary = new StringBuilder();
        double totalBill = 0;

        // Logic for Notebook
        if (chkNotebook.isSelected()) {
            String qtyStr = JOptionPane.showInputDialog(this, "Enter Quantity for Notebook");
            if (qtyStr != null) {
                int qty = Integer.parseInt(qtyStr);
                double total = qty * 50;
                summary.append("Notebook Quantity: ").append(qty).append(" Total: ").append(total).append("\n");
                totalBill += total;
            }
        }

        // Logic for Pen
        if (chkPen.isSelected()) {
            String qtyStr = JOptionPane.showInputDialog(this, "Enter Quantity for Pen");
            if (qtyStr != null) {
                int qty = Integer.parseInt(qtyStr);
                double total = qty * 30;
                summary.append("Pen Quantity: ").append(qty).append(" Total: ").append(total).append("\n");
                totalBill += total;
            }
        }

        // Logic for Pencil
        if (chkPencil.isSelected()) {
            String qtyStr = JOptionPane.showInputDialog(this, "Enter Quantity for Pencil");
            if (qtyStr != null) {
                int qty = Integer.parseInt(qtyStr);
                double total = qty * 10;
                summary.append("Pencil Quantity: ").append(qty).append(" Total: ").append(total).append("\n");
                totalBill += total;
            }
        }

        if (totalBill > 0) {
            summary.append("\nTotal: ").append(totalBill);
            // Final Summary Message
            JOptionPane.showMessageDialog(this, summary.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
            // Success Alert
            JOptionPane.showMessageDialog(this, "Successfully Ordered.", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Please select at least one item.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StationarySystem().setVisible(true);
        });
    }
}


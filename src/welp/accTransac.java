import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

package welp;


public class accTransac extends JFrame {
    private JButton viewButton;
    private JLabel resultLabel;

    public accTransac() {
        setTitle("Account Transaction Viewer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        viewButton = new JButton("View Transactions");
        buttonPanel.add(viewButton);

        resultLabel = new JLabel("", SwingConstants.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        mainPanel.add(resultLabel, BorderLayout.CENTER);

        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showTransactions();
            }
        });

        add(mainPanel);
        setVisible(true);
    }

    private void showTransactions() {
        // Replace this with actual logic to fetch and display transactions
        String transactions = "Transaction 1: ₱100\r\n" + "Transaction 2: ₱200\r\n" + "Transaction 3: ₱50";
        resultLabel.setText(transactions);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new accTransac();
            }
        });
    }
}

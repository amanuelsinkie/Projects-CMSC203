package assignment3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CryptoGUI extends JFrame {

    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JTextField keyField;
    private JTextField bellasoField;
    private JButton encryptButton;
    private JButton decryptButton;

    public CryptoGUI() {
        initializeComponents();
        setLayout(new GridLayout(3, 2));
        add(new JLabel("Input Text:"));
        add(new JScrollPane(inputTextArea));
        add(new JLabel("Output Text:"));
        add(new JScrollPane(outputTextArea));
        add(new JLabel("Key (Caesar):"));
        add(keyField);
        add(new JLabel("Bellaso Key:"));
        add(bellasoField);
        add(encryptButton);
        add(decryptButton);

        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performEncryption();
            }
        });

        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performDecryption();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeComponents() {
        inputTextArea = new JTextArea();
        outputTextArea = new JTextArea();
        keyField = new JTextField();
        bellasoField = new JTextField();
        encryptButton = new JButton("Encrypt");
        decryptButton = new JButton("Decrypt");
    }

    private void performEncryption() {
        String inputText = inputTextArea.getText().toUpperCase();
        int key = Integer.parseInt(keyField.getText());
        String bellasoKey = bellasoField.getText().toUpperCase();

        outputTextArea.setText("Caesar Encryption:\n" + CryptoManager.encryptCaesar(inputText, key)
                + "\n\nBellaso Encryption:\n" + CryptoManager.encryptBellaso(inputText, bellasoKey));
    }

    private void performDecryption() {
        String inputText = inputTextArea.getText().toUpperCase();
        int key = Integer.parseInt(keyField.getText());
        String bellasoKey = bellasoField.getText().toUpperCase();

        outputTextArea.setText("Caesar Decryption:\n" + CryptoManager.decryptCaesar(inputText, key)
                + "\n\nBellaso Decryption:\n" + CryptoManager.decryptBellaso(inputText, bellasoKey));
    }

    public static void main(String[] args) {
        new CryptoGUI();
    }
}
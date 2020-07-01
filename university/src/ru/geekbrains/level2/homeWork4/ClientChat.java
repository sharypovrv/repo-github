package ru.geekbrains.level2.homeWork4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ClientChat extends JFrame {

    public ClientChat() {
        setTitle("Client Chat");
        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea chat = new JTextArea("Чат:\n");
        chat.setEnabled(false);
        chat.setFont(new Font("Dialog", Font.ITALIC, 14));
        chat.setBounds(0, 0, 500, 300);
        add(BorderLayout.CENTER, chat);

        JTextArea sendText = new JTextArea(5, 30);
        sendText.setLineWrap(true);
        sendText.setWrapStyleWord(true);
        sendText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    if (!sendText.getText().equals("")) {
                        StringBuilder sb = new StringBuilder(chat.getText());
                        sb.append(sendText.getText());
                        sb.append("\n");
                        chat.setText(sb.toString());
                        sendText.setText("");
                    }
                    e.consume();
                }
            }
        });

        JScrollPane scroller = new JScrollPane(sendText);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!sendText.getText().equals("")) {
                    StringBuilder sb = new StringBuilder(chat.getText());
                    sb.append(sendText.getText());
                    sb.append("\n");
                    chat.setText(sb.toString());
                    sendText.setText("");
                }

            }
        });

        JPanel panel1 = new JPanel();
        panel1.add(BorderLayout.CENTER, scroller);
        panel1.add(BorderLayout.EAST,sendButton);
        add(BorderLayout.SOUTH, panel1);

        setResizable(false);
        setVisible(true);
    }

}

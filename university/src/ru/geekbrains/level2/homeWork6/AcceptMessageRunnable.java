package ru.geekbrains.level2.homeWork6;

import javax.swing.*;
import java.io.*;
import java.net.Socket;

public class AcceptMessageRunnable implements Runnable {

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public AcceptMessageRunnable(Socket socket) throws IOException {
        this.socket = socket;
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String message = reader.readLine();
                out.writeUTF(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ошибка отправки сообщения");
        }
    }
}

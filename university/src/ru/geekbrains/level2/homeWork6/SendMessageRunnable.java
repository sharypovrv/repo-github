package ru.geekbrains.level2.homeWork6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SendMessageRunnable implements Runnable {

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public SendMessageRunnable(Socket socket) throws IOException {
        this.socket = socket;
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = in.readUTF();
                if (message.equalsIgnoreCase("/end")) {
                    break;
                }
                System.out.println(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

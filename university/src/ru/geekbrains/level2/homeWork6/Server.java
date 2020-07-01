package ru.geekbrains.level2.homeWork6;

import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public void startServer() {

        try (ServerSocket serverSocket = new ServerSocket(8189)) {

            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            new Thread(new SendMessageRunnable(socket)).start();
            new Thread(new AcceptMessageRunnable(socket)).start();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Server().startServer();
    }

}

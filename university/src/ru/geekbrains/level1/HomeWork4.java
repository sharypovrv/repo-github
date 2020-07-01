package ru.geekbrains.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class HomeWork4 {
    /*

     */
    public static void main(String[] args) throws IOException {
        playTicTacToe();
    }

    static void playTicTacToe() throws IOException {
        int size = 5;
        int dotsToWin = 4;
        char[][] field = initField(size);
        char playerSign = 'X';
        char computerSign = 'O';
        String playerName = "Player";
        String computerName = "HAL3000";
        char currentSign = computerSign;
        String currentName = computerName;
        drawField(field);

        do {
            move(field, currentSign);

            if (!isWin(field, currentSign, dotsToWin)) {
                currentSign = currentSign == playerSign ? computerSign : playerSign;
                currentName = currentName == playerName ? computerName : playerName;
            } else {
                System.out.println(String.format("Congrats!!! The winner is %s", currentName));
                break;
            }
            if (isDraw(field)) {
                System.out.println("Friendship wins!");
                break;
            }

        } while (!isWin(field, currentSign, dotsToWin));

    }

    static char[][] initField(int size) {
        char[][] field = new char[size][size];
        int len = field.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                field[i][j] = '-';
            }
        }
        return field;
    }

    static void drawField(char[][] field) {
        int len = field.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    static void movePlayer(char[][] field) throws IOException {
        char playerSign = 'X';
        int size = field.length;
        int x;
        int y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print(String.format("Введите координату X [1 ... %s]: ", size));
            x = Integer.parseInt(reader.readLine()) - 1;
            System.out.print(String.format("Введите координату Y [1 ... %s]: ", size));
            y = Integer.parseInt(reader.readLine()) - 1;
        } while (!isCorrectCoordinates(field, x, y));

        field[x][y] = playerSign;
    }

    static void moveComputer(char[][] field) {
        char computerSign = 'O';
        int size = field.length;
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (!isCellEmpty(field, x, y));
        System.out.println(String.format("Computer moves [%s, %s]", x + 1, y + 1));
        field[x][y] = computerSign;
    }

    static void move(char[][] field, char sign) throws IOException {
        if (sign == 'X') {
            movePlayer(field);
        } else {
            moveComputer(field);
        }
        drawField(field);
    }

    static boolean isCorrectCoordinates(char[][]field, int x, int y) {
        int len = field.length;
        if (x >= 0 && x < len && y >= 0 && y < len && field[x][y] == '-') {
            return true;
        }
        return false;
    }

    static boolean isCellEmpty(char[][] field, int x, int y) {
        if (field[x][y] == '-') {
            return true;
        }
        return false;
    }

    static boolean isWin(char[][] field, char sign, int dotsToWin) {
        if (field.length == 5) {
            return isWinForFieldSize5(field, sign, dotsToWin);
        }
        return isWinForFieldSize3(field, sign);
    }

    static boolean isWinForFieldSize3(char[][] field, char sign) {
        for (int i = 0; i < field.length; i++) {
            if ((field[0][i] == sign) && (field[1][i] == sign) && (field[2][i] == sign)) {
                return true;
            }
            if ((field[i][0] == sign) && (field[i][1] == sign) && (field[i][2] == sign)) {
                return true;
            }
        }
        if ((field[0][0] == sign) && (field[1][1] == sign) && (field[2][2] == sign)) {
            return true;
        }
        if ((field[0][2] == sign) && (field[1][1] == sign) && (field[2][0] == sign)) {
            return true;
        }
        return false;
    }

    static boolean isWinForFieldSize5(char[][] field, char sign, int dotsToWin) {
        int size = field.length;
        boolean result = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < dotsToWin; j++) {
                result = result && field[i][j] == sign;
            }
            if (result) return true;
            result = true;
        }
        return false;
    }

    static boolean isDraw(char[][] field) {
        int len = field.length;
        int emptyCount = len * len;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (field[i][j] != '-') emptyCount -= 1;
            }
        }
        if (emptyCount == 0) return true;
        return false;
    }

}

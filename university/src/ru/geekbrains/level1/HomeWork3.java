package ru.geekbrains.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeWork3 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println("Поиграем?\n1 - отгадай число\n2 - отгадай слов\n3 - выход");
            int answer = Integer.parseInt(reader.readLine());
            if (answer == 1) {
                playGuessNumber();
            } else if (answer == 2) {
                playGuessWord();
            } else if (answer == 3) {
                break;
            }
        }
    }

    static void playGuessNumber() throws IOException {
        boolean isPlay = true;
        do {
            guessNumber();
            while (true) {
                System.out.println("Повторить игру еще раз? 1 - да, 0 - нет. Введите ваш ответ: ");
                int answerIsRepeatPlay = Integer.parseInt(reader.readLine());
                if (answerIsRepeatPlay == 0) {
                    isPlay = false;
                    break;
                } else if (answerIsRepeatPlay == 1) {
                    break;
                } else {
                    System.out.println("Пожалуйста, введите 1 или 0:");
                }
            }
            System.out.println();
        } while (isPlay);

    }

    static void guessNumber() throws IOException {
        int number = (int) (Math.random() * 10);
        int count = 1;
        int attemptCount = 3;
        int attemptNumber;

        while (count <= attemptCount) {
            System.out.println("Попробуйте отгадать число от 0 до 9. Оставшееся количество попыток - " + (attemptCount - count + 1));
            attemptNumber = Integer.parseInt(reader.readLine());
            if (attemptNumber > number) {
                System.out.println("Загаданное число меньше");
            } else if (attemptNumber < number) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
            if (count == attemptCount) System.out.println("К сожалению, Вы проиграли.");
            count++;
        }
    }

    static void playGuessWord() throws IOException {
        String[] words = new String[]
                {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        String puzzlesWord = words[(int) (Math.random() * words.length)]; // загадываем слово
        char[] message = new char[15];
        Arrays.fill(message, '#'); // сообщение-подсказка на экран
        boolean isGuess = false;

        do {
            System.out.println("Попробуйте отгадать слово:");
            String attemptWord = reader.readLine();

            if (attemptWord.equals(puzzlesWord)) {
                System.out.println("Вы угадали!");
                isGuess = true;
            } else {
                for (int i = 0; i < 14; i++) {
                    if (i < attemptWord.length() && i < puzzlesWord.length()) {
                        if (attemptWord.charAt(i) == puzzlesWord.charAt(i)) {
                            message[i] = puzzlesWord.charAt(i);
                        }
                    }
                    System.out.print(message[i]);
                }
                System.out.println();
            }
        } while (!isGuess);

    }

}

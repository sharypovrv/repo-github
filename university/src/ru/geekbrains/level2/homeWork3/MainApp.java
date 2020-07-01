package ru.geekbrains.level2.homeWork3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MainApp {

    public static void main(String[] args) {

        /**
         * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
         * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
         * Посчитать сколько раз встречается каждое слово.
         *
         * 2. Написать простой класс ТелефонныйСправочник,
         * который хранит в себе список фамилий и телефонных номеров.
         * В этот телефонный справочник с помощью метода add() можно добавлять записи.
         * С помощью метода get() искать номер телефона по фамилии.
         * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
         * тогда при запросе такой фамилии должны выводиться все телефоны.
         */

        taskOne();

//        taskTwo();


    }

    static void taskOne() {
        String[] words = new String[] {
                "apple", "orange", "tomato", "potato", "apple", "potato", "space", "cosmos", "computer", "space"
        };

        printWords(words);
        printUniqueWords(words);
    }

    static void taskTwo() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Roman", "+79995556644");
        phoneBook.add("Artem", "+79995550011");
        phoneBook.add("Oleg", "+79995552233");
        phoneBook.add("Vladimir", "+79995558899");
        phoneBook.add("Roman", "+79995557777");

        for (String name : phoneBook.getNames()) {
            System.out.print(name + " = ");
            System.out.println(phoneBook.get(name));
        }
    }

    static void printWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }

    static void printUniqueWords(String[] words) {
//        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));
//
//        int count = 0;
//
//        for (String uniqueWord : uniqueWords) {
//            for (int i = 0; i < words.length; i++) {
//                if (words[i].equals(uniqueWord)) {
//                    count++;
//                }
//            }
//            System.out.println(String.format("Слово \"%s\" встречается %s раз.", uniqueWord, count));
//            count = 0;
//        }

        Map<String, Integer> uniqueWords = new HashMap<>();
        int count = 1;
        for (int i = 0; i < words.length; i++) {
            if (uniqueWords.containsKey(words[i])) {
                count++;
            }
            uniqueWords.put(words[i], count);
            count = 1;
        }

        for (String str : uniqueWords.keySet()) {
            System.out.println(String.format("Слово \"%s\" встречается %s раз.", str, uniqueWords.get(str)));
        }

    }

}

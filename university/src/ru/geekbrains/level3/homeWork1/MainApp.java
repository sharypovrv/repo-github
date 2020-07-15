package ru.geekbrains.level3.homeWork1;

import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {

        Integer[] arrayInt = new Integer[] {1, 2, 3, 4, 5};
        String[] arrayStr = new String[] {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
        TestGeneric<Integer> test1 = new TestGeneric<>(arrayInt);
        TestGeneric<String> test2 = new TestGeneric<>(arrayStr);

        printIntArray(arrayInt);
        printStrArray(arrayStr);

        test1.changeTwoElements(2, 4);
        test2.changeTwoElements(2, 4);

        printIntArray(arrayInt);
        printStrArray(arrayStr);

        ArrayList<Integer> arr1 = test1.toArrayList();
        ArrayList<String> arr2 = test2.toArrayList();

        System.out.println(arr1.getClass().getName());
        System.out.println(arr2.getClass().getName());

    }

    public static void printIntArray(Integer[] arr) {
        for (Integer element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printStrArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}

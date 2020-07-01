package ru.geekbrains.level2.homeWork2;

public class MainHomeWork2 {

    /**
     * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
     * при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
     * <p>
     * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
     * Если в каком-то элементе массива преобразование не удалось
     * (например, в ячейке лежит символ или текст вместо числа),
     * должно быть брошено исключение MyArrayDataException,
     * с детализацией в какой именно ячейке лежат неверные данные.
     * <p>
     * 3. В методе main() вызвать полученный метод,
     * обработать возможные исключения MySizeArrayException и MyArrayDataException,
     * и вывести результат расчета.
     */

    public static void main(String[] args) {

        String[][] arr1 = {
                {"a", "b", "c", "d", "e"},
                {"a", "b", "c", "d", "e"},
                {"a", "b", "c", "d", "e"},
                {"a", "b", "c", "d", "e"},
                {"a", "b", "c", "d", "e"},
        };

        try {
            printIntArray(arr1);
        } catch (MyArraySizeException e) {
            System.out.println("Array size should be 4x4.");
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        String[][] arr2 = {
                {"1", "1", "1", "1"},
                {"1", "1", "Oops!", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", ""},
        };

        try {
            printIntArray(arr2);
        } catch (MyArraySizeException e) {
            System.out.println("Array size should be 4x4.");
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    static void printIntArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException("Array size should be 4x4.");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    int data = Integer.parseInt(arr[i][j]);
                    sum += data;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            String.format("There is no number in cell [%s, %s]", (i + 1), (j + 1)));
                }
            }
        }

        System.out.println(String.format("Sum = %s", sum));
    }


}

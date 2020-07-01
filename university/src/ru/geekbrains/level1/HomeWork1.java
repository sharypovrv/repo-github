package ru.geekbrains.level1;

import java.io.IOException;

public class HomeWork1 {

    /*
    1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
     */
    public static void main(String[] args) throws IOException {

    }

    /*
    2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
     */
    byte byteExample = 54;
    short shortExample = -80;
    int intExample = 0;
    long longExample = 50000L;
    double doubleExample = 5.150d;
    float floatExample = -4.555f;
    boolean booleanExample = false;
    char charExample = 'r';

    /*
    3. Написать метод вычисляющий выражение a * (b + (c / d))
    и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    */
    public double mathExample(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    /*
    4. Написать метод, принимающий на вход два числа,
    и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false;
    */
    public boolean isTeen(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) return true;
        return false;
    }

    /*
    5. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    Замечание: ноль считаем положительным числом.
    */
    public void printNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    /*
    6. Написать метод, которому в качестве параметра передается целое число,
    метод должен вернуть true, если число отрицательное;
    */
    public boolean isNegative(int a) {
        return a < 0;
    }

    /*
    7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    */
    public void printHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /*
    8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */
    public static boolean isLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }


}

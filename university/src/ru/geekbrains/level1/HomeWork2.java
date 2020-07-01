package ru.geekbrains.level1;

public class HomeWork2 {

    public static void main(String[] args) {
//        taskOneChangeZeroOne();
//        taskTwo();
//        taskThree();
//        taskFour();
//        taskFive();
//
//        for (int i = 0; i < 10; i++) {
//            taskSix();
//        }
        taskSeven();

    }

    public static void printArray(int[] arr) {
        if (arr.length == 0) System.out.print("В массиве нет элементов.");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    

    //задание №1
    public static void taskOneChangeZeroOne() {
        System.out.println("Задание №1:");
        int[] arr = {1,0, 1, 0, 0, 1, 0, 0, 0, 0};
        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }

        printArray(arr);
    }

    //задание №2
    public static void taskTwo() {
        System.out.println("Задание №2:");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        printArray(arr);
    }

    //задание №3
    public static void taskThree() {
        System.out.println("Задание №3:");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
        printArray(arr);
    }

    //задание №4
    public static void taskFour() {
        System.out.println("Задание №4:");
        int a = 7;
        int[][] arr = new int[a][a];
        System.out.println("Пустой массив:");
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || (i + j) == arr.length - 1) arr[i][j] = 1;
            }
        }
        System.out.println("Массив с единицами в диагоналях:");
        printArray(arr);
    }

    //задание №5
    public static void taskFive() {
        System.out.println("Задание №5:");
        int[] arr = new int[20];
        int min, max;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        printArray(arr);
        min = arr[0];
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Min = " + min + "; Max = " + max);
    }

    //задание №6
    public static void taskSix() {
        System.out.println("Задание №6:");
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 5);
        }
        printArray(arr);
        System.out.println(haveEqualParts(arr));
    }

    //метод к заданию №6
    public static boolean haveEqualParts(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 == 0 || arr.length == 1 || arr.length == 0) {
            int halfSum = sum / 2;
            sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if (halfSum == sum) return true;
            }
        }
        return false;
    }

    //задание №7
    public static void taskSeven() {
        System.out.println("Задание №7:");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        printArray(arr);
        int n = -2;
        System.out.println(n);
        displayArrayEasy(arr, n);
        displayArray(arr, n);
        printArray(arr);
    }

    //метод к заданию №7 (сложный)
    //не успел дописать, даже с помощью Google
    public static void displayArray(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            int t = arr[i];

        }
    }

    //метод к заданию №7 (легкий)
    //сделал без Гугла :)
    public static void displayArrayEasy(int[] arr, int n) {
        int b[] = new int[arr.length];
        if (n >= 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i >= arr.length - n) {
                    b[i + n - arr.length] = arr[i];
                } else {
                    b[i + n] = arr[i];
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i + n >= 0) {
                    b[i + n] = arr[i];
                } else {
                    b[arr.length + n + i] = arr[i];
                }
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = b[i];
//        }
        printArray(b);
    }

}

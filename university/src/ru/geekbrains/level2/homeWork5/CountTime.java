package ru.geekbrains.level2.homeWork5;

public class CountTime {

    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];
    float[] a1 = new float[h];
    float[] a2 = new float[h];

    public void calc() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        Thread t = new Thread(new CalculateRunnable(arr));

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long b = System.currentTimeMillis();
        System.out.println(String.format("time of calc = %s", (b - a)));
    }

    public void multiCalc() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread t1 = new Thread(new CalculateRunnable(a1));
        Thread t2 = new Thread(new CalculateRunnable(a2));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        long b = System.currentTimeMillis();
        System.out.println(String.format("time of multiCalc = %s", (b - a)));
    }

}

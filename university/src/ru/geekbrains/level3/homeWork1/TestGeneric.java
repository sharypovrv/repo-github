package ru.geekbrains.level3.homeWork1;

import java.util.ArrayList;

public class TestGeneric<T> {

    private T[] array;
    private ArrayList<T> arrayList;

    public TestGeneric(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void changeTwoElements(int i1, int i2) {

        try {
            T temp = array[i2 - 1];
            array[i2 - 1] = array[i1 - 1];
            array[i1 - 1] = temp;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indexes are not in array.");
        }
    }

    public ArrayList<T> toArrayList() {
        arrayList = new ArrayList<>();
        for (T element : array) {
            arrayList.add(element);
        }
        return arrayList;
    }

}

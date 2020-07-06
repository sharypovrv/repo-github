package ru.geekbrains.level2.homeWork7;

public class DataStructure {

    public static void main(String[] args) {

        DirectionalList twoDirectionalList = new TwoDirectionalList();
        twoDirectionalList.add("val1");
        twoDirectionalList.add("val2");
        twoDirectionalList.add("val3");
        twoDirectionalList.add("val4");

        twoDirectionalList.printList();

        System.out.println("Size: " + twoDirectionalList.size());

        System.out.println("Removed? - " + twoDirectionalList.remove("val6"));
        System.out.println("Removed? - " + twoDirectionalList.remove("val3"));

        twoDirectionalList.printList();

    }

}

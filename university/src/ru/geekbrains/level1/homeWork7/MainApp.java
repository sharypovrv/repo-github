package ru.geekbrains.level1.homeWork7;

public class MainApp {

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Барсик№" + (i + 1), (int) (Math.random() * 10 + 1));
        }

        Plate plate = new Plate(10);
        plate.info();
        plate.increaseFood(10);
        plate.info();
        System.out.println();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].printIsFed();
            plate.info();
            System.out.println();
        }

    }

}

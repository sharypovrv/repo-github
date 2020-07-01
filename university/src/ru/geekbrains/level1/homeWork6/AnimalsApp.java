package ru.geekbrains.level1.homeWork6;

public class AnimalsApp {

    public static void main(String[] args) {

        Dog dog = new Dog("Шарик");
        dog.run(150);
        dog.jump(1);
        dog.swim(7);

        Cat cat = new Cat("Мурзик");
        cat.run(100);
        cat.jump(1.8);
        cat.swim(5);

        Dog dog2 = new Dog("Рекс", 400);
        dog2.run(500);

        Dog dog3 = new Dog("Хатико", 600);
        dog3.run(500);

    }

}

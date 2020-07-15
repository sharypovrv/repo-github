package ru.geekbrains.level3.homeWork1.task3;

public class MainApplication {

    public static void main(String[] args) {

        Box<Apple> boxOfApple = new Box<>();
        Box<Orange> boxOfOrange = new Box<>();
        Box<Orange> boxOfOrange2 = new Box<>();

        for (int i = 0; i < 9; i++) {
            boxOfApple.addFruit(new Apple());
        }
        for (int i = 0; i < 6; i++) {
            boxOfOrange.addFruit(new Orange());
        }
        for (int i = 0; i < 3; i++) {
            boxOfOrange2.addFruit(new Orange());
        }

        System.out.println("Weight of box of apple = " + boxOfApple.getWeight());
        System.out.println("Weight of box of orange = " + boxOfOrange.getWeight());
        System.out.println("Weight of another box of orange = " + boxOfOrange2.getWeight());

        System.out.println(boxOfApple.compare(boxOfOrange));
        System.out.println(boxOfApple.compare(boxOfOrange2));

        boxOfOrange.pourAllToAnotherBox(boxOfOrange2);

        System.out.println("Weight of box of apple = " + boxOfApple.getWeight());
        System.out.println("Weight of box of orange = " + boxOfOrange.getWeight());
        System.out.println("Weight of another box of orange = " + boxOfOrange2.getWeight());

    }

}

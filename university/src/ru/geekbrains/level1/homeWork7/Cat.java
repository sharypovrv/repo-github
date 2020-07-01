package ru.geekbrains.level1.homeWork7;

public class Cat {

    private String name;
    private int appetite;
    private boolean isFed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFed = false;
        System.out.printf("Создан кот с именем %s и с аппетитом %s\n", this.name, this.appetite);
    }

    public void eat (Plate plate) {
        int foodInPlate = plate.getFood();
        if (foodInPlate == 0) {
            System.out.println("Тарелка пуста");
            System.out.println(String.format("Кот %s с аппетитом %s не может есть из тарелки.", name, appetite));
        } else if (foodInPlate >= appetite) {
            isFed = true;
            System.out.println(String.format("Кот %s съел из тарелки: %s", name, appetite));
            plate.decreaseFood(appetite);
        } else {
            System.out.println(String.format("Кот %s с аппетитом %s не может есть из тарелки.", name, appetite));
        }
    }

    public void printIsFed() {
        System.out.println(String.format("У кота %s сытость - %b", name, isFed));
    }

}

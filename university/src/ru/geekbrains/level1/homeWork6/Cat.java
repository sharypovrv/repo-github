package ru.geekbrains.level1.homeWork6;

public class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
        System.out.println("Кот: " + name);
    }

    @Override
    public void run(double length) {
        boolean isRun = length <= 200;
        System.out.println("run: " + isRun);
    }

    @Override
    public void swim(double length) {
        boolean isSwim = false;
        System.out.println("swim: " + isSwim);
    }

    @Override
    public void jump(double length) {
        boolean isJump = length <= 2;
        System.out.println("jump: " + isJump);
    }

}

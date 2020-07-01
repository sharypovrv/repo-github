package ru.geekbrains.level1.homeWork6;

public class Dog extends Animal {
    double runningLength;

    public Dog(String name) {
        this.name = name;
        System.out.println("Собака: " + name);
    }

    public Dog(String name, double runningLength) {
        this.name = name;
        this.runningLength = runningLength;
        System.out.println(String.format("Собака: %s с ограничением скорости бега %s", name, runningLength));
    }

    @Override
    public void run(double length) {
        boolean isRun = false;
        if (runningLength == 0) {
            isRun = length <= 500;
        } else {
            isRun = length <= runningLength;
        }
        System.out.println("run: " + isRun);
    }

    @Override
    public void swim(double length) {
        boolean isSwim = length <= 10;
        System.out.println("swim: " + isSwim);
    }

    @Override
    public void jump(double length) {
        boolean isJump = length <= 0.5d;
        System.out.println("jump: " + isJump);
    }

}

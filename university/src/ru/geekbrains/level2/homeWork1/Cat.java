package ru.geekbrains.level2.homeWork1;

public class Cat implements Participant{

    int runLength = 0;
    double jumpHeight = 0;

    public Cat(int runLength, double jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run(int runLength) {
        if (this.runLength >= runLength) {
            System.out.println("Cat is running.");
        } else {
            System.out.println("Cat is not running.");
        }
    }

    @Override
    public void jump(double jumpHeight) {
        if (this.jumpHeight >= jumpHeight) {
            System.out.println("Cat is jumping.");
        } else {
            System.out.println("Cat is not jumping.");
        }
    }

}

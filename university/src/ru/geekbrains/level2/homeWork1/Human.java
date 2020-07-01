package ru.geekbrains.level2.homeWork1;

public class Human implements Participant{

    int runLength = 0;
    double jumpHeight = 0;

    public Human(int runLength, double jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run(int runLength) {
        if (this.runLength >= runLength) {
            System.out.println("Human is running.");
        } else {
            System.out.println("Human is not running.");
        }
    }

    @Override
    public void jump(double jumpHeight) {
        if (this.jumpHeight >= jumpHeight) {
            System.out.println("Human is jumping.");
        } else {
            System.out.println("Human is not jumping.");
        }
    }

}

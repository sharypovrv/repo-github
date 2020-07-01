package ru.geekbrains.level2.homeWork1;

public class Robot implements Participant{

    int runLength = 0;
    double jumpHeight = 0;

    public Robot(int runLength, double jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run(int runLength) {
        if (this.runLength >= runLength) {
            System.out.println("Robot is running.");
        } else {
            System.out.println("Robot is not running.");
        }
    }

    @Override
    public void jump(double jumpHeight) {
        if (this.jumpHeight >= jumpHeight) {
            System.out.println("Robot is jumping.");
        } else {
            System.out.println("Robot is not jumping.");
        }
    }

}

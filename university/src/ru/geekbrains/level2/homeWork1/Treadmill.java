package ru.geekbrains.level2.homeWork1;

public class Treadmill implements Obstacle{

    int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void pass(Participant participant) {
        participant.run(length);
    }

}

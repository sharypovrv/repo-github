package ru.geekbrains.level2.homeWork1;

public class Wall implements Obstacle {

    double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public void pass(Participant participant) {
        participant.jump(height);
    }

}

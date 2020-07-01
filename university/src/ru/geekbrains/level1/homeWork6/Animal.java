package ru.geekbrains.level1.homeWork6;

public class Animal {
    String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Животное: " + name);
    }

    public void run(double length) {
        System.out.println("Животное побежало.");
    }

    public void swim(double length) {
        System.out.println("Животное поплыло.");
    }

    public void jump(double length) {
        System.out.println("Животное подпрыгнуло.");
    }



}

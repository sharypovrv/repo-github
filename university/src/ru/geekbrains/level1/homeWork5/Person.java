package ru.geekbrains.level1.homeWork5;

public class Person {

    private String name;
    private String position;
    private String emailAddress;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String name, String position, String emailAddress, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printPersonInfo() {
        System.out.println("Сотрудник - " + name +
                ". Должность - " + position +
                ". Адрес email - " + emailAddress +
                ". Телефон - " + phoneNumber +
                ". Зарплата - " + salary +
                ". Возраст - " + age
                );
    }


}

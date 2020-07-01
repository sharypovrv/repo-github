package ru.geekbrains.level1.homeWork5;

public class HomeWork5 {

    public static void main(String[] args) {

        Person[] personArray = new Person[5];
        personArray[0] = new Person("Роман", "Инженер", "info@mail.ru", "85556352659", 50000, 27);
        personArray[1] = new Person("Никита", "Менеджер", "info2@mail.ru", "85555632489", 60000, 45);
        personArray[2] = new Person("Иван", "Маркетолог", "info3@mail.ru", "85551234567", 70000, 20);
        personArray[3] = new Person("Елена", "Андеррайтер", "info4@mail.ru", "85557654321", 85000, 75);
        personArray[4] = new Person("Татьяна", "Переводчик", "info5@mail.ru", "85551112233", 30000, 33);

        for (Person person : personArray) {
            if (person.getAge() > 40) {
                person.printPersonInfo();
            }
        }

    }

}

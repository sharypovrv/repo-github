package ru.geekbrains.level2.homeWork3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private Map<String, HashSet<String>> map = new HashMap<>() {};

    public void add(String name, String phoneNumber) {
        if (map.containsKey(name)) {
            map.get(name).add(phoneNumber);
        } else {
            HashSet<String> number = new HashSet<>();
            number.add(phoneNumber);
            map.put(name, number);
        }
    }

    public Set<String> getNames() {
        return map.keySet();
    }

    public String get(String name) {
        if (map.containsKey(name)) {
            return map.get(name).toString();
        }
        return null;
    }

}

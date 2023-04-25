package ru.job4j.generics;

public class Tiger extends Predator {
    private final int age;

    public Tiger(String habitat, String area, int age) {
        super(habitat, area);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Tiger{"
                + "age=" + age
                + '}';
    }
}
